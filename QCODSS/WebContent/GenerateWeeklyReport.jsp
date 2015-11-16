<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.qcodss.model.Plant"%>
<%@page import="java.util.List"%>    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QCODSS |Generate weekly reports</title>

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
		                 <h3>Weekly report generator</h3>   
		                  
		            </div>
		    	<!-- /. row  -->	
		    	</div>
		    	
		    	<hr>
	    	
		    	<div class="row">
		    		
		    		<div class="col-md-8">
		    			
		    			<div class="panel panel-default">
		    				
		    				<div class="panel-heading">
                            	Fill suitable information
                        	</div>
                        	
                        	<div class="panel-body">
	                 	
	                 			<div class="row">
    
		                            <div class="col-md-6">
		                            	
		                            	<form action="saveWeekReport" method="post">
		                            		
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
	                                            <label>Week no</label>
	                                            <input class="form-control" placeholder="Enter week no " name="weekNo" />
	                                        </div>
			                                
			                                
			                                <div class="form-group">
		                                        <label>Select plant</label>
		                                        <select id="plantName" class="form-control" name="plantId">	                                        	
		                                            <%
		                                            /* Loading plant list to the drop down and 
		                                            	default plant is selected using plantid sotored in the session */
		                                            //Plant userPlant = new Plant(); 
		                                            //List<Plant> allUserPlants = PlantDAO.getAllPlants();
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
	                                            <input type="submit" class="btn btn-danger" value="Save"  />
	                                            <input type="reset" class="btn btn-danger" value="Reset"  />
			                                </div>
		                            		
		                            	</form>
		                            	
		                            </div>
		                        </div>
								
		                    </div>        
		    				<!-- end of panel body-->
		    				
		    				
		    			</div>
		    		</div>
				</div>
				
			<!-- end of page inner -->
			</div>

		<!-- end of page wrapper -->
		</div>
	
	<!-- 	end of wrapper -->
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