<%@page import="com.qcodss.model.Plant"%>
<%@page import="java.util.List"%>
<%@page import="com.qcodss.dao.PlantDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QCODSS | Add monthly records</title>
	
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
	                 <h3>Add monthly consolidated style records</h3>   
	                  
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	<hr>
			
			<div class="row">
	    		
	    		<div class="col-md-8">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
                            Fill monthly consolidated style records only
                        </div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 			<div class="col-md-6">
	                 				
	                 				<form> 
	                 				
	                 					<div class="form-group">
			                                            <label>Select plant</label>
			                                            <select class="form-control">
			                                            	
			                                                <%
			                                                //Loading plant list to the drop down
			                                                //Plant plant = new Plant(); 
			                                                
			                                                 //List<Plant> allPlants =   PlantDAO.getAllPlants();
			                                                 for(Plant p:allPlants){
			                                 				   plant = p;
			                                 				%>
			                                 				   <option value="<%= plant.getId()%>"> <%= plant.getName()  %></option>
			                                 				<%   
			                                 				}	
			                                                
			                                                %>
			                                            
			                                               
			                                                
			                                                
			                                                
			                                            </select>
			                              </div>
	                 				
	                 				
	                 					<div class="form-group">
			                                            <label>Select year</label>
			                                            <select class="form-control">
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
			                                            <select class="form-control">
			                                                <option>January</option>
			                                                <option>February</option>
			                                                <option>March</option>
			                                                <option>April</option>
			                                                <option>May</option>
			                                                <option>June</option>
			                                                <option>July</option>
			                                                <option>August</option>
			                                                <option>September</option>
			                                                <option>October</option>
			                                                <option>November</option>
			                                                <option>December</option>
			                                                
			                                                
			                                            </select>
			                              </div>
			                              
			                              
                                          
                                          <div class="form-group">
                                            <label>Enter number of new styles</label>
                                            <input class="form-control" placeholder="Please enter no of new styles" name="" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter number of repeat styles</label>
                                            <input class="form-control" placeholder="Please enter no of repeat styles" name="" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter full presetting hit rate</label>
                                            <input class="form-control" placeholder="Please enter full presetting hit rate" name="" />
                                          </div>
                                          
                                           <div class="form-group">
                                            <label>Enter silhouette base hit rate</label>
                                            <input class="form-control" placeholder="Please enter silhouette base hit rate" name="" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter average feeding time</label>
                                            <input class="form-control" placeholder="Please enter average feeding time" name="" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter QCO time average of all new styles</label>
                                            <input class="form-control" placeholder="Please enter QCO time average of all new styles" name="" />
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Enter QCO time average of all repeat styles</label>
                                            <input class="form-control" placeholder="Please enter QCO time average of all repeat styles" name="" />
                                          </div>
	                 					
	                 					
	                 					<div class="form-group">
                                            
                                            <input type="submit" class="btn btn-danger" value="Save"  />
                                            <input type="button" class="btn btn-danger" value="Update"  />
                                            <input type="reset" class="btn btn-danger" value="Reset"  />
                                        </div>
	                 					
	                 				
	                 				</form>
	                 				
	                 			
	                 			
	                 			</div>
	                 		
	                 		</div>
	                 		
	                 		
	                 		
	                 		<!-- Begining of tabs-->
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
			                                	
							                <form> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input class="form-control" placeholder="Please enter day 1 clocked hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input class="form-control" placeholder="Please enter day 1 produced hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input class="form-control" placeholder="Please enter day 1 total inspected garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input class="form-control" placeholder="Please enter day 1 total first time passed garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 		</form>
			                                	
			                                
			                                
			                </div>
			                                
			                                
			                                <div class="tab-pane fade" id="day2">
			                                	
			                                	
			                                	<form> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input class="form-control" placeholder="Please enter day 2 clocked hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input class="form-control" placeholder="Please enter day 2 produced hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input class="form-control" placeholder="Please enter day 2 total inspected garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input class="form-control" placeholder="Please enter day 2 total first time passed garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 			</form>
				                                	
				                                	
				                                	
	
			                                </div>
			                                
			                                
			                                <div class="tab-pane fade" id="day3">
			                                
				                                	<form> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input class="form-control" placeholder="Please enter day 3 clocked hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input class="form-control" placeholder="Please enter day 3 produced hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input class="form-control" placeholder="Please enter day 3 total inspected garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input class="form-control" placeholder="Please enter day 3 total first time passed garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 				</form>
				                                	
				                                	
	
			                                </div>
			                                
			                                <div class="tab-pane fade" id="day4">
			                                
				                                	<form> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input class="form-control" placeholder="Please enter day 4 clocked hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input class="form-control" placeholder="Please enter day 4 produced hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input class="form-control" placeholder="Please enter day 4 total inspected garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input class="form-control" placeholder="Please enter day 4 total first time passed garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 				</form>
				                                	
				                                	
	
			                                </div>
			                                
			                                
			                                <div class="tab-pane fade" id="day5">
			                                
			                                		<form> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input class="form-control" placeholder="Please enter day 5 clocked hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input class="form-control" placeholder="Please enter day 5 produced hours" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input class="form-control" placeholder="Please enter day 5 total inspected garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input class="form-control" placeholder="Please enter day 5 total first time passed garments" name="" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
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
	        
	        </div>
	        <!-- End of tabs-->
	                 		
	                 	
	                 	
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