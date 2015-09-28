
/* this function post styleNo to save in session and 
 * afterward enable rest of the style record form 
 */
function loadForm(){
	
	var styleNo = $("#styleNo").val();
		
	$.ajax({
	    url: "session",
	    type: 'POST',
	    dataType: 'json',
	    data: {styleNo:styleNo, stylePlantID:stylePlantID},
	    async: false,
	    success: function (data) {

		    $("#moduleNo").val("");
    	
	    }
	});
}

function initTable(){
	
	google.load("visualization", "1.1", {packages:["table"]});
	google.setOnLoadCallback(initialize);	
}

function initialize () {
    $(/* click event element selector */).click(function() {
        drawChart();
    });
}


	function drawTable() {
		
		var tableContent = [
			      			  ['Mikeee',  {v: 10000, f: '$10,000'}, true],
			    			  ['Jim',   33,  false],
			    			  ['Alice', {v: 12500, f: '$12,500'}, true],
			    			  ['Bob',   {v: 7000,  f: '$7,000'},  true]
			    			];
		
		var data = new google.visualization.DataTable();
		data.addColumn('string', 'Name');
		data.addColumn('number', 'Salary');
		data.addColumn('boolean', 'Full Time Employee');
		data.addRows(tableContent);
		
		var table = new google.visualization.Table(document.getElementById('table_div'));
		
		table.draw(data, {showRowNumber: true, width: '100%', height: '100%'});
	}

