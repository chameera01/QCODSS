
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
    
    <STYLE TYPE="text/css">

		td{font-family: Arial; font-size: 9pt;}
		th{font-family: Arial; font-size: 8pt;}

	</STYLE>

    <!-- JQUERY SCRIPTS -->
    <script type='text/javascript' src="assets/js/jquery-1.10.2.js"></script>
    
	<!-- jsPDF SCRIPTS -->
    <script type="text/javascript" src="https://parall.ax/parallax/js/jspdf.js"></script>

</head>
<body>


<!-- ***************** table table table ************************************ -->

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default" id="test2">
                        <div class="panel-heading">
                             Weekly Summary
                        </div>
                        <div class="panel-body">
                        <button class="btn btn-danger" type="button" onclick="loadWeeklySummary()">Load</button>
                        
                        <div id="editor"></div>
                        <button class="btn btn-danger" type="button" id="generatePDF">generate PDF</button>
                        
                            <div class="table-responsive">
<!--                             <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%"> -->
                                <table class="table table-striped table-bordered table-hover" id="weeklySummaryTable">
                                    <thead>
                                    	<tr>
                                    		<th style="text-align:center; font-size: 18pt; 	background-color: #1A1A19; color: gold;" colspan="18">MAS Active QCO Dashboard  -2014</th>
                                    	</tr>
                                    	<tr>
                                    		<th rowspan="2">Week</th>
                                    		<th colspan="2"># of Changeovers</th>
                                    		<th rowspan="2">Average QCO time</th>
                                    		<th colspan="3">1st 3 day Efficiency Avg.</th>
                                    		<th colspan="2">1st 3 Days - Eff Avg.</th>
                                    		<th rowspan="2">1st 3Days -EFF Avg</th>
                                    		<th colspan="2">1st 3 Days -Endline Pass Rate</th>
                                    		<th rowspan="2">1st 3Days- Endline Pass Rate Avg.</th>
                                    		<th rowspan="2">Average Feeding Time</th>
                                    		<th rowspan="2">1st 3 Days Bucket Loss (STD Hrs)</th>
                                    		<th rowspan="2">Full Presetting Hit rate</th>
                                    		<th rowspan="2">4th &5th  Days -EFF Avg.</th>
                                    		<th rowspan="2">Silhouette based hit rate</th>
                                    	</tr>
                                    	
                                        <tr>
                                        
<!--                                         <th rowspan="2">Name</th> -->
<!--                 						<th colspan="2">HR Information</th> -->
                						
                                            
                                            <th>New</th>
                                            <th>Repeat</th>
                                            
                                            <th>1day</th>
                                            
                                            <th>2day</th>
                                            <th>3day</th>
                                            <th>New</th>
                                            <th>Repeat</th>
                                            
                                            
                                            <th>New</th>
                                            <th>Repeat</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>

	    	<!-- /. row  -->
<!-- ***************** / . table table table ************************************ -->
	    	
	    	
	    	


	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->

      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
     <!-- MORRIS CHART SCRIPTS -->
<%--      <script src="assets/js/morris/raphael-2.1.0.min.js"></script> --%>
<%--     <script src="assets/js/morris/morris.js"></script> --%>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
    		<script src="assets/js/weeklySummary.js"></script>
    
         <!-- DATA TABLE SCRIPTS -->
    <script src="assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
               $('#weeklySummaryTable').dataTable();
            });
    </script>


</body>
</html>