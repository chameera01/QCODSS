/**
 *  AddStyleRecords.jsp forms validated here
 */

$(document).ready(function(){
	
	/* main style record form validated here. */
	$("#styleRecMainForm").validate({
		rules: {
			styleNo: { 	 
				 required: true,
			     maxlength: 12
			},
			weekNo: { 	 
				 required: true
			},
			moduleNo: {   	 
				required: true
				//digits: true,
				//maxlength: 3
			},
			feedingTime: {   	 
				required: true,
				digits: true
			},
			QCOTime: {   	 
				required: true,
				digits: true
			},
			similarityRank: {   	 
				required: true,
				number: true,
				max: 100
			}
		},
		messages: {
		    styleNo: "",
		    weekNo: "",
		    moduleNo: "",
		    feedingTime: "",
		    QCOTime: "",
		    similarityRank: ""
		}
	});
	
	/* day 01 style record form validated here. */
	$("#styleDayOneForm").validate({
		rules: {
			dayOneClocked: { 	 
				 required: true,
				 number: true
			},
			dayOneProduced: {   	 
				required: true,
				number: true
			},
			dayOneTotalInspected: {   	 
				required: true,
				digits: true
			},
			dayOneTotalPassed: {   	 
				required: true,
				digits: true
			}
		},
		messages: {
			dayOneClocked: "",
			dayOneProduced: "",
			dayOneTotalInspected: "",
			dayOneTotalPassed: ""
		}
	});
	
});