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
<div class="header">
	  <a href="#default" class="logo">CompanyLogo</a>
	</div> 
	<div>
	  <form method="post" action="${pageContext.request.contextPath}/adduser">
		<table>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" value=""></td>
			</tr>
			<tr>
				<td>surname</td>
				<td><input type="text" name="surname" value=""></td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td><input type="date" name="birthdate" value=""></td>
			</tr>
			<tr>
				<td>
   					<input type="radio" name="sex" value="MALE"> Male<br>
 					<input type="radio" name="sex" value="FEMALE"> Female<br>
 					<input type="radio" name="sex" value="NON_GIVEN"> Not Specified
 				</td>
  			
			</tr>
			<tr>
				<td><input id="submit" type="submit" name="signup" value="Sign Up"></td>
			</tr>
		</table>
	  </form>
	  </div>
</body>
</html>