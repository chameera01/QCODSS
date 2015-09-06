/**
 * 
 */

/*
function validateStyleRec() {
	
	var styleNo = $('#styleNo').val();
	var styleNoLen = $('#styleNo').val().length;
	console.log("length" + styleNoLen );
	
	if(styleNo==4){
		$('#styleNoDiv').addClass('has-error');
	} else {
		$('#styleNoDiv').removeClass('has-error');
	}
	
	return false;
}
*/

$(document).ready(function(){
   $("#myform").validate({
      rules: {
         styleNo: {
            required: true
               }
         },
         messages: {
            styleNo: ""
         }
     });
});