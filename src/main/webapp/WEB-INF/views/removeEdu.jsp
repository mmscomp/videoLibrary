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
    text-align: center;
}
.diary-primary{
    background-color: #594a42;
    color: #fff;
    padding-top: 25px;
    padding-bottom: 160px;
}
.diary-primary.bg-image > img{
    opacity: 0.50;
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

.footer{
    position: absolute;
    bottom: 0;
    width: 100%;
    height: 60px;
    background-color: #52EF49;
}
</style>

</head>
<body>

	<nav class="navbar navbar-default">

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/log">Login</a></li>
		</ul>

	</nav>
	<section class= "diary diary-primary bg-image">
	 <!-- <img src="C:\Users\ARIGAP\Desktop\VS\images\thinking-girl.jpg" alt="NOT FOUND">-->
	<div class="container">
	</div>
	</section>
	<section>
	<!--  <div class="container">-->
		<p>${id}
			<font color=red>${errorMessage }</font>
		</p>
		<form action="/edu/${field}/${id}/delete" method=POST>
			Do you really want to delete? 
		<br> User Name: <input type=text name=user>
		     Pass Word: <input type=password name=pass>	
			<input type=submit value="remove"/>
		</form>
	        <a href=/edu/${field}/ >Cancel</a>
  </section>

	<footer class="footer">
		<div>About Us</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
