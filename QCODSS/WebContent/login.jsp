<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QCODSS | login</title>


<style>
	.form-signin
	{
	    max-width: 330px;
	    padding: 15px;
	    margin: 0 auto;
	}
	.form-signin .form-signin-heading, .form-signin .checkbox
	{
	    margin-bottom: 10px;
	}
	.form-signin .checkbox
	{
	    font-weight: normal;
	}
	.form-signin .form-control
	{
	    position: relative;
	    font-size: 16px;
	    height: auto;
	    padding: 10px;
	    -webkit-box-sizing: border-box;
	    -moz-box-sizing: border-box;
	    box-sizing: border-box;
	}
	.form-signin .form-control:focus
	{
	    z-index: 2;
	}
	.form-signin input[type="text"]
	{
	    margin-bottom: -1px;
	    border-bottom-left-radius: 0;
	    border-bottom-right-radius: 0;
	}
	.form-signin input[type="password"]
	{
	    margin-bottom: 10px;
	    border-top-left-radius: 0;
	    border-top-right-radius: 0;
	}
	.account-wall
	{
	    margin-top: 20px;
	    padding: 40px 0px 20px 0px;
	    background-color: #f7f7f7;
	    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	}
	.login-title
	{
	    color: #555;
	    font-size: 18px;
	    font-weight: 400;
	    display: block;
	}
	.profile-img
	{
	    width: 280px;
	    height: 100px;
	    margin: 0 auto 10px;
	    display: block;
	    -moz-border-radius: 50%;
	    -webkit-border-radius: 50%;
	    border-radius: 50%;
	}
	.need-help
	{
	    margin-top: 10px;
	}
	.new-account
	{
	    display: block;
	    margin-top: 10px;
	}

</style>

	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
     <!-- MORRIS CHART STYLES-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />



</head>

<body>
	
	
	
	<div class="container">
		    <div class="row">
		        <div class="col-sm-6 col-md-4 col-md-offset-4">
		            <h1 class="text-center login-title">QCO Decision Support System</h1>
		            <div class="account-wall">
		                <img class="profile-img" src="assets/img/MAS.png"
		                    alt="">
		                <form class="form-signin" action="login" method="post">
		                <input type="text" class="form-control" placeholder="Email" required autofocus name="email">
		                <input type="password" class="form-control" placeholder="Password" required name="password">
		                <button class="btn btn-lg btn-danger btn-block" type="submit">
		                    Sign in</button>
		                <label class="checkbox pull-left">
		                    <input type="checkbox" value="remember-me">
		                    Remember me
		                </label>
		                <a href="#" class="pull-right need-help">Need help? </a><span class="clearfix"></span>
		                </form>
		            </div>
		            <a href="#" class="text-center new-account">Create an account </a>
		        </div>
		    </div>
		</div>










</body>
</html>