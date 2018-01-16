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

	<nav class="navbar navbar-default">

		<section class="top">

		<p>
			<font color=red>${errorMessage }</font>
		</p>
   <div class="home">
   <a href= "/movie">Home</a>
   </div>
     <div class="add-movie">
   <a href = "/movie/Action/add/">Add Movie</a> 
   </div>	
  </section>
	
	<section class= "film film-primary bg-image">
	<div class="film-container">
	
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
