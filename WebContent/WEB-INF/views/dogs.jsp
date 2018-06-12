<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>Dog</title>
</head>
<body>
<!-- The setAttribute from the showDog.java (Controllers) handover all the object information so we can access it as seen below -->
	<h1>Here is the Dog <c:out value = "${dog.name} "/></h1><br>

	<p><c:out value = "${dog.showAffection()} "/></p>
	<p></p>
</body>
</html>