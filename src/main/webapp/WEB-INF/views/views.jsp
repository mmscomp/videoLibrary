<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<html>
<head>
<title>Yahoo!!</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.container {
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto;
    max-width: 1150px;
}
.diary{
    text-align: left;
}
.diary-primary{
    background-color: #232323;<!--#594a42;-->
    color: red;
    padding-top: 25px;
    padding-bottom: 160px;
}
.diary-primary.bg-image > img{
    opacity: 0.4;
}
h1.signUp {
    margin-top: -20px;
    float: right;
}

h1.signUp:hover {
   background-color: #858585;
   cursor: crosshair;
}

.bg-image{
    position: relative;
    overflow: hidden;
    width: 100%;
}
.bg-image > img {
    position: absolute;
    top: -9999px;
    left: -9999px;
    bottom: -9999px;
    right: -9999px;
    margin: auto;
}
h1 > span {
background-color: red;
}
.title>h1{
color: white;
}
h2{
color: white;
}
.container>a{
color: solid black;
font-size: 30pt;
}
#vdo{
display: inline-block;
}
#vdo.after{ 
content: ' ';
display: inline-block;
width: 100%;
}

.footer{
    position: absolute;
    bottom: -500;
    width: 100%;
    height: 60px;
    background-color: #52EF49;
}
</style>

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
-->
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#">Login</a></li>
		</ul>

	</nav>
		<section>
	<!--  <div class="container">-->
		<p>
			<font color=red>${errorMessage }</font>
		</p>
		<!--<form action="#" method=POST>
			User name: <input name=name type=text /> Password:<input
				name=password type=password><input type=submit value="Login" />
				<a href="#">Reset your user name and password</a>		
			    <h1 class="signUp"><a href="#">Sign Up</a></h1>
   <a href = "/movie/action/add/">Add Movie</a> 	-->
  </section>
	
	<section class= "diary diary-primary bg-image">
 <!--	 <img src="C:\Users\ARIGAP\Desktop\VS\images\thinking-girl.jpg">
	-->
	<div class="container">
	<a href="/movie/${genre}">Go Back</a>
	<div class="title"><h1><span> MOVIE Review for "${title}" </span></h1> </div>
	<div class="sub-title"> <h2>Read carefully</h2></div>
	<c:forEach items="${reviewList}" var="review">
	         <h2>${review.movieId}</h2>
	    <br>  
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
