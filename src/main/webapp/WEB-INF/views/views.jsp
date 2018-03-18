<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Movies !</title>
<link rel="stylesheet" href="css/font-awesome.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">




<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"> 

</head>
<body>

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
	<a href="/movie/${genre}"><i class= "fa fa-arrow-left" aria-hidden=true></i></a>
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
	<div class="title"><h1><span>  Review for "${title}" </span></h1> </div>
	<div class="sub-title"> <h2>Read reviews</h2></div>
	<c:forEach items="${reviewList}" var="review">
	    <div class="review">
	        <div class="user-review">
	         <div class="use">
	         <h2>${review.user}</h2>
	         <h4>${review.location}</h4>
	         </div>
	         <div class="rev">
	         <p>${review.review}</p>
	         </div>
	         
	         </div>
	         
	         <div class="del">
	            <a href="/movie/${genre}/${review.id}"><h3>remove</h3></a>
	         </div>
	     </div>
	         
	    <br>  
	</c:forEach>
	</div>
	</section>
    <%@ include file="footer.jsp" %>  

	</body>
</html>
