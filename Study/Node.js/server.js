const express = require('express');
const app = express();

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