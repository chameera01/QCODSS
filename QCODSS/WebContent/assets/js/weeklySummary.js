/* this function post styleNo to save in session and 
 * afterward enable rest of the style record form 
 */
function loadWeeklySummary(){
	
	//var styleNo = $("#styleNo").val();
	
	//var tableContent = [];
		
	$.ajax({
	    url: "WkSummary",
	    type: 'POST',
	    dataType: 'json',
	    //data: {styleNo:styleNo, stylePlantID:stylePlantID},
	    async: false,
	    success: function (data) {
	    	
	    	$.each(data.allWeeklyReports, function(k, v) {
	    		//var count = 0;
	    		var rowContent = [];
	    		$.each(data.allWeeklyReports[k], function(key, val){
	    			
	    			

	    		    
	    		    rowContent[key] = val;
	    		    
		    	   
		    	   //count ++;
	    		});
	    		
    			var table = document.getElementById("weeklySummaryTable");
    		    var row = table.insertRow(-1);
    		    
    		    var weekNo = row.insertCell(0);
    		    var numberOfNew = row.insertCell(1);
    		    var numberOfRepeat = row.insertCell(2);
    		    var averageQCOTime = row.insertCell(3);
    		    var avgEff_1 = row.insertCell(4);
    		    var avgEff_2 = row.insertCell(5);
    		    var avgEff_3 = row.insertCell(6);
    		    var avgEff_new123 = row.insertCell(7);
    		    var avgEff_repeat123 = row.insertCell(8);
    		    var avgEff_123 = row.insertCell(9);
    		    var EPR_123n = row.insertCell(10);
    		    var EPR_123r = row.insertCell(11);
    		    var EPR_123 = row.insertCell(12);
    		    var avgFeedingTime = row.insertCell(13);
    		    var bucketLoss_123 = row.insertCell(14);
    		    var fullPresettingHR = row.insertCell(15);
    		    var avgEff_45 = row.insertCell(16);
    		    var silhouetteBasedHR = row.insertCell(17);
    		    
    		    weekNo.innerHTML = "?";
    		    numberOfNew.innerHTML = rowContent.numberOfNew;
    		    numberOfRepeat.innerHTML = rowContent.numberOfRepeat;
    		    averageQCOTime.innerHTML = rowContent.averageQCOTime;
    		    avgEff_1.innerHTML = rowContent.avgEff_1;
    		    avgEff_2.innerHTML = rowContent.avgEff_2;
    		    avgEff_3.innerHTML = rowContent.avgEff_3;
    		    avgEff_new123.innerHTML = rowContent.avgEff_new123;
    		    avgEff_repeat123.innerHTML = rowContent.avgEff_repeat123;
    		    avgEff_123.innerHTML = rowContent.avgEff_123;
    		    EPR_123n.innerHTML = rowContent.EPR_123n;
    		    EPR_123r.innerHTML = rowContent.EPR_123r;
    		    EPR_123.innerHTML = rowContent.EPR_123;
    		    avgFeedingTime.innerHTML = rowContent.avgFeedingTime;
    		    bucketLoss_123.innerHTML = "?";
    		    fullPresettingHR.innerHTML = rowContent.fullPresettingHR;
    		    avgEff_45.innerHTML = rowContent.avgEff_45;
    		    silhouetteBasedHR.innerHTML = "?";
	    		
//				row[0] = row.numberOfNew ;
//				row[1] = row.numberOfRepeat ;
//				row[2] = row.averageQCOTime ;
//				row[3] = row.avgEff_1 ;
//				row[4] = row.avgEff_2 ;
//				row[5] = row.avgEff_3 ;
//				row[6] = row.avgEff_4 ;
//				row[7] = row.avgEff_5 ;
//				row[8] = row.avgEff_1d ;
//				row[9] = row.avgEff_2d ;
//				row[10] = row.avgEff_3d ;
//				row[11] = row.avgEff_new123 ;
//				row[12] = row.avgEff_repeat123 ;
//				row[13] = row.avgEff_123 ;
//				row[14] = row.EPR_123n ;
//				row[15] = row.EPR_123r ;
//				row[16] = row.EPR_123 ;
//				row[17] = row.avgFeedingTime ;
//				row[18] = row.fullPresettingHR ;
//				row[19] = row.abHR ;
//				
//				row[20] = row.avgEff_newTarget ;
//				row[21] = row.avgEff_repeatTarget ;
//				row[22] = row.avgEff_45 ;
	    		//tableContent[k] = row;
	    	});
	    }
	});
	
//	return tableContent;
}

$('#generatePDF').click(function () {
	
	var doc = new jsPDF('p', 'pt', 'letter');

	var specialElementHandlers = {
	    '#editor': function (element, renderer) {
	        return true;
	    }
	};
	
	source = $('#weeklySummaryTable')[0];

	
    doc.fromHTML(source, 15, 15, {
        'width': 1700,
            'elementHandlers': specialElementHandlers
    });
    doc.save('weeklySummary.pdf');
});