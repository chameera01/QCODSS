<%@page import="com.qcodss.model.Plant"%>
<%@page import="java.util.List"%>
<%@page import="com.qcodss.dao.PlantDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QCODSS | Add weekly records</title>

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
	                 <h3>Add weekly consolidated style records</h3>   
	                  
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	<hr>
			
			<div class="row">
	    		
	    		<div class="col-md-10">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
                            Fill  weekly consolidated style records only
                        </div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 			<div class="col-md-10">
	                 				
	                 				<form action="addWeeklyMain" method="post"> 
	                 				
	                 					<div class="form-group">
			                                            <label>Select plant</label>
			                                            <select id="plantName" class="form-control" name="plantName">	                                        	
	                                            <%
	                                            /* Loading plant list to the drop down and 
	                                            	default plant is selected using plantid sotored in the session */
	                                            Plant plant = new Plant(); 
	                                            List<Plant> allPlants = PlantDAO.getAllPlants();
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
			                                            <select class="form-control" id="year" name="year">
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
			                                                <option>2026</option>
			                                                <option>2027</option>
			                                                <option>2028</option>
			                                                <option>2029</option>
			                                                <option>2030</option>
			                                                
			                                                
			                                            </select>
			                              </div>
	                 					
	                 					<div class="form-group">
			                                            <label>Select month</label>
			                                            <select class="form-control" id="month" name="month">
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
                                            <label>Enter week number</label>
                                            <input class="form-control" placeholder="Please enter week no" name="weekNumber" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter number of new styles</label>
                                            <input class="form-control" placeholder="Please enter no of new styles" name="noOfNewStyles" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter number of repeat styles</label>
                                            <input class="form-control" placeholder="Please enter no of repeat styles" name="noOfRepeatStyles" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter full presetting hit rate</label>
                                            <input class="form-control" placeholder="Please enter full presetting hit rate" name="fullPresettingHR" />
                                          </div>
                                          
                                           <div class="form-group">
                                            <label>Enter silhouette base hit rate</label>
                                            <input class="form-control" placeholder="Please enter silhouette base hit rate" name="shRate" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter average feeding time</label>
                                            <input class="form-control" placeholder="Please enter average feeding time" name="averageFeedingTime" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter QCO time average of all new styles</label>
                                            <input class="form-control" placeholder="Please enter QCO time average of all new styles" name="QCOAverageNew" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter QCO time average of all repeat styles</label>
                                            <input class="form-control" placeholder="Please enter QCO time average of all repeat styles" name="QCOAverageRepeat" />
                                          </div>
	                 					
	                 					
	                 					<div class="row">
	    		
								    		<div class="col-md-12">
								                 
								                 <div class="panel panel-default">
								                 	
								                 	<div class="panel-heading">
								                 	
								                 		First five day details
								                 		
								                 	</div>
								                 	
								                 	<div class="panel-body">
								                 	
								                 		<div class="row">
								                 	
								                 		<div class="col-md-9">
								                 		
								                 		<ul class="nav nav-tabs">
									                                <li class="active"><a href="#day1" data-toggle="tab">Day 01</a>
									                                </li>
									                                <li ><a href="#day2" data-toggle="tab">Day 02</a>
									                                </li>
									                                <li ><a href="#day3" data-toggle="tab">Day 03</a>
									                                </li>
									                                <li ><a href="#day4" data-toggle="tab">Day 04</a>
									                                </li>
									                                <li ><a href="#day5" data-toggle="tab">Day 05</a>
									                                </li>
									                               
									                    </ul>
									                    
										                    <div class="tab-content">
										                                <div class="tab-pane fade active in" id="day1">
										                                	
														                		<h3>New style details</h3>
														                		<hr>
												                 	
														                 		<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 1 clocked hours-new" name="day1Clockedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 1 produced hours-new" name="day1Producedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 1 total inspected garments-new" name="day1TotalInspectedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 1 total first time passed garments-new" name="day1FTTn" />
													                            </div>
													                            
													                            
											                            		<h3>Repeat style details</h3>
											                            		<hr>
												                 		
												                 				<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 1 clocked hours-repeat" name="day1Clockedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 1 produced hours-repeat" name="day1Producedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 1 total inspected garments-repeat" name="day1TotalInspectedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 1 total first time passed garments-repeat" name="day1FTTr" />
													                            </div>
										                                	
										                                
										                                
										                </div>
										                                
										                                
										                                <div class="tab-pane fade" id="day2">
										                                	
										                                	
										                              			<h3>New style details</h3>
											                            		<hr>
												                 	
														                 		<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 2 clocked hours-new" name="day2Clockedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 2 produced hours-new" name="day2Producedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 2 total inspected garments-new" name="day2TotalInspectedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 2 total first time passed garments-new" name="day2FTTn" />
													                            </div>
													                            
													                           
											                            		<h3>Repeat style details</h3>
											                            		<hr>
												                 		
												                 			
											                                	<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 2 clocked hours-repeat" name="day2Clockedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 2 produced hours-repeat" name="day2Producedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 2 total inspected garments-repeat" name="day2TotalInspectedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 2 total first time passed garments-repeat" name="day2FTTr" />
													                            </div>
											                                	
											                                	
								
										                                </div>
										                                
										                                
										                                <div class="tab-pane fade" id="day3">
										                                
											                                	<h3>New style details</h3>
											                            		<hr>
												                 	
														                 		<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 3 clocked hours-new" name="day3Clockedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 3 produced hours-new" name="day3Producedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 3 total inspected garments-new" name="day3TotalInspectedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 3 total first time passed garments-new" name="day3FTTn" />
													                            </div>
													                            
													                            
													                            <h3>Repeat style details</h3>
											                            		<hr>
											                            
												                 		
												                 				<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 3 clocked hours-repeat" name="day3Clockedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 3 produced hours-repeat" name="day3Producedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 3 total inspected garments-repeat" name="day3TotalInspectedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 3 total first time passed garments-repeat" name="day3FTTr" />
													                            </div>
											                                	
											                                	
								
										                                </div>
										                                
										                                <div class="tab-pane fade" id="day4">
										                                
											                                	<h3>New style details</h3>
											                            		<hr>
												                 	
														                 		<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 4 clocked hours-new" name="day4Clockedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 4 produced hours-new" name="day4Producedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 4 total inspected garments-new" name="day4TotalInspectedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 4 total first time passed garments-new" name="day4FTTn" />
													                            </div>
													                            
													                            
											                            		<h3>Repeat style details</h3>
											                            		<hr>
												                 		
												                 				<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 4 clocked hours-repeat" name="day4Clockedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 4 produced hours-repeat" name="day4Producedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 4 total inspected garments-repeat" name="day4TotalInspectedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 4 total first time passed garments-repeat" name="day4FTTr" />
													                            </div>
											                                	
											                                	
								
										                                </div>
										                                
										                                
										                                <div class="tab-pane fade" id="day5">
										                                
										                                		<h3>New style details</h3>
											                            		<hr>
												                 	
														                 		<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 5 clocked hours-new" name="day5Clockedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 5 produced hours-new" name="day5Producedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 5 total inspected garments-new" name="day5TotalInspectedn" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 5 total first time passed garments-new" name="day5FTTn" />
													                            </div>
													                            
													                           
													                           <h3>Repeat style details</h3>
											                            		<hr>
											                            
												                 		
												                 				<div class="form-group">
													                                   <label>Clocked hours</label>
													                                   <input class="form-control" placeholder="Please enter day 5 clocked hours-repeat" name="day5Clockedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Produced hours</label>
													                                   <input class="form-control" placeholder="Please enter day 5 produced hours-repeat" name="day5Producedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total inspected garments</label>
													                                   <input class="form-control" placeholder="Please enter day 5 total inspected garments-repeat" name="day5TotalInspectedr" />
													                            </div>
													                            
													                            <div class="form-group">
													                                   <label>Total first time passed garments</label>
													                                   <input class="form-control" placeholder="Please enter day 5 total first time passed garments-repeat" name="day5FTTr" />
													                            </div>
											                                	
											                                	
											                                	
								
										                                </div>
										                                
										                                
										                                
										                                
										                                
										                            </div>
								                 		
								                 	
								                 		
								                 		
								                 		</div>
								                 		
								                 		
								                 	</div>
								                 	
								                 </div>	
								                 
								            </div>
								            
								        </div>  
								        
								        </div>
								        <!-- End of tabs-->
	                 					
	                 					
	                 					
	                 					<div class="form-group">
                                            
                                            <input type="submit" class="btn btn-danger" value="Save"  />
                                            <input type="button" class="btn btn-danger" value="Update"  />
                                            <input type="reset" class="btn btn-danger" value="Reset"  />
                                        </div>
	                 					
	                 				
	                 				</form>
	                 				
	                 			
	                 			
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


</body>
</html>