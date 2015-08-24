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
	                 			<div class="col-md-8">
	                 				
	                 				<form> 
	                 					
	                 					<div class="form-group">
                                            <label>Style no</label>
                                            <input class="form-control" placeholder="Please enter style no" name="" />
                                        </div>
	                 					
	                 					
                                        
                                        <div class="form-group">
                                            <label>Style new/repeat</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked />New
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"/>Repeat
                                                </label>
                                            </div>
                                            
                                            
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Style started date</label>
                                            <input class="form-control" placeholder="Please style started date" name="" />
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Module no</label>
                                            <input class="form-control" placeholder="Please enter module no" name="" />
                                        </div>
                                        
                                        <div class = "row">
                                        
                                        <div class="col-md-3">
                                        
                                        <div class="form-group">
                                            <label>Pre machine setting</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios1" id="optionsRadios1" value="option1" checked />True
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios1" id="optionsRadios2" value="option2"/>False
                                                </label>
                                            </div>
                                            
                                            
                                        </div>
                                        
                                        </div>
                                        
                                         <div class="col-md-3">
                                        
                                        <div class="form-group">
                                            <label>Pre training</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios2" id="optionsRadios3" value="option3" checked />True
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios2" id="optionsRadios4" value="option4"/>False
                                                </label>
                                            </div>
                                            
                                        </div>
                                            
                                        </div>
                                        
                                         <div class="col-md-3">
                                        
                                        <div class="form-group">
                                            <label>Pre bulk</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios3" id="optionsRadios5" value="option5" checked />True
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios3" id="optionsRadios6" value="option6"/>False
                                                </label>
                                            </div>
                                            
                                        </div>
                                            
                                        </div>
                                        
                                        <div class="col-md-3">
                                        
                                        <div class="form-group">
                                            <label>Predictability</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios4" id="optionsRadios1" value="option7" checked />True
                                                </label>
                                            </div>
                                            
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios4" id="optionsRadios2" value="option8"/>False
                                                </label>
                                            </div>
                                            
                                            
                                        </div>
                                        
                                        </div>
                                        
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                            <label>Feeding time</label>
                                            <input class="form-control" placeholder="Please enter feeding time" name="" />
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>QCO time</label>
                                            <input class="form-control" placeholder="Please enter QCO time" name="" />
                                        </div>
                                        
                                        
                                        <div class="form-group">
                                            <label>Relative similarity rank</label>
                                            <input class="form-control" placeholder="Please enter relative similarity rank" name="" />
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
		    	
	    	<!-- /. row  -->	
	    	</div>
	    	
			<!-- Begining of tabs-->
			<div class="row">
	    		
	    		<div class="col-md-9">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
	                 	
	                 		First five day details
	                 		
	                 	</div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 	
	                 		<div class="col-md-7">
	                 		
	                 		<ul class="nav nav-tabs">
		                                <li class="active"><a href="#day1" data-toggle="tab">Day 01</a>
		                                </li>
		                                <li class=""><a href="#day2" data-toggle="tab">Day 02</a>
		                                </li>
		                                <li class="active"><a href="#day3" data-toggle="tab">Day 03</a>
		                                </li>
		                                <li class="active"><a href="#day4" data-toggle="tab">Day 04</a>
		                                </li>
		                                <li class="active"><a href="#day5" data-toggle="tab">Day 05</a>
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
	        
	        
	        
	               
		<!-- End of page inner-->
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