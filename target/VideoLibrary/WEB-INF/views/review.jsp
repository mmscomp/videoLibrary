<html>
<head>
<title>Lypple!</title>
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
			<li><a href="/log">Login</a></li>
		</ul>

	</nav>
	<section class= "diary diary-primary bg-image">
	 <!-- <img src="C:\Users\ARIGAP\Desktop\VS\images\thinking-girl.jpg" alt="NOT FOUND">-->
	<div class="container">
	<div class="title"><h1> Here you are </h1> </div>
	<div class="sub-title"> <h3>to record your today's experience</h3></div>
	</div>
	</section>
	<section>
	<!--  <div class="container">-->
		<p>
			<font color=red>${errorMessage }</font>
		</p>
		<form action="/movie/${genre}/${title}/${mId}/${username}" method=POST>
			Your comment: <input name=name type=text />
			You are in:   <input name=loc type=texr /><input type=submit value="go" />
		</form>
	        <a href=/log/${genre}/${title}/${mId} >Go Back</a>
  </section>

	<footer class="footer">
		<div>About Us</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
 