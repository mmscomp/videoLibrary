<html>
<head>
<title>Yahoo!!</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"> 


</head>
<body>

	<nav class="navbar navbar-default">

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/log">Login</a></li>
		</ul>

	</nav>
	<section class= "diary diary-primary bg-image">
	<div class="container">
	<div class="title"><h1> Here you are </h1> </div>
	<div class="sub-title"> <h3>to record your today's experience</h3></div>
	</div>
	</section>
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

	<footer class="footer">
		<div>About U</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
