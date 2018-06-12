<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8>
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
<div class="Dog">

<h2>Make a Dog!</h2>
<!-- When user submits this form, the user gets forwarded to the showDog.Java in the controller -->
	<form action="/Pets/showDog" method="POST">
	
	Name:
	<input type="text" name="name"><br>
	
	Breed:
	<input type="text" name="breed"><br>
	
	Weight (kg):
	<input type="text" name="weigth">
	
	<button type="submit">Create a Dog</button>
	
	</form>
</div>	

<div class="Cat">
	<h2>Make a Cat!</h2>
	<form action="/Pets/showCat" method="POST">
	
	Name:
	<input type="text" name="name"><br>
	
	Breed:
	<input type="text" name="breed"><br>
	
	Weight (lb):
	<input type="text" name="weigth">
	
	<button type="submit">Create a Cat</button>
	
	</form>
	
	
</div>
</body>
</html>