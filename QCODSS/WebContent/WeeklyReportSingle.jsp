<%@page import="com.qcodss.model.Plant"%>
<%@page import="com.qcodss.dao.PlantDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="s" uri="/struts-tags"  %> 

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Weekly Report-Single</title>

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

<style type="text/css">

	th
	{
	font-family:sans-serif;
	font-size:10pt;
	}

</style>
   		<!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    
<script type="text/javascript">

// filter avgEff_new123 and avgEff_repeat123 columns and change their colors accordingly
$( document ).ready(function() {
	
	var avgEff_newTarget = parseInt($("table .avgEff_newTarget").text());
	var avgEff_repeat123 = parseInt($("table .avgEff_repeatTarget").text());
	
	$("table .avgEff_new123").each( function() {
		var thisCell = $(this);
		var cellValue = parseInt(thisCell.text());

		if (!isNaN(cellValue) && (cellValue <=avgEff_newTarget)) {
		    thisCell.css("background-color","#ff4d4d");
		} else {
			thisCell.css("background-color","#8cff66");
		}
	})
	
	$("table .avgEff_repeat123").each( function() {
		var thisCell = $(this);
		var cellValue = parseInt(thisCell.text());
	
		if (!isNaN(cellValue) && (cellValue <=avgEff_repeat123)) {
		    thisCell.css("background-color","#ff4d4d");
		}  else {
			thisCell.css("background-color","#8cff66");
		}
	})
});

</script>

</head>
<body>

<div id="container">

	<div id="page-inner"> 

		<div class="row">
		
			<div class="col-md-12">	

	     		<div class="panel panel-default ">
	     		
	     			<div class= "panel-heading">
	     				<h1> Weekly Report-Single </h1>
	     			</div>
	     			
	     			<div class="panel-body">
	     				
	     				
	     				
<!-- 	     				<button class="btn btn-danger"> Download report</button> -->
	     				
