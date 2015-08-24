<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>QCODSS | MAS Active</title>

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

<div id="page-wrapper" >
	 <div id="page-inner">
	    	
	    	<div class="row">
	    	
		    	<div class="col-md-12">
	                 <h1>MAS Active QCO Dashboard</h1>   
	                  <h5>Welcome Nipuna Cooray  </h5>
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	<hr>
	    	
	    	
	    	<div class="row">
	    		
	    		<div class="col-md-3 col-sm-6 col-xs-6">           
						<div class="panel panel-back noti-box">
                			<span class="icon-box bg-color-red set-icon">
                    			<i class="fa fa-envelope-o"></i>
                			</span>
                	
		                	<div class="text-box" >
		                    	<p class="main-text">120 New</p>
		                    	<p class="text-muted">Messages</p>
		                	</div>
                	
             			</div>
		     		</div>
		     		
                    <div class="col-md-3 col-sm-6 col-xs-6">           
						<div class="panel panel-back noti-box">
			                <span class="icon-box bg-color-green set-icon">
			                    <i class="fa fa-bars"></i>
			                </span>
			                <div class="text-box" >
			                    <p class="main-text">30 Tasks</p>
			                    <p class="text-muted">Remaining</p>
			                </div>
			             </div>
		     		</div>
		     		
                    <div class="col-md-3 col-sm-6 col-xs-6">           
						<div class="panel panel-back noti-box">
                			<span class="icon-box bg-color-blue set-icon">
                    			<i class="fa fa-bell-o"></i>
                			</span>
                		<div class="text-box" >
                    		<p class="main-text">240 New</p>
                    		<p class="text-muted">Notifications</p>
                		</div>
             			</div>
		     		</div>
                    
                    <div class="col-md-3 col-sm-6 col-xs-6">           
						<div class="panel panel-back noti-box">
                				<span class="icon-box bg-color-brown set-icon">
                    			<i class="fa fa-rocket"></i>
                				</span>
                		<div class="text-box" >
                    		<p class="main-text">3 Orders</p>
                    		<p class="text-muted">Pending</p>
                		</div>
             			</div>
		     		</div>
	    	
	    	
	    	<!-- /. row  -->
	    	</div>
	    	
	    	
	    	
	    	<div class="row"> 
                    
                      
                        <div class="col-md-9 col-sm-12 col-xs-12">                     
             				<div class="panel panel-default">
                 				<div class="panel-heading">
                     					Bar Chart Example
                 				</div>
                 				<div class="panel-body">
                     				<div id="morris-bar-chart"></div>
                 				</div>
             				</div>            
         				</div>
         				
         				
             			<div class="col-md-3 col-sm-12 col-xs-12">                       
             				<div class="panel panel-primary text-center no-boder bg-color-green">
                 				<div class="panel-body">
                     					<i class="fa fa-bar-chart-o fa-5x"></i>
                     					<h3>120 GB </h3>
                 				</div>
                 				<div class="panel-footer back-footer-green">
                    						Disk Space Available
                     
                 				</div>
             				</div>
             				
             			<div class="panel panel-primary text-center no-boder bg-color-red">
                 				<div class="panel-body">
                     					<i class="fa fa-edit fa-5x"></i>
                     					<h3>20,000 </h3>
                 				</div>
                 				<div class="panel-footer back-footer-red">
                     				Articles Pending
                     
                 				</div>
             			</div>                         
                 		</div>
                
           </div>
	    	
	    	
	    	
	    	
	<!-- /. page inner  -->    	
	</div>
	
	<!-- /. page wrapper  -->	
	</div>

<!-- /. wrapper  -->	
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