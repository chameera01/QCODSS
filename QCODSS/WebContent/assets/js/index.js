
function weeklySummaryTab() {
    window.open("weeklySummary.jsp");
}



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
	    		//var row = [];
	    		$.each(data.allWeeklyReports[k], function(key, val){
	    			
	    			//row[key] = val;
		    	   alert(key+" : "+val);
		    	   
		    	   //count ++;
	    		});
	    		//tableContent[k] = row;
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


//function drawTable() {
//	
////	var dataTest = new google.visualization.DataTable();
////	dataTest.addColumn('number', 'Newq');
////	dataTest.addColumn('number', 'Repeatq');
////	var tableTest = new google.visualization.Table(document.getElementById('tableTest'));
////	tableTest.draw(dataTest, {allowHtml: true, showRowNumber: false, width: '100%', height: '100%'});
//	
//	var tableContent = [];
//	var row = [];
//	var temp  = loadTableContent();
//	
//	for(var i=0; i<temp.length; i++){
//
//			row[0] = temp[i].numberOfNew ;
//			row[1] = temp[i].numberOfRepeat ;
//			row[2] = temp[i].averageQCOTime ;
//			row[3] = temp[i].avgEff_1 ;
//			row[4] = temp[i].avgEff_2 ;
//			row[5] = temp[i].avgEff_3 ;
//			row[6] = temp[i].avgEff_4 ;
//			row[7] = temp[i].avgEff_5 ;
//			row[8] = temp[i].avgEff_1d ;
//			row[9] = temp[i].avgEff_2d ;
//			row[10] = temp[i].avgEff_3d ;
//			row[11] = temp[i].avgEff_new123 ;
//			row[12] = temp[i].avgEff_repeat123 ;
//			row[13] = temp[i].avgEff_123 ;
//			row[14] = temp[i].EPR_123n ;
//			row[15] = temp[i].EPR_123r ;
//			row[16] = temp[i].EPR_123 ;
//			row[17] = temp[i].avgFeedingTime ;
//			row[18] = temp[i].fullPresettingHR ;
//			row[19] = temp[i].abHR ;
//			
//			row[20] = temp[i].avgEff_newTarget ;
//			row[21] = temp[i].avgEff_repeatTarget ;
//			row[22] = temp[i].avgEff_45 ;
//
//		tableContent[i] = row;
//		
//	}
//
//	var data = new google.visualization.DataTable();
//	
//	//data.addColumn('number', '<table align="center" width="100%"><tr><td colspan="1">Year1</td></tr> <tr><td>price</td> <td>qty</td></tr></table>');
//	data.addColumn('number', 'Week');
//	data.addColumn('number', 'New');
//	data.addColumn('number', 'Repeat');
//	data.addColumn('number', 'Average QCO time');
//	data.addColumn('number', '1day');
//	data.addColumn('number', '2day');
//	data.addColumn('number', '3day');
//	data.addColumn('number', 'New');
//	data.addColumn('number', 'Repeat');
//	data.addColumn('number', '1st 3Days -EFF Avg');
//	data.addColumn('number', 'New');
//	data.addColumn('number', 'Repeat');
//	data.addColumn('number', '1st 3Days -Endline Pass Rate Avg.');
//	data.addColumn('number', 'Average Feeding Time');
//	data.addColumn('number', '1st 3Days Bucket Loss(STD Hrs)');
//	data.addColumn('number', 'Full Presetting Hit rate');
//	data.addColumn('number', '4th &5th  Days -EFF Avg.');
//	data.addColumn('number', 'Silhouette based hit rate');
//	
//	data.addColumn('number', 'Average Feeding Time');
//	data.addColumn('number', '1st 3Days Bucket Loss(STD Hrs)');
//	data.addColumn('number', 'Full Presetting Hit rate');
//	data.addColumn('number', '4th &5th  Days -EFF Avg.');
//	data.addColumn('number', 'Silhouette based hit rate');
//	
//
//
//	
//	data.addRows(tableContent);
//	
//	data.setProperty(0, 3, 'style', 'width:1000px');
//	
//	var table = new google.visualization.Table(document.getElementById('table'));
//	
//	function setWidth () {
//		
//		alert();
//        // set the width of the column with the title "Name" to 100px
//        var title = 'Week';
//        var width = '1000px';
//        $('.google-visualization-table-table-th:contains(' + title + ')').css('width', width);     
//        
////        $("#chart_div tr:eq(1) td:eq(1)").attr("colspan","2").next("td").remove();
//    }
//
////    google.visualization.events.addListener(table, 'ready', setWidth);
////    google.visualization.events.addListener(table, 'sort', setWidth);
//    
//    var formatter = new google.visualization.ColorFormat();
//    formatter.addRange(0, 3, 'black', 'orange');
//    //formatter.addRange(20000, null, 'red', '#33ff33');
//    formatter.format(data, 1); // Apply formatter to second column
//
//	
//	table.draw(data, {allowHtml: true, showRowNumber: false, width: '100%', height: '100%'});
//}

