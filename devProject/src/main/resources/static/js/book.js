$("#insertBtn").on("click", ()=>{
	if(!chkData("#title","책 제목을")){return;
	}
	else if(!chkData("#publisher","저자를")){
	}
	else if(!chkData("#year","년도를")){
	}
	else if(!chkData("#price","금액을")){
	}
	else{
		$("#insertForm").attr("method","post");	
		$("#insertForm").attr("action","/books/bookInsert");
		
		$("#insertForm").submit();	
	};
});

$("#cancleBtn").on("click",() =>{
	$("#title").val(" ");
	$("#publisher").val(" ");
	$("#year").val(" ");
	$("#price").val(" ");
});     