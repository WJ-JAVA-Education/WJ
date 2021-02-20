$( document ).ready( function() {
	// 스크롤 사용 시 상단 Nav 고정 스크립트
	var jbOffset = $( '.top_nav' ).offset();
  $( window ).scroll( function() {
  	if ( $( document ).scrollTop() > jbOffset.top ) {
    	$( '.top_nav' ).addClass( 'top_fixed' );
    }
    else {
    	$( '.top_nav' ).removeClass( 'top_fixed' );
    }
	});
	//모바일 네비 보이기 숨기기
	$(".nav_btn").on('click', function() {
		if($(".gnb").is(".on") === false) {
			$(".gnb").addClass("on");
		}else{
		
		}
	});
	
	$(".nav_close").on('click', function() {
		if($(".gnb").is(".on") === true) {
			$(".gnb").removeClass("on");
		}else{
			
		}
	});
	
	$(".main").children("li").on('click', function() {
		if($(this).attr("class")!="on"){
			$(".main").find("li").removeClass("on");
			$(this).addClass("on");
		}else{
			$(this).removeClass("on");
		}
	});
	
	$(".main").children("li").children("a").on('click', function() {
		var u = $(this).attr("data-url");
		if(u != "" && $(".nav_btn").css("display")=="none"){
			location.replace(u);
		}
	});
	
});

function setCookie(cookieName, value, exdays){
   var exdate = new Date();
   exdate.setDate(exdate.getDate() + exdays);
   var cookieValue = escape(value) + ((exdays==null) ? "" : "; expires=" + exdate.toGMTString());
   document.cookie = cookieName + "=" + cookieValue;
}

function deleteCookie(cookieName){
   var expireDate = new Date();
   expireDate.setDate(expireDate.getDate() - 1);
   document.cookie = cookieName + "= " + "; expires=" + expireDate.toGMTString();
}

function getCookie(cookieName) {
   cookieName = cookieName + '=';
   var cookieData = document.cookie;
   var start = cookieData.indexOf(cookieName);
   var cookieValue = '';
   if(start != -1){
      start += cookieName.length;
      var end = cookieData.indexOf(';', start);
      if(end == -1)end = cookieData.length;
      cookieValue = cookieData.substring(start, end);
   }
   return unescape(cookieValue);
}