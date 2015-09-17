
/* this function post styleNo to save in session and 
 * afterward enable rest of the style record form 
 */
function loadForm(){
	
	var styleNo = $("#styleNo").val();
	var stylePlantID = $('#plantName').find(":selected").val();
		
	$.ajax({
	    url: "session",
	    type: 'POST',
	    dataType: 'json',
	    data: {styleNo:styleNo, stylePlantID:stylePlantID},
	    async: false,
	    success: function (data) {
	    	$("#styleRec_1_hide").show();
	    	$("#styleRec_2_hide").show();
	    	
	    	alert("*** "+data.producedHrs_3d);
	    	
	    	$("#moduleNo").val(data.moduleNo);
	    	
	    	var $styleTypeRadios = $('input:radio[name=styleType]');
	    	$styleTypeRadios.filter('[value='+data.newRepeat+']').prop('checked', true);
	    	
	    	var $machineSettingRadios = $('input:radio[name=machineSetting]');
	    	$machineSettingRadios.filter('[value='+data.preSetting+']').prop('checked', true);
	    	
	    	var $preTrainingRadios = $('input:radio[name=preTraining]');
	    	$preTrainingRadios.filter('[value='+data.preTraining+']').prop('checked', true);
	    	
	    	var $preBulkRadios = $('input:radio[name=preBulk]');
	    	$preBulkRadios.filter('[value='+data.preBulk+']').prop('checked', true);
	    	
	    	var $predictabilityRadios = $('input:radio[name=predictability]');
	    	$predictabilityRadios.filter('[value='+data.predictability+']').prop('checked', true);
	    	
	    	$("#feedingTime").val(data.feedingTime);
	    	$("#QCOTime").val(data.QCOTime);
	    	$("#similarityRank").val(data.rsr);
	    	
	    	/* style fields - day 01 */
	    	$("#dayOneClocked").val(data.clockedHrs_1);
	    	$("#dayOneProduced").val(data.producedHrs_1);
	    	$("#dayOneTotalInspected").val(data.totalInspected_1);
	    	$("#dayOneTotalPassed").val(data.totalFTT_1);
	    	
	    	/* style fields - day 02 */
	    	$("#dayTwoClocked").val(data.clockedHrs_2);
	    	$("#dayTwoProduced").val(data.producedHrs_2);
	    	$("#dayTwoTotalInspected").val(data.totalInspected_2);
	    	$("#dayTwoTotalPassed").val(data.totalFTT_2);
	    	
	    	/* style fields - day 03 */
	    	$("#dayThreeClocked").val(data.clockedHrs_3);
	    	$("#dayThreeProduced").val(data.producedHrs_3);
	    	$("#dayThreeTotalInspected").val(data.totalInspected_3);
	    	$("#dayThreeTotalPassed").val(data.totalFTT_3);
	    	
	    	/* style fields - day 04 */
	    	$("#dayFourClocked").val(data.clockedHrs_4);
	    	$("#dayFourProduced").val(data.producedHrs_4);
	    	$("#dayFourTotalInspected").val(data.totalInspected_4);
	    	$("#dayFourTotalPassed").val(data.totalFTT_4);
	    	
	    	/* style fields - day 05 */
	    	$("#dayFiveClocked").val(data.clockedHrs_5);
	    	$("#dayFiveProduced").val(data.producedHrs_5);
	    	$("#dayFiveTotalInspected").val(data.totalInspected_5);
	    	$("#dayFiveTotalPassed").val(data.totalFTT_5);
	    	
	    	/* style fields - last day */
	    	$("#dayLastClocked").val(data.clockedHrs_1d);
	    	$("#dayLastProduced").val(data.producedHrs_1d);
	    	$("#dayLastTotalInspected").val(data.totalInspected_1d);
	    	$("#dayLastTotalPassed").val(data.totalFTT_1d);
	    	
	    	/* style fields - last 2 day */
	    	$("#dayLastTwoClocked").val(data.clockedHrs_2d);
	    	$("#dayLastTwoProduced").val(data.producedHrs_2d);
	    	$("#dayLastTwoTotalInspected").val(data.totalInspected_2d);
	    	$("#dayLastTwoTotalPassed").val(data.totalFTT_2d);
	    	
	    	/* style fields - last 3 day */
	    	$("#dayLastThreeClocked").val(data.clockedHrs_3d);
	    	$("#dayLastThreeProduced").val(data.producedHrs_3d);
	    	$("#dayLastThreeTotalInspected").val(data.totalInspected_3d);
	    	$("#dayLastThreeTotalPassed").val(data.totalFTT_3d);

	    	
	    }
	});
}