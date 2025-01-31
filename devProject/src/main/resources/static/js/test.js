$("#exam01Btn").on("click",()=>{
	$("#exam03Form").attr({
		method : "get",
		action : "/example/exam03"
	});
	$("#exam03Form").submit();
});


$("#exam02Btn").on("click", ()=>{
	$("#exam03Form").attr({
		method : "post",
		action : "/example/exam04"
	});
	$("#exam03Form").submit(); 
});   
  

$("#exam04ArrayBtn").on("click", ()=>{
	$("#exam04ArrayForm").attr({
		method : "post", 
		action : "/example/exam04Array"
	});
	$("#exam04ArrayForm").submit();
});     


 
$("#exam04BeanBtn").on("click", ()=>{  
	$("#exam04BeanForm").attr({ 
		method :"post",
		action: "/example/exam04Bean"
	});
	$("#exam04BeanForm").submit();
});   
