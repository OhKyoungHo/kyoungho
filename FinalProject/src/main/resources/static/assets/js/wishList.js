$(function() {
$(".heart").unbind('click').on('click', function() {
		
		$(this).toggleClass('on');
		
	if($(this).hasClass('on')){  
		 $(this).find("img").attr("src", "../assets/img/course/on.png");//행동에 따른 리액션
		 
		 let memId1 = $("#memId").val();
		 let edId1 = $("#edId").val();
		 
		 // 하트를 클릭 시 WishList 테이블에 저장
		 $.ajax({
                url: '/mypage/insert',
                type: 'POST',
                data: {'memId': memId1, 'edId': edId1},
                success: function (data) {
                    console.log(data);
                }, error: function () {
                    console.log('오타 찾으세요')
                }

            });
            
	}else{
		$(this).find("img").attr("src", "../assets/img/course/off.png");
	
	 
		 let wId1 = $("#wId").val();
		
		 // 하트를 클릭 시 WishList 테이블에 삭제
		 $.ajax({
                url: '/mypage/delete',
                type: 'POST',
                data: {'wId': wId1},
                success: function (data) {
                    console.log(data);
                }, error: function () {
                    console.log('오타 찾으세요')
                }

            });
	
	
	}
});



});
