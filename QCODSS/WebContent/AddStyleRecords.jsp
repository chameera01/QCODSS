<%@page import="com.qcodss.model.Plant"%>
<%@page import="java.util.List"%>
<%@page import="com.qcodss.dao.PlantDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QCODSS | Style Record</title>

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

    


		<!-- this style is used for validations in each part of the form -->
	<style>
		#styleRecMainForm input.error {
			border:1px solid red;
		}
		#styleDayOneForm input.error {
			border:1px solid red;
		}
	</style>

   		<!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>

		<!-- Validators -->    
    <script src="assets/js/validators/styleRecValidator.js"></script>
   
   		<!-- this script will hide most parts of the form when page load -->
    <script>
	    $(document).ready(function(){
	    	$("#styleRec_1_hide").hide();
	    	$("#styleRec_2_hide").hide();
	    });
    </script>
    
    <!-- date picker (finish style) scripts -->
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
	<script>
		$(function() {
		  $( "#datepicker" ).datepicker();
		});
	</script>
    
</head>
<body>

<div id="wrapper">

	<%@ include file="header.jsp" %> 

	
	<div id="page-wrapper">
	
		<div id="page-inner"> 
			
			<div class="row">
	    	
		    	<div class="col-md-12">
	                 <h3>Add style record</h3>
	                  
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	<hr>
			
			<div class="row">
	    		
	    		<div class="col-md-9">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
                            Carefully enter the completed style details in the fields below
                        </div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 			<div class="col-md-12">
	                 				
	                 				
	                 			
									<form id="styleRecMainForm" action="addStyleRecordMain" method="post">
	                 				
	                 					<div class="form-group">
	                                        <label>Select plant</label>
	                                        <select id="plantName" class="form-control" name="plantName">	                                        	
	                                            <%
	                                            /* Loading plant list to the drop down and 
	                                            	default plant is selected using plantid sotored in the session */
	                                            //Plant plant = new Plant(); 
	                                            //List<Plant> allPlants = PlantDAO.getAllPlants();
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


	                 					
	                 					
	                 						
	                 					
			                 					<div class="form-group" >
		                                            <label>Style no</label>
		                                            
		                                            <div class="input-group">
		                                            
			                                 <input id="styleNo" class="form-control" placeholder="Please enter style no" name="styleNo" />
			                              
			                                            
			                                            <span class="form-group input-group-btn">
															<button class="btn btn-danger" type="button" onclick="loadForm()">Load</button>
												  		</span>
		                                            
		                                            </div>
		                                            
		                                            
		                                        </div>
	                <!-- this div added purposely to hide this part of the form -->			    	
					<div id="styleRec_1_hide">                 				    	
	                 				    	
	                 				    
	                 				    <div class="form-group">
                                            <label>Week no</label>
                                            <input id="weekNo" class="form-control" placeholder="Please enter week no" name="weekNo" />
                                        </div>
	                 				    	           					
                                        
                                        <div class="form-group">
                                            <label>Style new/repeat</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="styleType" id="optionsRadios1" value="n" checked />New
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="styleType" id="optionsRadios2" value="r"/>Repeat
                                                </label>
                                            </div>
                                            
                                            
                                        </div>
                                        
                                        
                                        
                                        <div class="form-group">
                                            <label>Module no</label>
                                            <input id="moduleNo" class="form-control" placeholder="Please enter module no" name="moduleNo" />
                                        </div>
                                        
                                        <div class = "row">
                                        
                                        <div class="col-md-3">
                                        
                                        <div class="form-group">
                                            <label>Pre machine setting</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="machineSetting" id="optionsRadios1" value="1" checked />True
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="machineSetting" id="optionsRadios2" value="0"/>False
                                                </label>
                                            </div>
                                            
                                            
                                        </div>
                                        
                                        </div>
                                        
                                         <div class="col-md-3">
                                        
                                        <div class="form-group">
                                            <label>Pre training</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="preTraining" id="optionsRadios3" value="1" checked />True
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="preTraining" id="optionsRadios4" value="0"/>False
                                                </label>
                                            </div>
                                            
                                        </div>
                                            
                                        </div>
                                        
                                         <div class="col-md-3">
                                        
                                        <div class="form-group">
                                            <label>Pre bulk</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="preBulk" id="optionsRadios5" value="1" checked />True
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="preBulk" id="optionsRadios6" value="0"/>False
                                                </label>
                                            </div>
                                            
                                        </div>
                                            
                                        </div>
                                        
                                        <div class="col-md-3">
                                        
                                        <div class="form-group">
                                            <label>Predictability</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="predictability" id="optionsRadios1" value="1" checked />True
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="predictability" id="optionsRadios2" value="0"/>False
                                                </label>
                                            </div>
                                            
                                            
                                        </div>
                                        
                                        </div>
                                        
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                            <label>Feeding time</label>
                                            <input id="feedingTime" class="form-control" placeholder="Please enter feeding time" name="feedingTime" />
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>QCO time</label>
                                            <input id="QCOTime" class="form-control" placeholder="Please enter QCO time" name="QCOTime" />
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                            <label>Relative similarity rank</label>
                                            <input id="similarityRank" class="form-control" placeholder="Please enter relative similarity rank" name="similarityRank" />
                                        </div>
	                 					
	                 					<div class="form-group">
                                            
                                            <input type="submit" class="btn btn-danger" value="Submit" />
                                            <input type="button" class="btn btn-danger" value="Update" />
                                            <input type="reset" class="btn btn-danger" value="Reset" />
                                        </div>
					</div>         
	                 					
									</form>
	                 				
	                 			
	                 			
	                 			</div>
	                 		
	                 		</div>
	                 	
	                 	
	                 	</div>
	                 	
	                 
	                 </div>
	                  
	            </div>
		    	
	    	<!-- /. row  -->	
	    	</div>
	    	
	<!-- this div added purposely to hide this part of the form -->
	<div id="styleRec_2_hide">	    	
			<!-- Begining of tabs-->
			<div class="row">
	    		
	    		<div class="col-md-9">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
	                 	
	                 		First five day details
	                 		
	                 	</div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 	
	                 		<div class="col-md-8">
	                 		
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
			                                	
							                <form id="styleDayOneForm" action="styleDayOne" method="post"> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input id="dayOneClocked" class="form-control" placeholder="Please enter day 1 clocked hours" name="dayOneClocked" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input id="dayOneProduced" class="form-control" placeholder="Please enter day 1 produced hours" name="dayOneProduced" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input id="dayOneTotalInspected" class="form-control" placeholder="Please enter day 1 total inspected garments" name="dayOneTotalInspected" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input id="dayOneTotalPassed" class="form-control" placeholder="Please enter day 1 total first time passed garments" name="dayOneTotalPassed" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 		</form>                    
			              			 	</div>

			                            <div class="tab-pane fade" id="day2">
			                                	<form id="styleDayTwoForm" action="styleDayTwo" method="post"> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input id="dayTwoClocked" class="form-control" placeholder="Please enter day 2 clocked hours" name="dayTwoClocked" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input id="dayTwoProduced" class="form-control" placeholder="Please enter day 2 produced hours" name="dayTwoProduced" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input id="dayTwoTotalInspected" class="form-control" placeholder="Please enter day 2 total inspected garments" name="dayTwoTotalInspected" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input id="dayTwoTotalPassed" class="form-control" placeholder="Please enter day 2 total first time passed garments" name="dayTwoTotalPassed" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 			</form>
				                                	
				                                	
				                                	
	
			                                </div>
			                                
			                                
			                                <div class="tab-pane fade" id="day3">
			                                
				                                	<form id="styleDayThreeForm" action="styleDayThree" method="post"> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input id="dayThreeClocked" class="form-control" placeholder="Please enter day 3 clocked hours" name="dayThreeClocked" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input id="dayThreeProduced" class="form-control" placeholder="Please enter day 3 produced hours" name="dayThreeProduced" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input id="dayThreeTotalInspected" class="form-control" placeholder="Please enter day 3 total inspected garments" name="dayThreeTotalInspected" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input id="dayThreeTotalPassed" class="form-control" placeholder="Please enter day 3 total first time passed garments" name="dayThreeTotalPassed" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 				</form>
				                                	
				                                	
	
			                                </div>
			                                
			                                <div class="tab-pane fade" id="day4">
			                                
				                                	<form id="styleDayFourForm" action="styleDayFour" method="post"> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input id="dayFourClocked" class="form-control" placeholder="Please enter day 4 clocked hours" name="dayFourClocked" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input id="dayFourProduced" class="form-control" placeholder="Please enter day 4 produced hours" name="dayFourProduced" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input id="dayFourTotalInspected" class="form-control" placeholder="Please enter day 4 total inspected garments" name="dayFourTotalInspected" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input id="dayFourTotalPassed" class="form-control" placeholder="Please enter day 4 total first time passed garments" name="dayFourTotalPassed" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 				</form>
				                                	
				                                	
	
			                                </div>
			                                
			                                
			                                <div class="tab-pane fade" id="day5">
			                                
			                                		<form id="styleDayFiveForm" action="styleDayFive" method="post"> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input id="dayFiveClocked" class="form-control" placeholder="Please enter day 5 clocked hours" name="dayFiveClocked" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input id="dayFiveProduced" class="form-control" placeholder="Please enter day 5 produced hours" name="dayFiveProduced" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input id="dayFiveTotalInspected" class="form-control" placeholder="Please enter day 5 total inspected garments" name="dayFiveTotalInspected" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input id="dayFiveTotalPassed" class="form-control" placeholder="Please enter day 5 total first time passed garments" name="dayFiveTotalPassed" />
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
       
	        <!-- Begining of tabs-->
			<div class="row">
	    		
	    		<div class="col-md-9">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
	                 	
	                 		Previous style last three days details
	                 		
	                 	</div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 	
	                 		<div class="col-md-7">
	                 		
	                 		<ul class="nav nav-tabs">
		                                <li class="active"><a href="#lastday" data-toggle="tab">Lastday</a>
		                                </li>
		                                <li ><a href="#lastday-1" data-toggle="tab">Lastday-1</a>
		                                </li>
		                                <li ><a href="#lastday-2" data-toggle="tab">Lastday-2</a>
		                                </li>
		                                
		                               
		                    </ul>
		                    
			                    <div class="tab-content">
			                                <div class="tab-pane fade active in" id="lastday">
			                                	
							                <form id="styleLastDayForm" action="styleLastDay" method="post"> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input id="dayLastClocked" class="form-control" placeholder="Please enter last day clocked hours" name="dayLastClocked" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input id="dayLastProduced" class="form-control" placeholder="Please enter last day produced hours" name="dayLastProduced" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input id="dayLastTotalInspected" class="form-control" placeholder="Please enter last day total inspected garments" name="dayLastTotalInspected" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input id="dayLastTotalPassed" class="form-control" placeholder="Please enter last day total first time passed garments" name="dayLastTotalPassed" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 		</form>
			                                	
			                                
			                                
			                </div>
			                                
			                                
			                                <div class="tab-pane fade" id="lastday-1">
			                                	
			                                	
			                                	<form id="styleLastDayTwoForm" action="styleLastDayTwo" method="post"> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input id="dayLastTwoClocked" class="form-control" placeholder="Please enter lastday-1 clocked hours" name="dayLastTwoClocked" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input id="dayLastTwoProduced" class="form-control" placeholder="Please enter lastday-1 produced hours" name="dayLastTwoProduced" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input id="dayLastTwoTotalInspected" class="form-control" placeholder="Please enter lastday-1 total inspected garments" name="dayLastTwoTotalInspected" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input id="dayLastTwoTotalPassed" class="form-control" placeholder="Please enter lastday-1 total first time passed garments" name="dayLastTwoTotalPassed" />
						                            </div>
						                            
						                            <div class="form-group">
						                                            
						                                   <input type="submit" class="btn btn-danger" value="Submit"  />
						                                   <input type="button" class="btn btn-danger" value="Update"  />
						                                   <input type="reset" class="btn btn-danger" value="Reset"  />
						                            </div>
				                            
					                 		
					                 			</form>
				                                	
				                                	
				                                	
	
			                                </div>
			                                
			                                
			                                <div class="tab-pane fade" id="lastday-2">
			                                
				                                	<form id="styleLastDayThreeForm" action="styleLastDayThree" method="post"> 
					                 	
							                 		<div class="form-group">
						                                   <label>Clocked hours</label>
						                                   <input id="dayLastThreeClocked" class="form-control" placeholder="Please enter lastday-2 clocked hours" name="dayLastThreeClocked" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Produced hours</label>
						                                   <input id="dayLastThreeProduced" class="form-control" placeholder="Please enter lastday-2 produced hours" name="dayLastThreeProduced" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total inspected garments</label>
						                                   <input id="dayLastThreeTotalInspected" class="form-control" placeholder="Please enter lastday-2 total inspected garments" name="dayLastThreeTotalInspected" />
						                            </div>
						                            
						                            <div class="form-group">
						                                   <label>Total first time passed garments</label>
						                                   <input id="dayLastThreeTotalPassed" class="form-control" placeholder="Please enter lastday-2 total first time passed garments" name="dayLastThreeTotalPassed" />
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
	        
	        <div class="form-group">
                       
              <p>Date: <input type="text" id="datepicker"></p>
              <a href="finishStyle" class="btn btn-danger square-btn-adjust">Finish style</a>
              
       		</div>
  </div>         
		<!-- End of page inner-->
		</div>
	
		

	
	</div>
	
	

</div>

	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
   		<!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery.validate.js"></script>
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
    <script src="assets/js/AddStyleRecords.js"></script>


</body>
</html>