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
        $("#drawChartNew").click(function() {
            drawChartNew();
        });
        
        $("#drawChartRepeat").click(function() {
            drawChartRepeat();
        });
        
        $("#drawChartAll").click(function() {
            drawChartAll();
        });

    }
    
    
    function setTitles(){
    	var selectedPlant = sessionStorage.selectedPlantName;
        alert("You have selected "+ selectedPlant);
        
        document.getElementById("topTitle").innerHTML = "MAS Active " + selectedPlant ;
        document.getElementById("panelHeadNew").innerHTML = "MAS Active " + selectedPlant + " New";
        document.getElementById("panelHeadRepeat").innerHTML = "MAS Active " + selectedPlant + " Repeat";
        document.getElementById("panelHeadAll").innerHTML = "MAS Active " + selectedPlant + " All";
    }
    
    
     
      // Callback that creates and populates a data table,
      // instantiates the pie chart, passes in the data and
      // draws it.
      function drawChartNew() {
		
    	 
    	  var e = document.getElementById("yearNew");
    	  var year = e.options[e.selectedIndex].text; 
    	  
    	  var selectedPlant = sessionStorage.selectedPlant;
    	  
    	  alert("You have selected "+ year);
    	  
    	 // drawChartCenter();
    	 var month;
    	
    	 var noOfNew;
    	 var newActual;
    	 
    	 var newTarget; 
    	
    	 var i;

    	newStyles= new Array(); // an array of "whatever"
    
    	newStyles[0]= new Array('Month', 'New Styles', 'Actual Efficiency', 'Target Efficiency');
    	
    	
    	
    	
    	 //Loading data from db
    	 $.ajax({

    		url: "centerChart",
    	    type: 'POST',
    	    dataType: 'json',
    	    data: {year:year , plantID:selectedPlant},
    	    async: false,
    	    success: function (data) {
    	    	
    	    	//alert(data.allMonthes[0].noOfNew);
    	    	//alert(data.allMonthes[0].noOfRepeat);
    	    	//alert(data.allMonthes[0].newActual);
    	    	//alert(data.allMonthes[0].repeatActual);
    	    	//alert(data.allMonthes[0].newTarget);
    	    	//alert(data.allMonthes[0].repeatTarget);
    	    	
    	    	
    	    	
    	    	for (i = 0; i < 12; i++) {
    	    		
    	    	
	    	    	month = data.allMonthes[i].month;
	    	    	
	    	    	
	    	    	if(month==1){
	    	    		month = "Jan";
	    	    	} else if (month == 2){
	    	    		month = "Feb";
	    	    	} else if (month == 3){
	    	    		month = "Mar";
	    	    	} else if (month == 4){
	    	    		month = "Apr";
	    	    	} else if (month == 5){
	    	    		month = "May";
	    	    	} else if (month == 6){
	    	    		month = "Jun";
	    	    	} else if (month == 7){
	    	    		month = "Jul";
	    	    	} else if (month == 8){
	    	    		month = "Aug";
	    	    	} else if (month == 9){
	    	    		month = "Sep";
	    	    	} else if (month == 10){
	    	    		month = "Oct";
	    	    	} else if (month == 11){
	    	    		month = "Nov";
	    	    	} else if (month == 12){
	    	    		month = "Dec";
	    	    	} 
	    	    	
	    	    	
	    	    	noOfNew = data.allMonthes[i].noOfNew;
	    	    
	    	    	//noOfRepeat = data.allMonthes[i].noOfRepeat;
	    	    	newActual = data.allMonthes[i].newActual;
	    	    	//repeatActual = data.allMonthes[i].repeatActual;
	    	    	newTarget = data.allMonthes[i].newTarget;
	    	    	//repeatTarget = data.allMonthes[i].repeatTarget;
	    	    	
	    	    	newStyles[i+1]= new Array(month,noOfNew,newActual,newTarget);
    	    		
	    	    	
	    	    	
    	    	}
    	    }
    		
    	}); 
    	 
    	
     	
     
     	
     	//alert(newStyles[1][0]);
    	  
        // Create the data table.
       	//alert(noOfNew);
        
     
        
        var data = google.visualization.arrayToDataTable(newStyles);
        
        
      
       
        // Set chart options
       var options = {
      title : 'Center new styles',
      vAxis: {title: 'Efficiency'},
      hAxis: {title: 'Month'},
      seriesType: 'bars',
      series: {1: {type: 'line'} , 2: {type: 'line'} }
    };


        // Instantiate and draw our chart, passing in some options.
       var chart = new google.visualization.ComboChart(document.getElementById('chart_div_new'));
       chart.draw(data, options);

      }
      
      
      function drawChartRepeat() {
  		
    	  var e = document.getElementById("yearRepeat");
    	  var year = e.options[e.selectedIndex].text; 
    	  
    	  var selectedPlant = sessionStorage.selectedPlant;
    	  
    	  alert("You have selected "+ year); 
    	  
    	  
     	 // drawChartCenter();
     	 var month;
     	 var noOfRepeat;
     	
     	 var repeatActual; 
     
     	 var repeatTarget; 
     	 var i;

     	repeatStyles= new Array(); // an array of "whatever"
     
     	repeatStyles[0]= new Array('Month', 'Repeat Styles', 'Actual Efficiency', 'Target Efficiency');
     	
     	
     	
     	
     	 //Loading data from db
     	 $.ajax({

     		url: "centerChart",
     	    type: 'POST',
     	    dataType: 'json',
     	    data: {year:year , plantID:selectedPlant},
     	    async: false,
     	    success: function (data) {
     	    	
     	    	//alert(data.allMonthes[0].noOfNew);
     	    	//alert(data.allMonthes[0].noOfRepeat);
     	    	//alert(data.allMonthes[0].newActual);
     	    	//alert(data.allMonthes[0].repeatActual);
     	    	//alert(data.allMonthes[0].newTarget);
     	    	//alert(data.allMonthes[0].repeatTarget);
     	    	
     	    	
     	    	
     	    	for (i = 0; i < 12; i++) {
     	    		
     	    	
 	    	    	month = data.allMonthes[i].month;
 	    	    	
 	    	    	
 	    	    	
 	    	    	if(month==1){
 	    	    		month = "Jan";
 	    	    	} else if (month == 2){
 	    	    		month = "Feb";
 	    	    	} else if (month == 3){
 	    	    		month = "Mar";
 	    	    	} else if (month == 4){
 	    	    		month = "Apr";
 	    	    	} else if (month == 5){
 	    	    		month = "May";
 	    	    	} else if (month == 6){
 	    	    		month = "Jun";
 	    	    	} else if (month == 7){
 	    	    		month = "Jul";
 	    	    	} else if (month == 8){
 	    	    		month = "Aug";
 	    	    	} else if (month == 9){
 	    	    		month = "Sep";
 	    	    	} else if (month == 10){
 	    	    		month = "Oct";
 	    	    	} else if (month == 11){
 	    	    		month = "Nov";
 	    	    	} else if (month == 12){
 	    	    		month = "Dec";
 	    	    	} 
 	    	    	
 	    	    	
 	    	    
 	    	    
 	    	    	noOfRepeat = data.allMonthes[i].noOfRepeat;
 	    	    	
 	    	    	repeatActual = data.allMonthes[i].repeatActual;
 	    	    
 	    	    	repeatTarget = data.allMonthes[i].repeatTarget;
 	    	    	
 	    	    	repeatStyles[i+1]= new Array(month,noOfRepeat,repeatActual,repeatTarget);
     	    		
 	    	    	
 	    	    	
     	    	}
     	    }
     		
     	}); 
     	 
     	
      	
      
      	
      	//alert(repeatStyles[1][0]);
     	  
         // Create the data table.
        	//alert(noOfNew);
         
      
         
         var data = google.visualization.arrayToDataTable(repeatStyles);
         
         
       
        
         // Set chart options
        var options = {
       title : 'Center repeat styles',
       vAxis: {title: 'Efficiency'},
       hAxis: {title: 'Month'},
       seriesType: 'bars',
       series: {1: {type: 'line'} , 2: {type: 'line'} }
     };


         // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.ComboChart(document.getElementById('chart_div_repeat'));
        chart.draw(data, options);

       }
      
      
      
      function drawChartAll() {
    		
    	  var e = document.getElementById("yearAll");
    	  var year = e.options[e.selectedIndex].text; 
    	  
    	  var selectedPlant = sessionStorage.selectedPlant;
    	  
    	  alert("You have selected "+ year);  
    	  
      	 // drawChartCenter();
      	 var month;
      	 
      	var averageEfficiency; 
      	var newTarget; 
      	 var repeatTarget; 
      	 var i;

      	allStyles= new Array(); // an array of "whatever"
      
      	allStyles[0]= new Array('Month', 'New Target', 'Repeat Target', 'Average Efficiency');
      	
      	
      	
      	
      	 //Loading data from db
      	 $.ajax({

      		url: "centerChart",
      	    type: 'POST',
      	    dataType: 'json',
      	    data: {year:year , plantID:selectedPlant},
      	    async: false,
      	    success: function (data) {
      	    	
      	    	//alert(data.allMonthes[0].noOfNew);
      	    	//alert(data.allMonthes[0].noOfRepeat);
      	    	//alert(data.allMonthes[0].newActual);
      	    	//alert(data.allMonthes[0].repeatActual);
      	    	//alert(data.allMonthes[0].newTarget);
      	    	//alert(data.allMonthes[0].repeatTarget);
      	    	
      	    	
      	    	
      	    	for (i = 0; i < 12; i++) {
      	    		
      	    	
  	    	    	month = data.allMonthes[i].month;
  	    	    	
  	    	    	
  	    	    	
  	    	    	if(month==1){
  	    	    		month = "Jan";
  	    	    	} else if (month == 2){
  	    	    		month = "Feb";
  	    	    	} else if (month == 3){
  	    	    		month = "Mar";
  	    	    	} else if (month == 4){
  	    	    		month = "Apr";
  	    	    	} else if (month == 5){
  	    	    		month = "May";
  	    	    	} else if (month == 6){
  	    	    		month = "Jun";
  	    	    	} else if (month == 7){
  	    	    		month = "Jul";
  	    	    	} else if (month == 8){
  	    	    		month = "Aug";
  	    	    	} else if (month == 9){
  	    	    		month = "Sep";
  	    	    	} else if (month == 10){
  	    	    		month = "Oct";
  	    	    	} else if (month == 11){
  	    	    		month = "Nov";
  	    	    	} else if (month == 12){
  	    	    		month = "Dec";
  	    	    	} 
  	    	    	
  	    	   
  	      	    	//alert(data.allMonthes[0].newActual);
  	      	    	//alert(data.allMonthes[0].repeatActual);
  	      	    	//alert(data.allMonthes[0].newTarget);
  	      	    	//alert(data.allMonthes[0].repeatTarget);
  	    	    
  	    	    
  	    	
  	    	    	newTarget = data.allMonthes[i].newTarget;

  	    	    	repeatTarget = data.allMonthes[i].repeatTarget;
  	    	    	averageEfficiency = data.allMonthes[i].averageEfficiency;
  	    	    	
  	    	    	allStyles[i+1]= new Array(month,newTarget,repeatTarget,averageEfficiency);
      	    		
  	    	    	
  	    	    	
      	    	}
      	    }
      		
      	}); 
      	 
      	
       	
       
       	
       	//alert(repeatStyles[1][0]);
      	  
          // Create the data table.
         	//alert(noOfNew);
          
       
          
          var data = google.visualization.arrayToDataTable(allStyles);
          
          
        
         
          // Set chart options
         var options = {
        title : 'Center all styles',
        vAxis: {title: 'Efficiency'},
        hAxis: {title: 'Month'},
        seriesType: 'line',
        
      };


          // Instantiate and draw our chart, passing in some options.
         var chart = new google.visualization.ComboChart(document.getElementById('chart_div_all'));
         chart.draw(data, options);

        }
      

    </script>
    
   

