<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비트 대학</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h2>대학login</h2>
	<h3>주민번호와 이름을 입력해 주세요</h3>
	<form id="login_form" action="<%=request.getContextPath()%>/student.do">
	학번 : <input type="text" name="numseq"/>
	이름 : <input type="text" name="name"/>
	<input type="hidden" name="action" value="move" />
	<input type="hidden" name="dest" value="register" />
	<input type="hidden" name="directory" value="grade" />
	<input type="submit" id="btn" value="전송" />
	</form>
</div>
<script>
$('#login_form').submit(function() {
	alert('login잘 실행~');
});
</script>
</body>
</html>