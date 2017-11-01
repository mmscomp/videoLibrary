 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<html>
<head>
<title>Yahoo!!</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"> 


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

	</nav>--> 
		<section class="top">
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
  <div class="add-movie">
   <a href = "/movie/Action/add/">Add Movie</a> 
   </div>
   <div class="remove-movie">
   <a href= "#">Remove Movie</a>
   </div>	
  </section>
	
	<section class= "film film-primary bg-image">
<!--	 <img src="C:\Users\ARIGAP\Desktop\VS\images\thinking-girl.jpg">
	-->
	<div class="film-container">
	<a href="/movie">Go Back</a>
	<div class="film-title"><h1><span> ACTION MOVIES </span></h1>
  	<div class="film-sub-title"> <h2>Select a movie</h2>
	<c:forEach items="${actionMovie}" var="action">
	  <div id="vdo">
	   <div class="mov">
	   <div class="mov-1">
	   <div class="1">
	    <a href="${action.links}">${action.title}</a>
	    </div>
	    <div class="2">
	    <a href="/movie/Action/${action.id}/delete">Remove</a>
	    </div>
	    </div> 
	       <br>
	    <iframe src="${action.links}"></iframe>
	    <!--<form action="/movie/action/${action.id}/review" method="post">
	    Write a review	    <input type=text name=review><input type=submit value=post>
	    <br><a href="/movie/action/${action.id}/views"> View reviews</a>
	    <br><br><br>
	    </form>
	    -->
	    </div> 
	    <div id="view">
	    <a href=/log/${act}/${action.title}/${action.id} >Write a review</a>
	 &emsp;&emsp;&emsp;   <a href=/movie/${act}/${action.title}/${action.id}/views >View reviews</a>
	</div>
	</div>
	                    
	</c:forEach>
	</div>
	</div>
	</div>
	</section>

	<footer class="footer">
		<div>About Us</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
