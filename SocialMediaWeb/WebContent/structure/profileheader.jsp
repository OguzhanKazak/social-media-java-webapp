<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div class="header">
  <a class="logo">Profile Picture</a>
  <div class="header-right">
    <a class="active" href="home.jsp">Home</a>
    <a>${sessionScope.UserLoginData.getName()} ${sessionScope.UserLoginData.getSurname()}</a>
    <a href="logout">Logout</a>
  </div>
</div> 