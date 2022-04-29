<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 페이지</h1>
	<form action="insert" method="post">
		<p>
			<input type="text" name="email" placeholder="이메일">
		<p>
			<input type="text" name="name" placeholder="이름">
		<p>
			<input type="password" name="pass" placeholder="비밀번호">
		<p>
			<button type="submit">전송</button>
		</p>
	</form>
</body>
</html>