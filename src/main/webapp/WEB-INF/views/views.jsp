<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Movies Yahoo!!</title>
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
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
.view{
    text-align: left;
}
.view-primary{
    background-color: #dcb;<!--#594a42;-->
    color: red;
    padding-top: 25px;
    padding-bottom: 160px;
}
.view-primary.bg-image > img{
    opacity: 0.4;
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
text-align: center;
}
.title>h1{
color: white;
text-align: center;
}
h2{
color: black;
}
a{
color: solid black;
font-size: 30pt;
text-decoration: none;
}

.fa-phone:before {
   content: "\f095";
}
.fa-github-square:before {
   content: "\f092";
}
.fa-linkedin:before {
   content: "\f0e1";
}
.fa-linkedin-square:before {
  content: "\f08c";
}
/*.footer{
    position: relative;
    width: 80%;
    height: 60px;
    display: flex;
    background-color: #52EF49;
}*/

footer {
    margin-top: 5px;
    border-top: 1px solid #E0E0E0;
    margin-left: 90px;
    margin-right: auto;
    padding: 1em;
    width: 100%;
}

footer li {
   display: flex;
   margin: 0 1.0em;
}

footer a {
   text-decoration: none;
   color: #321;
 /*  padding: 1.5em; */
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

		<ul class="nav navbar-nav navbar-right">
			<li><a href="#">Login</a></li>
		</ul>-->
	<a href="/movie/${genre}">Go Back</a>
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
	
	<section class= "view view-primary bg-image">
	<div class="container">
	<div class="title"><h1><span> MOVIE Review for "${title}" </span></h1> </div>
	<div class="sub-title"> <h2>Read reviews</h2></div>
	<c:forEach items="${reviewList}" var="review">
	         <h2>${review.movieId}</h2>
	    <br>  
	</c:forEach>
	</div>
	</section>

	<footer>
		<ul>
		   <li><a href="#">Contact me<i class="fa fa-phone"></i></a></li>
		   <li><a href="#">Follow me<i class="fa fa-twitter"></i></a></li>
		   <li><a href="#">Find me<i class="fa fa-facebook"></i></a></li>
		   <li><a href="#">Hangout with me<i class="fa fa-plus"></i></a></li>
		   <li><a href="#">Link me<i class="fa fa-linkedin"></i></a></li>
		   <li><a href="/www.github.com/mmscomp">Github<i class="fa fa-github"></i></a></li>
		</ul>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
