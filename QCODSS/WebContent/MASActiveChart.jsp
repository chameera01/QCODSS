<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MAS Active chart</title>

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

	
	<!--Load the AJAX API-->
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    
    
    
    <script type="text/javascript">
    
	 
    
    
    //Function to draw the chart
    //function drawChartCenter(){

    	
    	
    //}	
    
    
 	// Set a callback to run when the Google Visualization API is loaded.
    google.setOnLoadCallback(initializeCharts);

    // Load the Visualization API and the piechart package.
    google.load('visualization', '1.0', {'packages':['corechart']});

    // drawChart() function is initialized in click event
    function initializeCharts () {
        $("#drawChart").click(function() {
            drawChart();
        });
    }
     
      // Callback that creates and populates a data table,
      // instantiates the pie chart, passes in the data and
      // draws it.
      function drawChart() {
		
    	  
    	 // drawChartCenter();
    	 
    	 //Loading data from db
    	 $.ajax({

    		url: "centerChart",
    	    type: 'POST',
    	    dataType: 'json',
    	    data: {styleNo:1},
    	    async: false,
    	    success: function (data) {
    	    	
    	    	alert(data.allMonthes[0].noOfNew);
    	    	alert(data.allMonthes[0].noOfRepeat);
    	    	alert(data.allMonthes[0].repeatTarget);
    	    	
    	    	alert(data.allMonthes[1].noOfNew);
    	    	alert(data.allMonthes[1].noOfRepeat);
    	    	alert(data.allMonthes[1].repeatTarget);
    	    	
    	    }
    		
    	}); 
    	 
    	
    	  
        // Create the data table.
       
        
        var data = google.visualization.arrayToDataTable([
            ['Month', 'Bolivia', 'Ecuador', 'Madagascar', 'Papua New Guinea', 'Rwanda', 'Average'],
            ['2004/05',  165,      938,         522,             998,           450,      614.6],
            ['2005/06',  135,      1120,        599,             1268,          288,      682],
            ['2006/07',  157,      1167,        587,             807,           397,      623],
            ['2007/08',  139,      1110,        615,             968,           215,      609.4],
            ['2008/09',  136,      691,         629,             1026,          366,      569.6]
         ]);


        // Set chart options
       var options = {
      title : 'Monthly Coffee Production by Country',
      vAxis: {title: 'Cups'},
      hAxis: {title: 'Month'},
      seriesType: 'bars',
      series: {5: {type: 'line'}}
    };


        // Instantiate and draw our chart, passing in some options.
       var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
       chart.draw(data, options);

      }

    </script>
    
   

</head>
<body>

<div id="wrapper">

	<%@ include file="header.jsp" %> 

	
	<div id="page-wrapper">
	
		<div id="page-inner"> 
			
			<div class="row">
	    	
		    	<div class="col-md-12">
	                 <h3>MAS Active Charts</h3>   
	                 <button id="drawChart" > Draw CHart</button>
	                  
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	<hr>
			
			<div class="row">
	    		
	    		<div class="col-md-8">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading">
                            MAS Active Total New
                        </div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 		
	                 			<!--Div that will hold the pie chart-->
	                 			<div id="chart_div" style="width: 900px; height: 500px;"></div>

	                 				
	                 			
    							
	                 				
	                 				
	                 			
	                 			<!-- /.col-md-6  -->
	                 			</div>
	                 		
	                 		</div>
	                 	
	                 	<!-- /.panel body  -->
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