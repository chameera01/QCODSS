<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"  %>       
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QCODSS | Add plant</title>

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
	
	<script type="text/javascript">

	function deletePlant(plantID){
		alert("Deleting plant "+ plantID);
		
		
		
	}


	</script>
	
	
	
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
	                 <h3>Add plant information</h3>   
	                  
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	<hr>
			
			<div class="row">
	    		
	    		<div class="col-md-8">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
                            Fill the required data about plant to authenticate it in the system
                        </div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 			<div class="col-md-6">
	                 				
	                 				<form action="addplant" method = "post"> 
	                 					
	                 					<div class="form-group">
                                            <label>Plant name</label>
                                            <input class="form-control" placeholder="Please enter plant name" name="name" />
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
		    	
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	
	    	
	    	<div class="row">
	    		
	    		<div class="col-md-8">	
		
			     <div class="panel panel-default ">
	                 
	                 	
	                 	
	                 	
	                 	<div class="panel-heading">
                         	Authenticated plants
                        </div>
                        
                        
                        <div class="panel-body">
                        
                        	<div class="row"> 
                        			
                        		 <div class="col-md-8">	
                        			
                        		  <form action="viewAllPlants" method="post">
                        		  	
                       		  			<div class="form-group">
                                           
                                           
                                           <input type="submit" class="btn btn-danger" value="View list of plants"  />
                                           
                                           <hr>
                                           
                                           		<table class="table table-bordered">
                                           			
                                           			<thead>
												      <tr>
												      	<th style="display:none;">ID</th>
												        <th>Plant name</th>
												        <th>Action</th>
												        
												      </tr>
												    </thead>
                                           			
                                           			<tbody>
                                           			
                                           		<s:iterator value="allPlants" var="allPlants">
                                           		
 
													<tr>
														<td style="display:none;"> <s:property value="#allPlants.id" /> </td>
													    <td><s:property value="#allPlants.name" /></td>
													    
													    <td> <button onclick="deletePlant(<s:property value="#allPlants.id" />)" id="<s:property value="#allPlants.id" />" class="btn btn-danger">Delete</button></td>
													</tr>
													
													
                                           		 </s:iterator>

                                            </tbody>	
                                            
                                           	</table>
                                       </div>
                        		  	   
                        		  	   
                        		  	   	
                        		  		
                        		  </form>
                        		  
                        		  
                        		
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