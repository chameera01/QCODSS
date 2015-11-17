<%@page import="com.qcodss.dao.PlantDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.qcodss.model.Plant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@taglib prefix="s" uri="/struts-tags"  %>    
    
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
   
        <!-- TABLE STYLES-->
    <link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />

    <!-- JQUERY SCRIPTS -->
    <script type='text/javascript' src="assets/js/jquery-1.10.2.js"></script>
		
		<script src="assets/js/index.js"></script>

		<!-- google charts intergration -->	
	<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
    	google.load("visualization", "1.1", {packages:["table"]});
    	google.setOnLoadCallback(initialize);
    </script>
		<!-- /(google charts intergration) -->

	
</head>
<body>



<div id="wrapper">

<%@ include file="header.jsp" %> 

<div id="page-wrapper" >
	 <div id="page-inner">
	    	
	    	<div class="row">
	    	
		    	<div class="col-md-12">
				  <div class="jumbotron">
				    <h1>MAS Active QCODSS</h1>
				    <p>Quick Changeover Decision Support System 1.0</p>
				    
				  </div>
				
				 
				</div>
			
			</div>
	    	
	    	
	    	<div class="row">
	    	
	    			<div class="col-md-12">
				
				
					<div class="col-md-6">           
						<div class="panel panel-back noti-box">
                			<span class="icon-box set-icon">
                    			<i class="fa fa-file-text"></i>
                			</span>
                	
		                	<div class="text-box" >
		                    	<p class="main-text"> <a href="WeeklyReportSingle.jsp" > Weekly report-Single </a> </p> 
		                    	<p class="text-muted">View single weekly report </p>
		                	</div>
                	
             			</div>
		     		</div>
		     		
                    <div class="col-md-6">           
						<div class="panel panel-back noti-box">
			                <span class="icon-box set-icon">
			                    <i class="fa fa-bars"></i>
			                </span>
			                <div class="text-box" >
			                    <p class="main-text"> <a href="#" > Weekly report-All </a></p>
			                    <p class="text-muted">View single weekly report </p>
			                </div>
			             </div>
		     		</div>
		     		
                    <div class="col-md-6">           
						<div class="panel panel-back noti-box">
                			<span class="icon-box set-icon">
                    			<i class="fa fa-list-alt"></i>
                			</span>
                		<div class="text-box" >
                    		<p class="main-text"> <a href="#" > Weekly report-Active </a> </p>
                    		<p class="text-muted">View single weekly report </p>
                		</div>
             			</div>
		     		</div>
                    
                    <div class="col-md-6">           
						<div class="panel panel-back noti-box">
                				<span class="icon-box  set-icon">
                    			<i class="fa fa-file-text-o"></i>
                				</span>
                		<div class="text-box" >
                    		<p class="main-text"> <a href="#" > Monthly report-Single </a> </p>
                    		<p class="text-muted">View single weekly report </p>
                		</div>
             			</div>
		     		</div>
                    
                    <div class="col-md-6">           
						<div class="panel panel-back noti-box">
                				<span class="icon-box set-icon">
                    			<i class="fa fa-files-o"></i>
                				</span>
                		<div class="text-box" >
                    		<p class="main-text"> <a href="#" > Monthly report-All </a> </p>
                    		<p class="text-muted">View single weekly report </p>
                		</div>
             			</div>
		     		</div>
		     		
		     		<div class="col-md-6">           
						<div class="panel panel-back noti-box">
                				<span class="icon-box set-icon">
                    			<i class="fa fa-clipboard"></i>
                				</span>
                		<div class="text-box" >
                    		<p class="main-text"> <a href="#" > Monthly report-Active </a> </p>
                    		<p class="text-muted">View single weekly report </p>
                		</div>
             			</div>
		     		</div>
		
				
				
				</div>
				
				
				
			<!-- /. row  -->	
			</div>
	    	
	    	
	    	
	    	


	    	
	    	
	    	
	<!-- /. page inner  -->    	
	</div>
	
	<!-- /. page wrapper  -->	
	</div>

<!-- /. wrapper  -->	
</div>

	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->

      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
     <!-- MORRIS CHART SCRIPTS -->
     <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
         <!-- DATA TABLE SCRIPTS -->
    <script src="assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
    </script>


</body>
</html>