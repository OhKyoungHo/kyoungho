
$(document).ready(function () {
    
    //글등록 버튼 아이디
    $("#btn-e").click(function(){
      alert("버튼잘눌림");
      
      var param = $("#cmtfrm").serializeObject();
      console.log(param);
      
      var d="";
      
      $.ajax({
         url : 'insertRV',
         type: 'get',
         data : param,
         dataType: "json",
         
         success : function(data){
            alert("성공 :" + data);
            console.log(data);
            
            //화면 깔끔히 할라고 입력값을 초기화
            
            $('#star').val('');
            $('#text').val('');
            
            $("#reviewBox").empty();
   
         var c = "";
         
         c+="<div class='course__comment mb-75'>";
         c+=" <h3>리뷰확인</h3>";
         $.each(data, function(key, value){
            d+= "<ul>";
            d+= "<li>";
            d+= "<div class='course__comment-box '>";
            d+= " <div class='course__comment-thumb float-start'>";
            d+= "</div>";
            d+= "<div class='course__comment-content'>";
            d+= "<div class='course__comment-wrapper ml-70 fix'>";
            d+= "<div class='course__comment-info float-start'>";
            d+= "<h4>" + value.memIdString + "</h4>";
            d+= "</div>";
            d+= "<div class='course__comment-info float-start'>";
            d+= " <span>" + value.reDate + "</span>";
            d+= "</div>";
            d+= "<div class='course__comment-rating float-start float-sm-end'>";
            d+= "<tr>";
            d+= " <td>" + value.star + "";
            if(value.star==1){
               d+= " <img src='../assets/img/star/1s.png'>";
            }
            if(value.star==2){
               d+= " <img src='../assets/img/star/2s.png'>";
            }
            if(value.star==3){
               d+= " <img src='../assets/img/star/3s.png'>";
            }
            if(value.star==4){
               d+= " <img src='../assets/img/star/4s.png'>";
            }
            if(value.star==5){
               d+= " <img src='../assets/img/star/5s.png'>";
            }
            
            d+= " </td>";
            d+= " </tr>";
            d+= " </div>";
            d+= " </div>";
            d+= " <div class='course__comment-text ml-70'>";
            d+= " <p>" + value.reContent + "</p>";
            d+= " </div>";
            d+= " </div>";
            d+= "  </li>";
            d+= " </ul>";
             c += d;
                 d = "";
            
         });
         
         c+= " </div> ";
         
            
         $("#reviewBox").append(c);      

         },
         error : function(e){
            console.log(e);
         }
   
      })//end of aJax
      
   })//end of click
   
   
   
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	 
     $(".zz").click(function(){
		 alert("zz");
		 
		var param = $("#cmtfrm").serializeObject();
    	console.log(param);
    	 var d="";
		 
		 
		 $.ajax({
			 
			 url : 'insertRVPajing',
         	type: 'get',
         	data : param,
         	dataType: "json",
         	success : function(data){
            alert("성공 :" + data);
            console.log(data);
            
             
            $("#reviewBox").empty();
            
             var c = "";
         
         c+="<div class='course__comment mb-75'>";
         c+=" <h3>리뷰확인</h3>";
         $.each(data, function(key, value){
            d+= "<ul>";
            d+= "<li>";
            d+= "<div class='course__comment-box '>";
            d+= " <div class='course__comment-thumb float-start'>";
            d+= "</div>";
            d+= "<div class='course__comment-content'>";
            d+= "<div class='course__comment-wrapper ml-70 fix'>";
            d+= "<div class='course__comment-info float-start'>";
            d+= "<h4>" + value.memIdString + "</h4>";
            d+= "</div>";
            d+= "<div class='course__comment-info float-start'>";
            d+= " <span>" + value.reDate + "</span>";
            d+= "</div>";
            d+= "<div class='course__comment-rating float-start float-sm-end'>";
            d+= "<tr>";
            d+= " <td>" + value.star + "";
            if(value.star==1){
               d+= " <img src='../assets/img/star/1s.png'>";
            }
            if(value.star==2){
               d+= " <img src='../assets/img/star/2s.png'>";
            }
            if(value.star==3){
               d+= " <img src='../assets/img/star/3s.png'>";
            }
            if(value.star==4){
               d+= " <img src='../assets/img/star/4s.png'>";
            }
            if(value.star==5){
               d+= " <img src='../assets/img/star/5s.png'>";
            }
            
            d+= " </td>";
            d+= " </tr>";
            d+= " </div>";
            d+= " </div>";
            d+= " <div class='course__comment-text ml-70'>";
            d+= " <p>" + value.reContent + "</p>";
            d+= " </div>";
            d+= " </div>";
            d+= "  </li>";
            d+= " </ul>";
             c += d;
                 d = "";
            
         });
         
         c+= " </div> ";
         //--추가해봄
         //c+= " <div class='row'> "
         //c+= " <div class='col-xxl-12'> "
         //c+= "<div class='basic-pagination wow fadeInUp mt-30' data-wow-delay='.2s'>  "
        
       
         
            
         $("#reviewBox").append(c);      
            
            
         	}
         
		 })//ajax
	 })

 
   
   
   
   
   
   

//----------------------------------------------------------------------------------------------------
   // serialize된 파라미터를 json화 하는 함수
   jQuery.fn.serializeObject = function() {
    var obj = null;
    try {
        if (this[0].tagName && this[0].tagName.toUpperCase() == "FORM") {
            var arr = this.serializeArray();
            if (arr) {
                obj = {};
                jQuery.each(arr, function() {
                    obj[this.name] = this.value;
                });
            }//if ( arr ) {
        }
    } catch (e) {
        alert(e.message);
    } finally {
    }
 
    return obj;
	};
//----------------------------------------------------------------------------------------------------
   
   
   
   
   
   
   
})//end of main