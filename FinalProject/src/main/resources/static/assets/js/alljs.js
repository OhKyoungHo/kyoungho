





//선생등록시 사용
function teacherInsert(){
	
	
		
	var name = $("#tcName").val();
	
	if(name==""){
		alert("이름을 반드시 입력해 주세요")
		name.focus();
	}
	
	$("#teacherForm").submit();
	
	
	
	alert("등록이 완료되셨습니다 회원 정보 관리에서 확인해주세요.")
	
	}
	
	
	
	
	
function teacherBtn(){
	
	$("#tcTruefalse").val(1);
	
	$("#upForm").submit();
	
	
}


function teacherBtn2(){
	
	$("#tcTruefalse").val(0);
	
	$("#upForm").submit();
	
}


