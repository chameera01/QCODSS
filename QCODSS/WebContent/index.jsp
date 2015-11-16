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
	    	
	    	
	    	
	    	<div class="row"> 
                        <div class="col-md-12">                     
             				<div class="panel panel-default">
                 				<div class="panel-heading">
                     					Weekly Report Generator
                 				</div>
                 				<div class="panel-body">
                     				
                     					
                     					<form action="loadWeeklyReport" method="post">
                     						
                     						 <div class="form-group">
	                                            <label>Week number</label>
	                                            <input id="weekNumber" class="form-control" placeholder="Please enter week number" name="weekNumber" />
                                       		 </div>
                                       		 
                                       		 <div class="form-group">
		                                        <label>Select plant</label>
		                                        <select id="plantName" class="form-control" name="plantName">	                                        	
		                                            <%
		                                            /* Loading plant list to the drop down and 
		                                            	default plant is selected using plantid sotored in the session */
		                                            	 //Plant plantName = new Plant(); 
			                                            //List<Plant> allPlantsList = PlantDAO.getAllPlants();
		                                            for(Plant p:allPlants){
		                             				 	plant = p;
		                             				 	if( plant.getId()==(Integer)session.getAttribute("plantID") ){ %>                           				
		                             				   		<option value="<%= plant.getId()%>" selected> <%= plant.getName()  %></option>
			                             				<%  
			                             				} else{ %>
			                             					<option value="<%= plant.getId()%>"> <%= plant.getName()  %></option>
			                             				<%	
			                             				}
			                                            %>
		                             				<%   
		                             				}		                                            
		                                            %>	                                            	                                            
		                                        </select>
				                              </div>
				                              
				                              
                                            
                                           	<div class="form-group">
		                                            <label>Select year</label>
		                                            <select class="form-control" name="year">
		                                                
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
                                            
	                                            <input type="submit" class="btn btn-danger" value="View" />
	                                            
	                                            <input type="reset" class="btn btn-danger" value="Reset" />
	                                        </div>
                     					
                     					</form>
                     					
                     					
                     					<div class="panel panel-default">
                     						
                     						<s:iterator value="wr" var="weeklyReport">
                     							<div class= "panel-heading">
                     								<h1> Weekly Report </h1> 
                     							</div>
                     							
                     							<div class="panel-body">
                     							
	                     							
													
													<div class="row"> 
                    
                      
                        							<div class="col-md-6 col-sm-12 col-xs-12"> 
													
													<table class="table table-bordered">
													    
													    <tbody>
													      <tr>
													        <td>Number of new styles</td>
													        <td><s:property value = "#weeklyReport.numberOfNew"/></td>
													        
													      </tr>
													      <tr>
													        <td>Number of repeat styles</td>
													        <td><s:property value = "#weeklyReport.numberOfRepeat"/></td>
													       
													      </tr>
													      
													      <tr>
													        <td>Average QCO time </td>
													        <td><s:property value = "#weeklyReport.averageQCOTime"/></td>
													      </tr>
													    </tbody>
													 </table>
													 
													 <h5> <strong> First 3 day efficiency averages </strong></h5>
													 
													 <table class="table table-bordered">
													    
													    <tbody>
													      <tr>
													        <td>First day average efficiency</td>
													        <td><s:property value = "#weeklyReport.avgEff_1"/></td>
													        
													      </tr>
													      <tr>
													        <td>Second day average efficiency</td>
													        <td><s:property value = "#weeklyReport.avgEff_2"/></td>
													       
													      </tr>
													      
													      <tr>
													        <td>Third day average efficiency</td>
													        <td><s:property value = "#weeklyReport.avgEff_3"/></td>
													      </tr>
													    </tbody>
													 </table>
													 
													 <h5><strong>First 3 day collective efficiency averages</strong></h5>
													 
													 <table class="table table-bordered">
													    
													    <tbody>
													      <tr>
													        <td>First 3 days target efficiency for new styles </td>
													        <td><s:property value = "#weeklyReport.avgEff_newTarget"/></td>
													        
													      </tr>
													    
													      <tr>
													        <td>First 3 days average efficiency of new styles </td>
													        <td><s:property value = "#weeklyReport.avgEff_new123"/></td>
													        
													      </tr>
													      
													      <tr>
													        <td>First 3 days target efficiency for repeat styles </td>
													        <td><s:property value = "#weeklyReport.avgEff_repeatTarget"/></td>
													        
													      </tr>
													      
													      
													      <tr>
													        <td>First 3 days average efficiency of repeat styles</td>
													        <td><s:property value = "#weeklyReport.avgEff_repeat123"/></td>
													       
													      </tr>
													      
													      <tr>
													        <td>First 3 days average efficiency of (new+repeat)</td>
													        <td><s:property value = "#weeklyReport.avgEff_123"/></td>
													       
													      </tr>
													      
													      
													    </tbody>
													 </table>
													 
													 <h5> <strong> First 3 day Endline Passrate </strong></h5>
													 
													 <table class="table table-bordered">
													    
													    <tbody>
													      <tr>
													        <td>Endline Passrate New</td>
													        <td><s:property value = "#weeklyReport.EPR_123n"/></td>
													        
													      </tr>
													      <tr>
													        <td>Endline Passrate Repeat</td>
													        <td><s:property value = "#weeklyReport.EPR_123r"/></td>
													       
													      </tr>
													      
													       <tr>
													        <td>Endline Passrate Average</td>
													        <td><s:property value = "#weeklyReport.EPR_123"/></td>
													       
													      </tr>
													      
													    </tbody>
													 </table>
													 
													 
													 </div>  
													 
													
													</div>
													
													
													
												</div>
												
											</s:iterator>
                     						
                     						
                     					</div>
                     					
                     					
                     				
                 				</div>
             				</div>            
         				</div>
         				
         				
             			
                
           </div>

<!-- ***************** table table table ************************************ -->

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             Weekly Summary
                        </div>
                        <div class="panel-body">
<!--                         <button class="btn btn-danger" type="button" onclick="weeklySummaryTab()">Load</button>                    -->
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>

	    	<!-- /. row  -->
<!-- ***************** / . table table table ************************************ -->
	    	
	    	
	    	
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