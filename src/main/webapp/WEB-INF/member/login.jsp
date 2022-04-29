<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%-- <link rel="stylesheet" href="<%=request.getContextPath() %>/css/login.css"> --%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	<p>${msg}</p>
	<form action ="insert" method="post">
		<p>
			<input type="text" name="email" placeholder="email">
		</p>
		<p>
			<input type="password" name="password" placeholder="password">
		</p>
		<button type="submit" value="로그인">로그인</button>
	</form>
</body>
</html>