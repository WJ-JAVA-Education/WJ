<%@ page contentType="text/html;charset=EUC-KR"%>
<%@page import="tour.UtilMgr"%>
<%@page import="tour.ProductBean"%>
<%@page import="java.util.Vector"%>
<jsp:useBean id="pMgr" class="tour.ProductMgr" />
<%
	Vector<ProductBean> pvlist1 = pMgr.getcategoryList(1);
	Vector<ProductBean> pvlist2 = pMgr.getcategoryList(2);
	Vector<ProductBean> pvlist3 = pMgr.getcategoryList(3);
	Vector<ProductBean> pvlist4= pMgr.getcategoryList(4);
%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <mata name="viewport" content="width=device-width, initial-scale=1.0"></mata>
    
    <!--css 연결-->
    <link rel="stylesheet" href="css/bootstrap.css">
    <title>간편견적 요청하기</title>
    <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <style type="text/css">
      .jumbotron{
        background-image: url('sea.png');
        background-size: cover;
        text-shadow: black 0.2em 0.2em 0.2em;
        color:white;
      }
</style>
  
    
  <script type="text/javascript">
function inputCheck(){
	if(document.regForm.name.value==""){
		alert("이름을 입력해 주세요.");
		document.regForm.name.focus();
		return;
	}
	
	if(document.regForm.email.value==""){
		alert("이메일을 입력해 주세요.");
		document.regForm.email.focus();
		return;
	}

    var str=document.regForm.email.value;	   
    var atPos = str.indexOf('@');
    var atLastPos = str.lastIndexOf('@');
    var dotPos = str.indexOf('.'); 
    var spacePos = str.indexOf(' ');
    var commaPos = str.indexOf(',');
    var eMailSize = str.length;
    if (atPos > 1 && atPos == atLastPos && 
	   dotPos > 3 && spacePos == -1 && commaPos == -1 
	   && atPos + 1 < dotPos && dotPos + 1 < eMailSize);
    else {
          alert('E-mail주소 형식이 잘못되었습니다.\n\r다시 입력해 주세요!');
	      document.regForm.email.focus();
		  return;
    }

	if(document.regForm.hp.value==""){
		alert("핸드폰번호를 입력해 주세요.");
		document.regForm.hp.focus();
		return;
	}
	document.regForm.submit();
}
</script>

</head>

<body>
 
  <!--jumbotron 부분-->
   <div class="container">
      <div class="jumbotron">
        <h1 class="text-center">간편 견적 받기</h1>
        <p class="text-center">가입없이 메일로 원하는 견적을 받아볼 수 있습니다.</p>
        <p class="text-center"><a class="btn btn-primary btn-lg" href="member.jsp" role="button">여행견적프로그램 가입</a></p>
      </div>
      <div>
      <form name="regForm" method="post" action="costInsert.jsp"  class="form-horizontal" role="form"><br/>
					<br/>
					<div class="form-group">
                    <label for="name" class="col-sm-3 control-label">이름</label>
                    <div class="col-sm-9">
                        <input name="name" class="form-control">
                    </div>
                </div>
						<div class="form-group">
                    <label for="email" class="col-sm-3 control-label">이메일</label>
                    <div class="col-sm-9">
                        <input name="email" class="form-control">
                    </div>
				</div>
				<div class="form-group">
                    <label for="hp" class="col-sm-3 control-label">핸드폰</label>
                    <div class="col-sm-9">
                        <input name="hp" class="form-control">
                    </div>
                </div>
				<div class="form-group">
                    <label for="adultNum" class="col-sm-3 control-label">어른 인원수</label>
                    <div class="col-sm-9">
                       <select name="adultNum" class="form-control">
                            <option value="0" selected>선택하세요.</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									</select>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <label for="childNum" class="col-sm-3 control-label">어린이 인원수</label>
                    <div class="col-sm-9">
                       <select name="childNum" class="form-control">
                            <option value="0" selected>선택하세요.</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									</select>
                    </div>
                </div> <!-- /.form-group -->
				 <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">아동생년월일</label>
                    <div class="col-sm-9">
                        <input type=text name="childbirth" class="form-control">
                    </div>
                </div>		
						
					<div class="form-group">
                    <label for="saleitem1" class="col-sm-3 control-label">놀거리</label>
                    <div class="col-sm-9">	
						<% 
							for(int i =0; i<pvlist1.size(); i++){
							ProductBean pbean = pvlist1.get(i);
						%>	
						<input type="checkbox" name="saleitem1" value="<%=pbean.getProName()%>(<%=pbean.getCoName()%>)"
							><%=pbean.getProName()%>(<%=pbean.getCoName()%>)
						<% }%>
						</div>
                </div>	
						
						<div class="form-group">
                    <label for="saleitem2" class="col-sm-3 control-label">마사지</label>
                    <div class="col-sm-9">	
						<% 
							for(int i =0; i<pvlist2.size(); i++){
							ProductBean pbean = pvlist2.get(i);
						%>	
						<input type="checkbox" name="saleitem2" value="<%=pbean.getProName()%>(<%=pbean.getCoName()%>)"
							><%=pbean.getProName()%>(<%=pbean.getCoName()%>)
						<% }%>
						</div>
                </div>	
						
						<div class="form-group">
                    <label for="saleitem3" class="col-sm-3 control-label">투어</label>
                    <div class="col-sm-9">	
						<% 
							for(int i =0; i<pvlist3.size(); i++){
							ProductBean pbean = pvlist3.get(i);
						%>	
						<input type="checkbox" name="saleitem3" value="<%=pbean.getProName()%>(<%=pbean.getCoName()%>)"
							><%=pbean.getProName()%>(<%=pbean.getCoName()%>)
						<% }%>
						</div>
                </div>	
						
						<div class="form-group">
                    <label for="saleitem4" class="col-sm-3 control-label">기타</label>
                    <div class="col-sm-9">	
						<% 
							for(int i =0; i<pvlist4.size(); i++){
							ProductBean pbean = pvlist4.get(i);
						%>	
						<input type="checkbox" name="saleitem4" value="<%=pbean.getProName()%>(<%=pbean.getCoName()%>)"
								><%=pbean.getProName()%>(<%=pbean.getCoName()%>)
						<% }%>
						</div>
                </div>	
                <div class="form-group">
                    <label for="date" class="col-sm-3 control-label">투어요청일</label>
                    <div class="col-sm-9">
                        <input type="date" name="tourDay" class="form-control">
                    </div>
                </div>
				<div class="form-group">
                    <label for="time" class="col-sm-3 control-label">투어요청시간</label>
                    <div class="col-sm-9">
                        <input type="time" name="tourTime" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="time" class="col-sm-3 control-label">기타요청사항</label>
                    <div class="col-sm-9">
                         <textarea class="form-control" name="comment"></textarea>
                    </div>
                </div>
					<div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3" align="center">
                       <input type="button"
								value="견적요청하기" onclick="inputCheck()"> &nbsp; &nbsp;
								&nbsp; &nbsp; &nbsp; &nbsp; <input type="reset" value="다시쓰기">
                    </div>
                </div>	
	</form>
      </div>
    </div>
    <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    
    </body>
 
</html>
    
