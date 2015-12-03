<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QCODSS | Report generator</title>

	<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    
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
	
	<div id="wrapper"> 
	
		<%@ include file="header.jsp" %> 
	
		<div id="page-wrapper"> 
		
			<div id="page-inner"> 
			
			<% 
				if(session.getAttribute("role").equals("admin") == false){
					String redirectURL = "NoAccess.jsp";
					response.sendRedirect(redirectURL);
				}
			%>
			
			<div class="row">
	    	
		    	<div class="col-md-12">
	                 <h3>Report generator</h3>   
	                  
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	
	    	<hr>
	    	
	    	<div class="row">
	    		
	    		<div class="col-md-12">
	    			
	    			<div class="col-md-6">           
						<div class="panel panel-back noti-box">
                			<span class="icon-box set-icon">
                    			<i class="fa fa-file-text"></i>
                			</span>
                	
		                	<div class="text-box" >
		                    	<p class="main-text"> <a href="GenerateWeeklyReport.jsp" > Weekly report </a> </p> 
		                    	<p class="text-muted">Generate weekly report </p>
		                	</div>
                	
             			</div>
		     		</div>
		     		
		     		
		     		
	    		</div>
	    		
	    	</div>
			
			</div>
			
			
		</div>
		
	</div>
	

	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
     <!-- MORRIS CHART SCRIPTS -->
     <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
</body>
</html>