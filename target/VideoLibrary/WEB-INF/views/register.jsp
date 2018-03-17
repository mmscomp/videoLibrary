<html>
<head>
<title>Register</title>

</head>
<body>

	<nav class="navbar navbar-default">

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/log">Sign In</a></li>
		</ul>

	</nav>
	<div class="container">
		<h1>Signing Up</h1>
		<p>
			<font color=red>${errorMessage }</font>
		</p>
		<form action="/log/register" method=POST>
		    User name: <input name=userName type=text /><br><br>
		    Password: <input name=passwd type=password><br><br>		
			First Name: <input name=firstName type=text /><br><br>
		    Last Name: <input name=lastName type=text /><br><br> 
		    <br><br><input type=submit value="Register" />
				 
		</form>
	</div>

    <%@ include file="footer.jsp" %>  

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
