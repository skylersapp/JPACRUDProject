
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
</head>

<meta charset="UTF-8">

<body style="background-color: pink">
<h1  >
<a href="delete.do"></a>
</h1>


<form action="delete.do" method="POST">
	<input type="hidden" value="${macbook.id}" name="id">
  <input type="submit" value="submit" name="submit" />
</form>

<a href="index.do">«–––– Go Back To Index</a>


</body>
</html>