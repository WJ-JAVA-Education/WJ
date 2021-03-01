<%@ page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>회원가입</title>
  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<script src="script.js"></script>
<script type="text/javascript">
function inputCheck(){
	if(document.regForm.id.value==""){
		alert("아이디를 입력해 주세요.");
		document.regForm.id.focus();
		return;
	}
	if(document.regForm.pwd.value==""){
		alert("비밀번호를 입력해 주세요.");
		document.regForm.pwd.focus();
		return;
	}
	if(document.regForm.repwd.value==""){
		alert("비밀번호를 확인해 주세요");
		document.regForm.repwd.focus();
		return;
	}
	if(document.regForm.pwd.value != document.regForm.repwd.value){
		alert("비밀번호가 일치하지 않습니다.");
		document.regForm.repwd.focus();
		return;
	}
	if(document.regForm.name.value==""){
		alert("이름을 입력해 주세요.");
		document.regForm.name.focus();
		return;
	}
	
	
	if(document.regForm.birthday.value==""){
		alert("생년월일를 입력해 주세요.");
		document.regForm.birthday.focus();
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
<div class="container">
<div class="row justify-content-center">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="card-header">회원가입</div>
                            <div class="card-body">

                                <form name="regForm" method="post" action="memberInsert.jsp"  class="form-horizontal">

                                    <div class="form-group">
                                        <label for="id" class="cols-sm-2 control-label">ID</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                <input name="id" class="form-control">
                                                <input type="button" value="ID중복확인" onClick="idCheck(this.form.id.value)">
                                   	</div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="password" class="cols-sm-2 control-label">Password</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                                <input type="password" name="pwd" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="repassword" class="cols-sm-2 control-label">Password 확인</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa-lg"  aria-hidden="true"></i></span>
                                                <input type="password" name="repwd" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="name" class="cols-sm-2 control-label">이름</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                <input name="name" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="email" class="cols-sm-2 control-label">이메일</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                 <input name="email" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="hp" class="cols-sm-2 control-label">핸드폰</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                 <input name="hp" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="birthDate" class="cols-sm-2 control-label">생년월일</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                 <input name="birthday" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    
				                <div class="form-group">
				                    <label class="control-label col-sm-3">성별</label>
				                    <div class="col-sm-6">
				                        <div class="row">
				                            <div class="col-sm-4">
				                                <label class="radio-inline">
				                                    <input type="radio" name="gender" value="1" checked>남자
				                                </label>
				                            </div>
				                            <div class="col-sm-4">
				                                <label class="radio-inline">
				                                    <input type="radio" name="gender" value="2">여자
				                                </label>
				                            </div>
				                            </div>
				                    </div>
				                </div> <!-- /.form-group -->
                 				<div class="form-group ">
                                        <button type="button" onclick="inputCheck()" class="btn btn-primary btn-lg btn-block login-button">회원가입</button>
                                        <button type="reset" class="btn btn-primary btn-lg btn-block login-button">다시쓰기</button>
                                    </div>
                                    <div class="login-register">
                                        <a href="guestLogin.jsp">로그인</a>
                                    </div>
            </form> <!-- /form -->
                            </div>

                        </div>
                    </div>
                </div>
</div>
<!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
