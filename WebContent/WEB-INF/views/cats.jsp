<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>Cat</title>
</head>
<body>
	<h1>This is the cat <c:out value = "${cat.name} "/></h1>
	
	<p><c:out value = "${cat.showAffection()} "/></p>
</body>
</html>