<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
</head>
<title>UPDATE PAGE</title>
<meta charset="UTF-8">

<body style="background-color: yellow">
<h1  >
<a href="update.do"></a>
</h1>

<form action= "update.do" method="POST">

	<input type="hidden" name="macbookId" value="${macbook.id}" />
	
	<label for="name">Name</label>
		<input type= "text" name="name" value= "${macbook.screenSize}" required><br>
		
	<label for="description">Description</label>
		<input type= "text" name="description"value= "${macbook.hdCapacity}" required><br>
		 
 	<label for="category">Category</label>
		<input type= "text" name="category"value= "${macbook.color}" required><br>
		
	<label for="calories">Calories</label>
		<input type= "text" name="calories" value= "${macbook.year}" required><br>
		
	<input type="submit" name="submit" value="submit"/>
		
</form>

<a href="index.do">«–––– Go Back To Index</a>





<!-- 	<form>
	
	<input type="text" name="screensize">
	<input type="text" name="hdcapacity">
	<input type="text" name="color">
	<input type="text" name="year">
	<input type="submit">
	
	</form> -->










</body>








</html>