//引入express
const express = require('express')
const app = express();

const bodyParser = require('body-parser')

//处理post请求
app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

// 允许跨域
app.all('*', function(req, res, next) {
  // res.header("Access-Control-Allow-Origin", req.headers.origin);
  res.header("Access-Control-Allow-Origin", '*');
  res.header("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
  res.header("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");
  // res.header("Access-Control-Allow-Credentials","true");
  res.header("X-Powered-By",' 3.2.1')
  if(req.method === "OPTIONS") res.sendStatus(200);/*让options请求快速返回*/
  else  next();  //next放行
});


app.use((request,response,next) => {  //服务器被访问就会触发
  if (request.method == "GET"){
    console.log("有人发起了GET请求，携带参数为：",request.query);
  }
  if (request.method == "POST"){
    console.log("有人发起了POST请求，携带参数为：",request.body);
  }
  next()  //next放行
})

//处理get请求
app.get("/get/students",(request , response) => {  //students为请求路径
  const students = [
    {id:"001",name:"zhangsan",age:18},
    {id:"002",name:"wangwu",age:19},
    {id:"003",name:"zhaoliu",age:28},
  ]
  response.send(students)
})

//处理post请求
app.post("/post/students",(request , response) => {  //students为请求路径
  const students = [
    {id:"001",name:"zhangsan",age:18},
    {id:"002",name:"wangwu",age:19},
    {id:"003",name:"zhaoliu",age:28},
  ]
  response.send(students)
})


app.listen(5000 , (error) => { //处理异常
  if (!error) {
  console.log("服务器成功启动，请求地址为：http://localhost:5000/get/students");
}
})
