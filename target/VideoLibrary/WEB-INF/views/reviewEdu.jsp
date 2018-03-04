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
			<li><a href="/log">Login</a></li>
		</ul>

	</nav>
	<section class= "diary diary-primary bg-image">
	<div class="container">
	<div class="title"><h1> Here you are </h1> </div>
	<div class="sub-title"> <h3>to record your review</h3></div>
	</div>
	</section>
	<section>
		<p>
			<font color=red>${errorMessage }</font>
		</p>
		<form action="/edu/${genre}/${title}/${mId}/${username}" method=POST>
			Your comment: <input name=name type=text />
			You are in:   <input name=loc type=texr /><input type=submit value="go" />
		</form>
	        <a href=/log/${genre}/${title}/${mId} >Go Back</a>
  </section>

    <%@ include file="footer.jsp" %>  

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
