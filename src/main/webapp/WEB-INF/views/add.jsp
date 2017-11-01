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
    background-color: #77ff00;<!--#594a42;-->
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
   background-color: green;
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

input > .one {
  width: 20%;
}

.two,.three {
  width:30%;
}

input > #11 {
  width: 10%;
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
-->

   <a href="/movie/${genre}/">Go Back</a>
   <form action = "/movie/${genre}/add/" method="post">
   Title:<input class="one" type=text name=title >
   Casting:  <input class="two" type=text name=casting>
   URLs: <input class="three" type=text name=links>
   <input id="11" type=submit value=add />
   </form> 
  </section>

  </body>
  </html>