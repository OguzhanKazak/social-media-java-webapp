<%@page import="java.io.Writer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/design/javascript/ValidateEmptyInput.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/design/javascript/ValidatePassword.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/design/javascript/ValidateMail.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/design/css/header.css" />
<title>Sign Up</title>
</head>
<body>
<div class="header">
	  <a href="#default" class="logo">CompanyLogo</a>
	</div> 
	<div>
	  <form method="post" action="${pageContext.request.contextPath}/signup" onsubmit="return !!(validatePassword() & validateMail());">
		<table>
			<tr>
				<td>E-mail</td>
				<td><input id="email" type="text" name="mail" value=""></td>
				<td><a id="mailerror"></a></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input id="password" type="password" name="password" value=""></td>
				<td><a id="passworderror"></a></td>
			</tr>
			<tr>
				<td><input id="submit" type="submit" name="signup" value="Sign Up"></td>
			</tr>
		</table>
	  </form>
	  </div>
</body>
</html>