<!-- 	     				<button class="btn btn-danger"> Close</button> -->

                        
                        	<div class="row"> 
                        			
                        		 <div class="col-md-2">	
                        			
                        		  <form action="weeklyReportGen" method="post">
                        		  	
                       		  			<div class="form-group">
                                           
                                           			    <label>Select plant</label>
				                                        <select class="form-control" name="plantID">
			                                                
			                                                
			                                                
			                                                
			                                            
				                                        <%
								                          //Loading plant list to the drop down
								                           Plant plant = new Plant(); 
								                           
								                           PlantDAO plantDao = new PlantDAO();	
								                        
								                           List<Plant> allPlants =   plantDao.getAllPlants();
								                           
								                           for(Plant p:allPlants){
								           				   plant = p;
								                           
											             %>
											             	<option value="<%= plant.getId() %>"><%= plant.getName()  %></option>
											              
								                         <% } %>
								                            
								                            
				                                          </select>
										</div>
										
										<div class="form-group">
	                                            <label>Select year</label>
	                                            <select class="form-control" name="year">
	                                                
	                                                <option>2013</option>
	                                                <option>2014</option>
	                                                <option>2015</option>
	                                                <option>2016</option>
	                                                <option>2017</option>
	                                                <option>2018</option>
	                                                <option>2019</option>
	                                                <option>2020</option>
	                                                <option>2021</option>
	                                                <option>2022</option>
	                                                <option>2023</option>
	                                                <option>2024</option>
	                                                <option>2025</option>
	                                                <option>2026</option>
	                                                <option>2027</option>
	                                                <option>2028</option>
	                                                <option>2029</option>
	                                                <option>2030</option>
	                                                
	                                                
	                                            </select>
										</div>
										
										<div class="form-group">
                                           <label>Week No </label>
                                           <input type="text" name="weekNo" placeholder="Enter Week No"/>
                                        
                                        </div> 
                                        
										<div class="form-group">
                                           
                                           <input type="submit" class="btn btn-danger" value="View Weekly Report"  />
                                        
                                        </div> 
                                           
                                           
                           
                        		  	   
                        		  	   
                        		  	   	
                        		  		
                        		  </form>
                        		  
                        		  
                        		
                        		 </div>
                        		
                        	</div>
                        
                        <hr>
                        
    					<div class="row"> 
    						
    						             <div class="col-md-10">
                                           		<table class="table table-striped table-bordered table-hover">
                                           			
                                           			<thead>
                                           			  <tr>
                                           			  	<th colspan="16" bgcolor="#4c4c33"><font color="#ffcc00" style="font-size:13pt;align:center">MAS Active QCO Dashboard</font></th>
                                           			  <tr>
                                           			  
                                           			  <tr>
                                           			  	<th rowspan="2">Week</th>
                                           			  	<th colspan="2"># of Changeovers</th>
                                           			  	<th rowspan="2">Average QCO time</th>
                                           			  	<th colspan="3">1st 3 day Efficiency Avg.</th>
                                           			  	<th colspan="2">1st 3 Days - Eff Avg.</th>
                                           			  	<th rowspan="2">1st 3Days -EFF Avg.</th>
                                           			  	<th colspan="2">1st 3 Days -Endline Pass Rate</th>
                                           			  	<th rowspan="2">1st 3Days- Endline Pass Rate Avg.</th>
                                           			  	<th rowspan="2">Average Feeding Time</th>
                                           			  	<th rowspan="2">1st 3 Days Bucket Loss (STD Hrs)</th>
                                           			  	<th rowspan="2">Full Presetting Hit rate</th>
                                           			  	
                                           			  	<th style="display:none;">avgEff_newTarget</th>
                                           			  	<th style="display:none;">avgEff_repeatTarget</th>
                                           			  </tr>
												      
												      <tr>
												      	<th>New</th>
												        <th>Repeat</th>
												        <th>1day</th>
												        <th>2day</th>
												        <th>3day</th>
												        <th>New</th>
												        <th>Repeat</th>
												        <th>New</th>
												        <th>Repeat</th>
												        
                                           			  	<th style="display:none;">avgEff_newTarget</th>
                                           			  	<th style="display:none;">avgEff_repeatTarget</th>
												      </tr>
												    </thead>
                                           			
                                           			<tbody>
                                           			
                                           		<s:iterator value="wRList" var="wRList">
                                           		
 
													<tr>
														<td><s:property value="#wRList.weekNo" /></td>
														<td> <s:property value="#wRList.numberOfNew" /> </td>
													    <td><s:property value="#wRList.numberOfRepeat" /></td>
													    <td><s:property value="#wRList.averageQCOTime" /></td>
													    <td><s:property value="#wRList.avgEff_1" /></td>
													    <td><s:property value="#wRList.avgEff_2" /></td>
													    
													    <td><s:property value="#wRList.avgEff_3" /></td>
														<td class="avgEff_new123"><s:property value="#wRList.avgEff_new123" /></td>
													    <td class="avgEff_repeat123"><s:property value="#wRList.avgEff_repeat123" /></td>
													    <td><s:property value="#wRList.avgEff_123" /></td>
													    <td><s:property value="#wRList.EPR_123n" /></td>
													    <td><s:property value="#wRList.EPR_123r" /></td>
													    
													    <td><s:property value="#wRList.EPR_123" /></td>
														<td> <s:property value="#wRList.avgFeedingTime" /> </td>
													    <td><s:property value="#wRList.bucketLoss" /></td>
													    <td><s:property value="#wRList.fullPresettingHR" /></td>
														
														<td class="avgEff_newTarget" style="display:none;"><s:property value="#wRList.avgEff_newTarget" /></td>
                                           			  	<td class="avgEff_repeatTarget" style="display:none;"><s:property value="#wRList.avgEff_repeatTarget" /></td>
													</tr>
													
													
                                           		 </s:iterator>

                                            </tbody>	
                                            
                                           	</table>
                                      </div>
    					
    					</div>	
    					
    						
    						
	
	     			</div>
	     		
	     		</div>
	     		
	     		
	     	</div>	
		
		<!-- End of row -->
		</div>
		
	</div>
	
	
<!-- End of container -->
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