<%@page import="com.qcodss.model.Plant"%>
<%@page import="java.util.List"%>
<%@page import="com.qcodss.dao.PlantDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> header</title>

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
	
	
	<script>
		
	
		function getPlant(plantID, plantName){
			
			
			
			sessionStorage.selectedPlant= plantID ;
			sessionStorage.selectedPlantName= plantName ;
			
			window.location = "MASActiveChart.jsp";
			
		}
	
	</script>
	
</head>

<body>
		<%  
	
			if(session.getAttribute("id") == null){
				String redirectURL = "login.jsp";
				response.sendRedirect(redirectURL);
			}
			
		%>
	
		
		<nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">QCODSS </a> 
            </div>
  			<div style="color: white;
				padding: 15px 50px 5px 50px;
				float: right;
				font-size: 16px;"> Welcome <%= session.getAttribute("name") %>  &nbsp; <a href="logout" class="btn btn-danger square-btn-adjust">Logout</a> </div>
        </nav>
		
		
		<nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/find_user.png" class="user-image img-responsive"/>
					</li>

                    <li>
                        <a   href="index.jsp"><i class="fa fa-dashboard fa-3x"></i> QCO Dashboard</a>
                    </li>
                    
                    <li>
                        <a   href="FullPresettingDashboard.jsp"><i class="fa fa-file-text-o fa-3x "></i>  Full Presetting Details</a>
                    </li>
                    
                     <li>
                        <a   href="#"><i class="fa fa-desktop fa-3x"></i>  Bucketloss Details</a>
                    </li>
                    
                    
                     <li>
                        <a  href="#"><i class="fa fa-plus-square fa-3x"></i> Add Records</a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="AddStyleRecords.jsp">Add Style Records</a>
                            </li>
                            <li>
                                <a href="AddWeeklyRecords.jsp">Add Weekly Records</a>
                            </li>
                            
                            <li>
                                <a href="AddMonthlyRecords.jsp">Add Monthly Records</a>
                            </li>
                            
                        </ul>
                        
                    </li>
                    
                    
                    <li>
                        <a  href="#"><i class="fa fa-bar-chart-o fa-3x"></i>Charts</a>
                        
                        <ul class="nav nav-second-level">
                        
                        <%
                          //Loading plant list to the drop down
                          Plant plant = new Plant(); 
                          
                           List<Plant> allPlants =   PlantDAO.getAllPlants();
                           for(Plant p:allPlants){
           				   plant = p;
                           
			             %>
                        
                        
                            <li>
                                <a  href="#" onclick="getPlant(<%= plant.getId() %> , '<%= plant.getName() %>'  );return false;"><%= plant.getName()  %></a>
                            </li>
                            <% } %>
                            
                        </ul>
                    </li>
                    
                    
                    
                    
                    <li>
                        <a  href="AddUser.jsp"><i class="fa fa-user fa-3x"></i> Authenticate Users</a>
                    </li>
						   <li  >
                        <a   href="AddPlant.jsp"><i class="fa fa-home fa-3x"></i> Authenticate Plants</a>
                    </li>	
                    
                    <li  >
                        <a  href="SetBaselines.jsp"><i class="fa fa-wrench fa-3x"></i> Setup Baselines</a>
                    </li>
                      
                    	
                </ul>
               
            </div>
            
        </nav>  
		
		
		
		
		
		
		
	

<!-- 	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME--> -->
<!--     JQUERY SCRIPTS -->
<!--     <script src="assets/js/jquery-1.10.2.js"></script> -->
<!--       BOOTSTRAP SCRIPTS -->
<!--     <script src="assets/js/bootstrap.min.js"></script> -->
<!--     METISMENU SCRIPTS -->
<!--     <script src="assets/js/jquery.metisMenu.js"></script> -->
<!--      MORRIS CHART SCRIPTS -->
<!--      <script src="assets/js/morris/raphael-2.1.0.min.js"></script> -->
<!--     <script src="assets/js/morris/morris.js"></script> -->
<!--       CUSTOM SCRIPTS -->
<!--     <script src="assets/js/custom.js"></script> -->



</body>

</html>
