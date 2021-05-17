const express = require('express');
const mongoose = require('mongoose');
const dbUrl = '';
const app = express();
const bodyParser = require('body-parser');
const cookieParser = require('cookie-parser');
const { User } = require("./models/User");

const config = require('./config/key')

app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());
app.use(cookieParser());

mongoose.connect(config.mongoURI,{
  useNewUrlParser: true, 
  useUnifiedTopology: true, 
  useCreateIndex: true, 
  useFindAndModify: false
}).then(() => console.log('몽고디비 연결 성공!'))
.catch(err => console.log(err));

app.use(express.static(__dirname + '/css'));

app.listen(80 , function(){
  console.log('listening on 80')
});

app.post('/register', (req,res) => {
  const user = new User(req.body)
    user.save((err, userInfo) => {
      if (err) return res.json({ success: false, err})
      return res.status(200).json({
        success: true
      })
    })
});

app.post('/login', (req, req)=>{

// 요청된 이메일을 데이터베이스에서 있는지 찾는다.
  User.findOne({ email: req.body.email }, (err, user) =>{
    if(!user){
      return res.json({
        loginSuccess: false,
        message: "제공된 이메일에 해당하는 유저가 없습니다."
      })
    }
    // 요청된 이메일이 데이터 베이스에 있다면 비밀번호가 맞는 번호인지 확인.
    user.comparePassword( req.body.comparePassword, (err, isMatch) => {
      if(!isMatch)
      return res.json({ loginSuccess: false, message: "비밀번호가 틀렸습니다."})
      // 비밀번호 까지 맞다면 토큰을 생성하기.
      user.generateToken((err, user){
      if(err) return res.status(400).send(err);
        // 토큰을 저장한다. (쿠키 , 로컬)
        res.cookie("x_auth", user.token)
        .status(200)
        .json({loginSuccess: true, userId: user._id})
      })
    })    
  })
})

app.get('/pet' , function(req,res){
  res.send('펫용품을 쇼핑 할 수 있는 사이트 입니다.');
});

app.get('/beauty' , function(req,res){
  res.send('뷰티용품을 쇼핑 할 수 있는 사이트 입니다.');
});

app.get('/' , function(req,res){
  res.sendFile(__dirname + '/TODOAPP/index.html')
});

app.get('/write' , function(req,res){
  res.sendFile(__dirname + '/TODOAPP/write.html')
});