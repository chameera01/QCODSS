
/* this function post styleNo to save in session and 
 * afterward enable rest of the style record form 
 */
function loadTableContent(){
	
	//var styleNo = $("#styleNo").val();
	
	var tableContent = [];
		
	$.ajax({
	    url: "WkSummary",
	    type: 'POST',
	    dataType: 'json',
	    //data: {styleNo:styleNo, stylePlantID:stylePlantID},
	    async: false,
	    success: function (data) {
	    	
	    	$.each(data.allWeeklyReports, function(k, v) {
	    		//var count = 0;
	    		var row = [];
	    		$.each(data.allWeeklyReports[k], function(key, val){
	    			
	    			row[key] = val;
		    	   //alert(key+" : "+val);
		    	   
		    	   //count ++;
	    		});
	    		tableContent[k] = row;
	    	});
	    }
	});
	
	return tableContent;
}

function initialize () {
    $(/* click event element selector */).click(function() {
    	alert("");
        drawTable();
    });
}


function drawTable() {
	
	var tableContent = [];
	var row = [];
	var temp  = loadTableContent();
	
	for(var i=0; i<temp.length; i++){

			row[0] = temp[i].numberOfNew ;
			row[1] = temp[i].numberOfRepeat ;
			row[2] = temp[i].averageQCOTime ;
			row[3] = temp[i].avgEff_1 ;
			row[4] = temp[i].avgEff_2 ;
			row[5] = temp[i].avgEff_3 ;
			row[6] = temp[i].avgEff_4 ;
			row[7] = temp[i].avgEff_5 ;
			row[8] = temp[i].avgEff_1d ;
			row[9] = temp[i].avgEff_2d ;
			row[10] = temp[i].avgEff_3d ;
			row[11] = temp[i].avgEff_new123 ;
			row[12] = temp[i].avgEff_repeat123 ;
			row[13] = temp[i].avgEff_123 ;
			row[14] = temp[i].EPR_123n ;
			row[15] = temp[i].EPR_123r ;
			row[16] = temp[i].EPR_123 ;
			row[17] = temp[i].avgFeedingTime ;
			row[18] = temp[i].fullPresettingHR ;
			row[19] = temp[i].abHR ;
			
			row[20] = temp[i].avgEff_newTarget ;
			row[21] = temp[i].avgEff_repeatTarget ;
			row[22] = temp[i].avgEff_45 ;

		tableContent[i] = row;
		
	}

	var data = new google.visualization.DataTable();
	alert("@@@--- "+tableContent[0].averageQCOTime);
	
	data.addColumn('number', 'Week');
	data.addColumn('number', 'New');
	data.addColumn('number', 'Repeat');
	data.addColumn('number', 'Average QCO time');
	data.addColumn('number', '1day');
	data.addColumn('number', '2day');
	data.addColumn('number', '3day');
	data.addColumn('number', 'New');
	data.addColumn('number', 'Repeat');
	data.addColumn('number', '1st 3Days -EFF Avg');
	data.addColumn('number', 'New');
	data.addColumn('number', 'Repeat');
	data.addColumn('number', '1st 3Days -Endline Pass Rate Avg.');
	data.addColumn('number', 'Average Feeding Time');
	data.addColumn('number', '1st 3Days Bucket Loss(STD Hrs)');
	data.addColumn('number', 'Full Presetting Hit rate');
	data.addColumn('number', '4th &5th  Days -EFF Avg.');
	data.addColumn('number', 'Silhouette based hit rate');
	
	data.addColumn('number', 'Average Feeding Time');
	data.addColumn('number', '1st 3Days Bucket Loss(STD Hrs)');
	data.addColumn('number', 'Full Presetting Hit rate');
	data.addColumn('number', '4th &5th  Days -EFF Avg.');
	data.addColumn('number', 'Silhouette based hit rate');
	
	data.addRows(tableContent);
	
	var table = new google.visualization.Table(document.getElementById('table_div'));
	
	table.draw(data, {showRowNumber: true, width: '100%', height: '100%'});
}

