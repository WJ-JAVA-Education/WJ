const mongoose = require('mongoose');
const bcrypt = require('bcrypt');
const saltRounds = 10;
const jwt = require('jsonwebtoken');


const userSchema = mongoose.Schema({
  name: {
    type: String,
    maxlength: 50
  },
  email: {
    type: String,
    trim: true,
    unique: 1
  },
  password: {
    type: String,
    minlength: 5
  },
  lastname: {
    type: String,
    maxlength: 50
  },
  role: {
    type: Number,
    default: 0
  },
  
  image: String,

  token: {
    type: String
  },
  tokenExp: {
    type: Number
  }

})

userSchema.pre('save', function(next){
  var user = this;
  if(user.isModified('password')){
    // 비밀번호를 암호화 시킨다.
    bcrypt.genSalt(saltRounds, function(err, salt){
      if (err) return next(err)
        bcrypt.hash(user.password, salt, function(err, hash){
          if (err) return next(err)
          user.password = hash
          next()
        })
    })
  } else{
    next() // 비밀번호가 아닌 다른 변경사항이 있을 때 다시 암호화를 하지 않도록 한다.
  }
})

userSchema.methods.comparePassword = function(plainPassword, cb){
  //plainPassword 1234567 데이터베이스에 있는 암호화 된 비밀번호
  bcrypt.compare(plainPassword, this.password, function(err, isMatch){
    if (err) return cb(err),
    cb(null,isMatch)
  })
}

userSchema.methods.generateToken = function(cb){
var user = this;

  // jsonwebtoken 을 이용하여 웹토큰 만들기
  var token = jwt.sign(user._id.toHexString(),'WJTOKEN')

  // 몽고DB의 _id와 토큰을 더하여 토큰을 만들고 그 토큰을 id로 사용한다.
  // user._id + 'secretToken' = token -> 'secretToken' -> user._id
  user.token = token
  user.save(function(err, user){
    if(err) return cb(err),
    cb(null,user)
  })
}


const User = mongoose.model('User', userSchema)

module.exports = { User }
