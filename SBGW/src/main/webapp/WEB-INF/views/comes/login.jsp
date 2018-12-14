<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<style>
      *{
        margin: 0 auto;
      }
      body{
        background:#cccccc;
      }
      .loginForm{
        width:400px;
        height:400px;
        background:white;
        margin-top:100px;
      }
      .loginTab{
        width:400px;
        height:50px;
        line-height:50px;
        text-align:center;
        border-bottom:1px solid #cccccc;
      }
      .tab{
        width:200px;
        float:left;
        background:white;
        height:50px;
      }
      .tab:nth-of-type(2){
        background:#dddddd;
      }
      .loginInput{

      }
      .inputBox{
        background:#dddddd;
        height:50px;
        width:300px;
        border-radius:10px;
        margin-bottom:25px;
      }
      .inputBox>div>input{
        width:280px;
        padding:10px;
        border:none;
        margin-left:10px;
        height:40px;
        margin-top:5px;
        background:#dddddd;
      }
      .inputCover{
        width:300px;
        height:150px;
        margin-top:60px;
      }
      .loginEx{
        width:400px;
        margin-top:30px;
      }
      .loginBtn>input{
        width:300px;
        height:50px;
        margin-left:50px;
        border:none;
        background:skyblue;
        color:white;
        font-size:1.5em;
        border-radius:10px;
      }
      .findPwd{
        float:right;
        font-size:0.8em;
        margin-top:5px;
        margin-right:50px;
      }
    </style>
<body>


  <div class="loginForm">
      <div class="loginTab">
        <div class="tab">임직원</div>
        <div class="tab">관리자</div>
      </div>
      <form action="<%=request.getContextPath()%>/comes/login44" method="post">
      <div class="loginInput">
        <div class="inputCover">
          <div class="inputBox">
            <div><input type="text" placeholder="아이디" name="id"></div>
          </div>
          <div class="inputBox">
            <div><input type="password" placeholder="패스워드" name="pwd"></div>
          </div>
        </div>
        <div class="loginEx">
          <div class="loginBtn">
            <input type="submit" value="로그인">
          </div>
              <div>패스워드 찾기</div>
          </div>
          <div class="findPwd">
        </div>
      </div>
          </form>
    </div>


</body>
</html>