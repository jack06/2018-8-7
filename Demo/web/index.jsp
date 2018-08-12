<%--
  Created by IntelliJ IDEA.
  User: AAA
  Date: 2018/8/12
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script>
      function request() {
         var data=new XMLHttpRequest();
         console.log(data);
      }
      function reqerr() {
          console.log('Fetch Error : %S', err);
      }
      //使用XMLHttpRequest来实现改功能需要设置两个监听函数，
      // 分别用来处理成功和失败的情况，同时还需要依次调用open()和send()方法才能实现请求
      var xm=new XMLHttpRequest();
      xm.onload=request();
      xm.onerror=reqerr();
      xm.open('get','demo.jsp',true);
      xm.send();

      //在将响应的文本信息转换成JSON格式前，需要先确保响应的状态码为200。
      //请求后返回的响应是一个stream对象，这就意味着我们在调用json()方法后会返回一个Promise，
      // 因为读取stream的过程是异步操作的。
      fetch();
      fetch('demo.jsp').then(function (value) {
          if(value.status !=200){
              console.log('错误'+value.status);
              return;
          }
          value.json().then(function (data) {
              console.log(data);
          });
      }).catch(function (err) {
          console.log('Fetch Error :%S',err)
      })
    </script>
  </head>
  <body>
  $END$
  </body>
</html>
