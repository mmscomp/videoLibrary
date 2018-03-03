<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Lypple!</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"> 


</head>
<body>

	<nav class="navbar navbar-default">

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/">Home</a></li>
		</ul>

	</nav>
	<section>
		<p>
			<font color=red>${errorMessage }</font>
		</p>
		<form action="/log/${genre}/${title}/${mId}/verify" method=POST>
			User name: <input name=name type=text /> Password:<input
				name=password type=password><input type=submit value="Login" />
				<a href="/log/reset">Reset your user name and password</a>		
			    <h1 class="signUp"><a href="/log/register">Sign Up</a></h1>
		</form>
	
  </section>

    <%@ include file="footer.jsp" %>  

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
