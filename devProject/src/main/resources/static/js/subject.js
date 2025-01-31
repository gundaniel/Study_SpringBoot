$("#insertBtn").on("click", ()=>{
	if(!chkData("#subjectName","학과명을"))return;
	else{
		$("#insertForm").attr("method","post");	
		$("#insertForm").attr("action","/subject/subjectInsert");
		
		$("#insertForm").submit();	
	};
});

$("#cancleBtn").on("click",function(){
	$("#subjectName").val("");
})    