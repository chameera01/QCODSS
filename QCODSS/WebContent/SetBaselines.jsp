<%@page import="com.qcodss.model.ActiveBaseline"%>
<%@page import="com.qcodss.dao.ActiveBaselineDAO"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QCODSS | Setup baselines</title>

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
			
			<div class="row">
	    	
		    	<div class="col-md-12">
	                 <h3>Setup baselines</h3>   
	                  
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	<hr>
			
			<div class="row">
			
				
			
			
	    		
	    		<div class="col-md-8">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
                            Fill the required data to set baselines 
                        </div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 			<div class="col-md-6">
	                 			
	                 				<ul class="nav nav-tabs">
		                                <li class="active"><a href="#home" data-toggle="tab">Active baselines</a>
		                                </li>
		                                <li class=""><a href="#profile" data-toggle="tab">Plant baselines</a>
		                                </li>
		                               
		                            </ul>
		                            
		                            <div class="tab-content">
		                                <div class="tab-pane fade active in" id="home">
		                                	
		                                	<form action="addActiveBaseline" method="post"> 
	                 					
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
		                                            <label>Enter yearly target efficiency for new styles</label>
		                                            <input class="form-control" placeholder="Enter  new target" name="newTarget" />
		                                        </div>
		                                        
		                                        <div class="form-group">
		                                            <label>Enter yearly target efficiency for repeat styles</label>
		                                            <input class="form-control" placeholder="Enter repeat target   " name="repeatTarget" />
		                                        </div>
			                 					
			                 					
			                 					<div class="form-group">
		                                            
		                                            <input type="submit" class="btn btn-danger" value="Save"  />
		                                            <input type="reset" class="btn btn-danger" value="Reset"  />
		                                        </div>
	                 					
	                 				
	                 						</form>

		                                
		                                </div>
		                                
		                                
		                                <div class="tab-pane fade" id="profile">
		                                
			                                <form action="addPlantBaseline" method="post" > 
			                                
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
			                                            <label>Select month</label>
			                                            <select class="form-control" name="month">
			                                                <option value="1">January</option>
			                                                <option value="2">February</option>
			                                                <option value="3">March</option>
			                                                <option value="4">April</option>
			                                                <option value="5">May</option>
			                                                <option value="6">June</option>
			                                                <option value="7">July</option>
			                                                <option value="8">August</option>
			                                                <option value="9">September</option>
			                                                <option value="10">October</option>
			                                                <option value="11">November</option>
			                                                <option value="12">December</option>
			                                                
			                                                
			                                            </select>
			                                        </div>
			                                
		                 					
				                 					<div class="form-group">
			                                            <label>Monthly budgeted efficiency</label>
			                                            <input class="form-control" placeholder="Enter monthly budgeted efficiency " name="budgetedEff" />
			                                        </div>
			                                        
			                                        
				                 					
				                 					
				                 					<div class="form-group">
			                                            
			                                            <input type="submit" class="btn btn-danger" value="Save"  />
			                                            <input type="reset" class="btn btn-danger" value="Reset"  />
			                                        </div>
		                 					
		                 				
		                 					</form>
		                                
		                                
		                                </div>
		                                
		                            </div>
	                 				
	                 				
	                 				
	                 				
	                 				
	                 				
	                 			
	                 			
	                 			</div>
	                 		
	                 		</div>
	                 	
	                 	
	                 	</div>
	                 	
	                 
	                 </div>
	                  
	            </div>
		    	
	    	<!-- /. row  -->	
	    	</div>
			
			<!-- previous baseline records is displayed here -->
			<div class="row">
	    		<div class="col-md-8">
	            	<div class="panel panel-default">
	                	<div class="panel-heading">
                            See previous Baseline records
                        </div>
	                 	<div class="panel-body">
	                 	
		                <div class="form-group">
                       		<label>Select Year</label>
                       		<div class="input-group">
	                       		<select id="ABYear" class="form-control" name="ABYear">	                                        	
								<%
								/* Loading Active Baseline years list to the drop down */
								ActiveBaseline activeBaseline = new ActiveBaseline();
								List<Integer> allABYears = ActiveBaselineDAO.getAllABYears();
								for(int year:allABYears){ %>                           				
									<option value="<%=year%>"> <%=year%> </option>
								<%   
								}		                                            
								           %>	                                            	                                            
								</select>
								<span><button class="btn btn-danger" type="button" onclick="loadBLTable()">Preview</button></span>
								
							</div>
						</div>
	                 	</div>
	                 </div>
				</div>
	    	<!-- /. row  -->	
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
    
    <!-- this page's SCRIPTS -->
    <script src="assets/js/SetBaselines.js"></script>

</body>
</html>