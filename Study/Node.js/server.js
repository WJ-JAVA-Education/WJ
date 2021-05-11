const express = require('express');
const mongoose = require('mongoose');
const dbUrl = 'mongodb://@127.0.0.1:27017/NodeJS';
const app = express();

const connect = () => {
  if (process.env.NODE_ENV !== 'production') {
      mongoose.set('debug', true);
  }
  mongoose.connect(dbUrl, {
      dbName: 'NodeJS',
      useNewUrlParser: true,
      useCreateIndex: true,
  }, (err) => {
      if (err) {
          console.error('몽고디비 연결 에러', err);
      } else {
          console.log('몽고디비 연결 성공');
      }
  });
};
mongoose.connection.on('error', (err) => {
  console.error('몽고디비 연결 에러', err);
});
mongoose.connection.on('disconnected', () => {
  console.error('몽고디비 연결이 끊겼습니다. 연결을 재시도합니다.');
  connect();
});

module.exports = connect;



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