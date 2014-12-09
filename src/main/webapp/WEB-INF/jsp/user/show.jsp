<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>info</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link href="bootstarp/css/bootstrap.css" rel="stylesheet">
<link href="bootstarp/css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="bootstarp/js/bootstrap.min.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

<a  href="/Gnety/user/add">添加用户</a>
<br>
	<div class="container">
  <table class="table table-hover">
     			<h3>${user.name}</h3>
     			
     			<h4>${user.id}</h4>
     		
     			列表：
    		<tr class="active">
			<c:forEach items="${user.cards}" var="su">		
					<td>${su}</td>
			</c:forEach>
			</tr>
			<tr>
			  <a href="/Genty/user/${sm.file.filename}">${sm.file.filename}</a>
			</tr>
		</table>
		</div>
	<hr>
</body>
</html>
