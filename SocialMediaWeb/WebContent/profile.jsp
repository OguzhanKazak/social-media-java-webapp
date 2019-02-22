<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/design/css/header.css" />
<title>Insert title here</title>
</head>
<body>
<%@ include file="structure/profileheader.jsp"%>
  <div>
  	<a>${sessionScope.UserLoginData.geteMail()}</a></br>
  	<a>${sessionScope.UserLoginData.getBirthDate()}</a></br>
  	<a>${sessionScope.UserLoginData.getSex()}</a></br>
  </div>
<%@ include file="structure/footer.jsp"%>
</body>
</html>