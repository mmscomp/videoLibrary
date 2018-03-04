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

<!--  		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/todo.do">Todos</a></li>
			<li><a href="http://www.yahoo.com">Yahoo</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="#">Login</a></li>
		</ul>

	</nav>
	 	<section>
	  <div class="container">
		<p>
			<font color=red>${errorMessage }</font>
		</p>
		<a href="/movie/add">Add</a>
		<form action="#" method=POST>
			User name: <input name=name type=text /> Password:<input
				name=password type=password><input type=submit value="Login" />
				<a href="#">Reset your user name and password</a>		
			    <h1 class="signUp"><a href="#">Sign Up</a></h1>
		</form>
	
  </section>
	-->
	<section class= "movie movie-primary bg-image">
<!--	 <img src="C:\Users\ARIGAP\Desktop\VS\images\thinking-girl.jpg">
	-->
	<div class="container">
	<div class="title"><h1><span> CATALOG </span></h1> </div>
	<div class="sub-title"> <h2>Select a category</h2></div>
	<!--<c:forEach items="${movie}" var="movie">
	    <a href="/movie/${movie.genre}" target="_top"><h3>${movie.genre}</h3></a>
	</c:forEach>--->
	<ul>
	  <li> <a href="/movie"><h3>Movies</h3></a></li>
      <li> <a href="/edu"><h3>Education</h3></a></li>
      <li> <a href="/log"><h3>Diary</h3></a>
	</ul> 
	   
	</div>
	</section>

    <%@ include file="footer.jsp" %>  

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
