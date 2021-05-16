const express = require('express');
const mongoose = require('mongoose');
const dbUrl = 'mongodb+srv://root:1234@wooj.fynod.mongodb.net/myFirstDatabase?retryWrites=true&w=majority';
const app = express();

mongoose.connect(dbUrl,{
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