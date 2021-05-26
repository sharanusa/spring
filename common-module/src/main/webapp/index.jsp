<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

	<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

  <style>
    .* {
      margin:0px;
      padding:0px;
      box-sizing: border-box;
    }
   
    .header1{
      top:0;
      margin:0px;
      padding:0px;
      width: 100%;
      font-family: sans-serif;
    }
 
    body {
      font-family: Arial;
      padding: 20px;
      background: lightyellow;
      background-image: url("https://img.freepik.com/free-photo/hand-painted-watercolor-background-with-sky-clouds-shape_24972-1095.jpg?size=626&ext=jpg");
    }

    .form-group form-check>.form-check-label>.form-check-input {
      color: aliceblue;
    }

    .form-group {
      margin-left: 300px;
      margin-right: 300px;
    }

    .form-group>label {
      color: darkorange;
    }
    .footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  height:50px;
  background-color: orange;
  color: red;
  text-align: center;
  line-height: 50px;
}
</style>
</head>
	<div class="header1">
<nav class="navbar navbar-light" style="background-color: #fed8b1;">
		<a class="navbar-brand" href="#">Flight Booking</a> 
		<a class="navbar-brand" class="float-right" href="#">Login</a>
	</nav>
	</div>
	<body>
		${msg} 
		<div class="container">
		<form action="registration.mod" method="post" class="box">
			<div  class="form-group">
				<label>FullName : </label>
				<input type="text" class="form-control" name="fullName">
			</div>
			<div  class="form-group">
				<label>EmailId : </label>
				<input type="email" class="form-control" name="EmailId">
			</div>
			<div  class="form-group">
				<label>DOB : </label>
				<input type="date" class="form-control" name="dob">
			</div>
			<div  class="form-group">
				<label>Contact : </label>
				<input type="number" class="form-control" name="contact">
			</div>
			<div  class="form-group">
				<label>Address : </label>
				<input type="text" class="form-control" name="address">
			</div>
			<div  class="form-group">
				<label>Gender : </label>
				<input type="radio" name="gender" value="male">Male
				<input type="radio" name="gender" value="female">Female
				<input type="radio" name="gender" value="others">Others
				
			</div>
			<div class="form-group">
				<label>Password : </label>
				<input type="password" class="form-control" name="password">
			</div>
			<div class="form-group">
				<label>Cnf Password : </label>
				<input type="password" class="form-control" name="cnfPassword">
			</div>
			
			<div class="form-group">
			<input type="submit" class="btn btn-primary" value="save">
			<input type="reset" class="btn btn-primary" style="background-color: red; border: red;" value="reset">
		</div>
		</form>	
		</div>
	</body>
	<footer class="footer" style="background: #fed8b1; ">
<div style="text-align: center;">@CopyRight</div></footer>
</html>