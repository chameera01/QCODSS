
/* this function post styleNo to save in session and 
 * afterward enable rest of the style record form 
 */
function loadForm(){
	
	var styleNo = $("#styleNo").val();
	var stylePlantID = $('#plantName').find(":selected").val();
		
	$.ajax({
	    url: "session",
	    data: {styleNo:styleNo, stylePlantID:stylePlantID},
	    type: 'POST',
	    async: false,
	    success: function (data) {
	    	$("#styleRec_1_hide").show();
	    	$("#styleRec_2_hide").show();
	    }
	});
}