<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'add.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	 <sf:form  method="post" enctype="multipart/form-data" commandName="user">
    			name:<sf:input path="name" /><sf:errors path="name"></sf:errors>
		<br>
    			id:<sf:input path="id" />
		<br>
    			cards:<sf:input path="cards" /><br>
    			
    			cards2:<sf:input path="cards" /><br>
    			文件上传1：<input type="file" name="attachs"> <br>
		<input type="submit" value="添加用户" />
	</sf:form> 
	
	<%--
	<form  method="post" action="/Springmvc/user/add2">
    			name:<input name="user1.name"  value="${user1.name}"/>
			    name:<input name="user2.name" value="${user2.name}"/>
		<input type="submit" value="添加用户" />
		--%>
	</form>
</body>
</html>
