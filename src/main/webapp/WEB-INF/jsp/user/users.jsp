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

<title>所有用户列表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="">
<link href="bootstarp/css/bootstrap.css" rel="stylesheet">
<link href="bootstarp/css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="bootstarp/js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(function() {
		$("#re").hide();
	})
	function show(name) {
		$("#re").toggle(100);
		var par = name;
		$.ajax({
			url : "/Genty/user/json",
			type : "post",
			dataType : "text",
			data : {
				name : par
			},
			success : function(responseText) {

				$("#re").html(
						"<font color='red' size='+1'><b>json显示</b></font><br><br>"
								+ responseText)
			},
			error : function() {
				alert("system error");
			}
		});
	}
</script>
</head>

<body>
<br>
	<div class="container">
		
		<table class="table table-hover">
			<tr class="active">
				<td>ID</td>
				<td>用户名</td>
				<td>json显示</td>
				<td>列表</td>
				<td>文件</td>
			</tr>
			<c:forEach items="${users}" var="sm">
				<tr>
					<td>${sm.id}</td>
					<td><a href="/Genty/user/${sm.name}">${sm.name}</a></td>
					<td><a href="javascript:show('${sm.name}')" id="hr">json显示</a></td>

					<td><c:forEach items="${sm.cards}" var="su">
							${su}
						</c:forEach></td>
					<td><a href="/Genty/user/dowload/${sm.file.hdName}">${sm.file.fileRealName}</a>
					</td>
				</tr>
			</c:forEach>
			<div id="re"></div>
		</table>
	
		<a href="/Genty/user/add">
		    <button type="button" class="btn btn-primary">添加用户</button>
		</a>
</body>
</html>
