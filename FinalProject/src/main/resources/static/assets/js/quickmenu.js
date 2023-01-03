
//퀵메뉴용
$(document).ready(function(){
   //스크롤이벤트
  var currentPosition = parseInt($(".quickmenu").css("top"));
    $(window).scroll(function() {
   //속도애니메이트 
   var position = $(window).scrollTop(); 
      $(".quickmenu").stop().animate({"top":position+currentPosition+"px"},500);
      
      
         
      //퀵메뉴 클릭시 채팅방 오픈
      
   $(function(){
      
   
      // 버튼이 눌렸을 때
      $('.quickmenu').on('click',function(){
         //alert('0');
         //alert($('#memberId').text());
      
         var url = 'http://127.0.0.48:5000'
         //var url = 'http://127.0.0.48:5000/?id=' + $('#memberId').text();
         window.open(url,'width=100','height=100');
         
      
      });
      
      
   });

   
      
  });
});
