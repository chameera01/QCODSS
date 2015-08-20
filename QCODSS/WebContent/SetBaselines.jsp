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
		                                	
		                                	<form> 
	                 					
			                 					<div class="form-group">
			                                            <label>Select year</label>
			                                            <select class="form-control">
			                                                
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
		                                            <input class="form-control" placeholder="Enter  new target" name="" />
		                                        </div>
		                                        
		                                        <div class="form-group">
		                                            <label>Enter yearly target efficiency for repeat styles</label>
		                                            <input class="form-control" placeholder="Enter repeat target   " name="" />
		                                        </div>
			                 					
			                 					
			                 					<div class="form-group">
		                                            
		                                            <input type="submit" class="btn btn-danger" value="Save"  />
		                                            <input type="reset" class="btn btn-danger" value="Reset"  />
		                                        </div>
	                 					
	                 				
	                 						</form>
		                                	
		                                
		                                
		                                </div>
		                                
		                                
		                                <div class="tab-pane fade" id="profile">
		                                
			                                <form> 
			                                
			                                		<div class="form-group">
			                                            <label>Select year</label>
			                                            <select class="form-control">
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
			                                            <label>Monthly budgeted efficiency</label>
			                                            <input class="form-control" placeholder="Enter  name" name="" />
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