<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head >
<link rel="stylesheet" href="styles.css">
</head>

<meta charset="UTF-8">

<body style="background-color: lightgreen">
<h1  >
<a href="create.do"></a>
</h1>

<h3>Add a MacBook to the List!</h3>
	<form action= "create.do" method="POST">
	
	<input type="hidden" name="Mid" value="${macbook.id}"/>
	
	<label for="screenSize">Screen Size</label>
		<input type= "text" name="screenSize"><br><br>
		
	<label for="hdCapacity">Hard Drive Capacity</label>
		<input type= "text" name="hdCapacity"><br><br>
		
 	<label for="color">Color</label>
		<input type= "text" name="color"><br><br>
		
	<label for="year">Year</label>
		<input type= "text" name="year"><br><br>
		
		<input type="submit" name="submit" value="submit"/>
		
	</form>
	
	<a href="index.do"> «–––– Go Back To Index </a>


</body>
</html>