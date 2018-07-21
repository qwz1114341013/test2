<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">

function sub(){
	var f=document.getElementById("form");
	f.submit();
}
</script>
<body>

<!--action指的是这个表单要提交到哪里  -->
<!--method指的是这个表单用什么方式提交  -->
<form id="form" action="test.do" method="post">

用户名:<input type="text" name="username" value=""/><br>
密码：<input type="password" name="password" value=""/><br>
<input type="button" value="提交" onclick="sub()" />

</form>


</body>
</html>