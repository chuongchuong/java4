<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Lab1_JAVA4/bai2" method="post">
<p>Chieu dai <input type="text"  name="txtA" value="${setA} "></p>
<p>Chieu rong <input type="text" name="txtB"  value="${setB}"></p>

<button formaction="/Lab1_JAVA4/chuvi">Tinh Chu Vi</button>
<button formaction="/Lab1_JAVA4/dientich">Tinh Dien Tich</button>

<h2>Ket qua</h2>
	<h1>Chu vi: ${answer}</h1>
	<h1>Dien tich: ${answer2}</h1>

</form>
</body>
</html>