$("#subjectNumber").on("change", function(){
	console.log("확인");
	$.ajax({
			url: '/student/studentAutoNumber',
			data: {
				"subjectNumber": $("#subjectNumber").val()
			},
			method: 'GET',
			dataType: 'text'
		}).done(function (data) {
			//console.log(data);
			$("#studentNumber").val(data);
		}).fail(function() {
			alert( "잠시 후에 다시 접속해 주세요." );
		});
});