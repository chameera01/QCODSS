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
			moduleNo: {   	 
				required: true,
				digits: true,
				maxlength: 3
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
		    moduleNo: "",
		    feedingTime: "",
		    QCOTime: "",
		    similarityRank: ""
		}
	});
});