</head>
<body onload= "setTitles()">

<div id="wrapper">

	<%@ include file="header.jsp" %> 

	
	<div id="page-wrapper">
	
		<div id="page-inner"> 
			
			<div class="row">
	    	
		    	<div class="col-md-12">
	                 <h3 id="topTitle">MAS Active Charts</h3>   
	                 
	                  
	            </div>
	    	<!-- /. row  -->	
	    	</div>
	    	
	    	<hr>
			
			
			
			
			
			<div class="row">
	    		
	    		<div class="col-md-12">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading" id="panelHeadNew">
                            MAS Active Total New
                            
                            
                            
                        </div>
	                 	
	                 	<div class="panel-body">
	                 		
	                 		<div class="row">
	                 			<div class="col-md-4">
	                 			
	                 			<form>
	                 				<div class="form-group">
	                 				
		                 				<select id="yearNew" class="form-control">
		                 					<option>2013 </option>
		                 					<option>2014 </option>
		                 					<option>2015 </option>
		                 				</select>
	                 				</div>
	                 			</form>
	                 		
	                 			<button id="drawChartNew" class= "btn btn-danger " > Draw Chart - New styles</button>
	                 			
	                 			</div>
	                 			
	                 		</div>
	                 		
	                 		
	                 		<div class="row">

	                 			<!--Div that will hold the pie chart-->
	                 			<div id="chart_div_new" style="width: 800px; height: 400px;"></div>

	    
	                 			<!-- /.col-md-10  -->
	                 		</div>
	                 		
	                 		</div>
	                 	
	                 	<!-- /.panel body  -->
	                 	</div>
	                 	
	                 
	                 </div>
	                  
	            </div>
		    	
	    	<!-- /. row  -->	
	    	
	    	
	    		<div class="row">
	    		
	    		<div class="col-md-12">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading" id= "panelHeadRepeat">
                            MAS Active Total Repeat
                        </div>
	                 	
	                 	<div class="panel-body">
	                 	
	                 		<div class="row">
	                 			
	                 			<div class="col-md-4">
	                 		
	                 			<form>
	                 				<div class="form-group">
	                 				
		                 				<select id="yearRepeat" class="form-control">
		                 					<option>2013 </option>
		                 					<option>2014 </option>
		                 					<option>2015 </option>
		                 				</select>
	                 				</div>
	                 			</form>
	                 		
	                 			<button id="drawChartRepeat" class= "btn btn-danger " > Draw Chart - Repeat styles </button>
	                 			
	                 			</div>
	                 			
	                 		</div>
	                 	
	                 		<div class="row">
	                 		
	                 			
	                 		
	                 			<!--Div that will hold the pie chart-->
	                 			<div id="chart_div_repeat" style="width: 800px; height: 400px;"></div>

	    
	                 			<!-- /.col-md-6  -->
	                 			</div>
	                 		
	                 		</div>
	                 	
	                 	<!-- /.panel body  -->
	                 	</div>
	                 	
	                 
	                 </div>
	                  
	            </div>
	            
	            <div class="row">
	    		
	    		<div class="col-md-12">
	                 
	                 <div class="panel panel-default">
	                 	
	                 	<div class="panel-heading" id= "panelHeadAll">
                            MAS Active all styles
                        </div>
	                 	
	                 	<div class="panel-body">
	                 		
	                 		<div class="row">
	                 		
	                 			<div class="col-md-4">
	                 		
		                 			<form>
		                 				<div class="form-group">
		                 				
			                 				<select id="yearAll" class="form-control">
			                 					<option>2013 </option>
			                 					<option>2014 </option>
			                 					<option>2015 </option>
			                 				</select>
		                 				</div>
		                 			</form>
	                 		
	                 				<button id="drawChartAll" class= "btn btn-danger " > Draw chart - all styles </button>
	                 			
	                 			</div>
	                 			
	                 		</div>
	                 		
	                 		<div class="row">
	                 		
	                 			
	                 		
	                 			<!--Div that will hold the pie chart-->
	                 			<div id="chart_div_all" style="width: 800px; height: 400px;"></div>

	    
	                 			<!-- /.col-md-6  -->
	                 			</div>
	                 		
	                 		</div>
	                 	
	                 	<!-- /.panel body  -->
	                 	</div>
	                 	
	                 
	                 </div>
	                  
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