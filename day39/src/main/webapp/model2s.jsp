<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력하는 JSP</h1>
	<p>model1 은 JSP 로 입력 => 서블릿으로 처리 => JSP 로 출력</p>
	<form action="/day39/sogae" method="post">
		<input type="text" name="name" value="홍길동">
		<button>넘기기</button>
	</form>
</body>
</html>