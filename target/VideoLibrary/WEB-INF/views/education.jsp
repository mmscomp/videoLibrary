<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<html>
<head>
<title>Yahoo!!</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"> 
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">



</head>
<body>
	<!--  <h1>My First JSP!!!</h1>-->
	<!--  <h3>My user name is ${name} and passwd is </h3>-->

	<nav class="navbar navbar-default">

	<section class= "movie movie-primary bg-image">
	<div class="container">
	<div class="title"><h1><span> EDUCATTION </span></h1> </div>
	<div class="sub-title"> <h2>Select a category</h2></div>
	<c:forEach items="${edu}" var="education">
	    <a href="/edu/${education.field}" target="_top"><h3>${education.field}</h3></a>
	</c:forEach>
	   
	</div>
	</section>

	<footer class="footer">
		<div>About Us</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
