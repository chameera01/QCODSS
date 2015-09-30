<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="s" uri="/struts-tags"  %>    
    
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QCODSS | Add user</title>

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

	


</script>

</head>
<body>


<div id="wrapper">

	<%@ include file="header.jsp" %> 

	
	<div id="page-wrapper">
	
		<div id="page-inner"> 
				
				<div class="row">
	    		
	    		<div class="col-md-8">	
		
			     <div class="panel panel-default ">
	                 
	                 	
	                 	
	                 	
	                 	<div class="panel-heading">
                         	Authenticated users 
                        </div>
                        
                        
                        <div class="panel-body">
                        
                        	<div class="row"> 
                        			
                        		 <div class="col-md-8">	
                        			
                        		  <form action="viewAllUsers" method="post">
                        		  	
                       		  			<div class="form-group">
                                           
                                           
                                           <input type="submit" class="btn btn-danger" value="View authenticated users"  />
                                           
                                           <hr>
                                           
                                           		<table class="table table-bordered">
                                           			
                                           			<thead>
												      <tr>
												        <th>Name</th>
												        <th>email</th>
												        <th>Role</th>
												        <th>Plant</th>
												      </tr>
												    </thead>
                                           			
                                           			<tbody>
                                           			
                                           		<s:iterator value="allUsers" var="allUsers">
                                           		
 
													<tr>
													    <td><s:property value="#allUsers.name" /></td>
													    <td><s:property value="#allUsers.email" /></td>
													    <td><s:property value="#allUsers.role" /></td>
													    <td><s:property value="#allUsers.plantid.name" /></td>
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
		
		
		
		
		
		
		
			
			<div class="row">
	    	
		    	<div class="col-md-12">
	                 <h3>Add new user</h3>   
	                  
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    
			
			<div class="row">
	    		
	    		<div class="col-md-8">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
                            Fill the required data about user to authenticate 
                        </div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 			<div class="col-md-6">
	                 				
	                 				<form action="adduser" method = "post"> 
	                 					
	                 					<div class="form-group">
                                            <label>Name</label>
                                            <input class="form-control" placeholder="Enter  name" name="name" />
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>email</label>
                                            <input class="form-control" placeholder="Enter  MAS email" name="email" />
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Password</label>
                                            <input class="form-control" type="password" placeholder="Enter  password" name="password" />
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Re enter password</label>
                                            <input class="form-control" type="password" placeholder="Re enter  password" name="" />
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>User level</label>
                                            <select class="form-control" name="userlevel">
                                                <option>Recorder</option>
                                                <option>Viewer</option>
                                                <option>Top</option>
                                                
                                            </select>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Select plant</label>
                                            <select class="form-control" name="plant">
                                                <option>Shadowline</option>
                                                <option>Leisureline</option>
                                                <option>Contourline</option>
                                                <option>Shadeline</option>
                                                <option>Nirmana</option>
                                                <option>Sleekline</option>
                                                <option>Synergy</option>
                                                <option>Vaanavil</option>
                                                <option>Asialine</option>
                                                <option>Mihintale</option>
                                                <option>DM Lanka</option>
                                                <option>Active center</option>
                                                
                                                
                                            </select>
                                        </div>
	                 					
	                 					
	                 					<div class="form-group">
                                            
                                            
                                            <input type="submit" class="btn btn-danger" value="Save"  />
                                            <input type="button" disabled="disabled" class="btn btn-danger" value="Inform user"  />
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