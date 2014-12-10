<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="<%=basePath%>js/jquery-1.6.2.js"></script>

<script type="text/javascript">
	$(function() {
		 $("#selectall").click(function () {//全选  
			 if(this.checked){   
			       $("input[name='checkboxes']").each(function(){this.checked=true;});
			
			    }else{   
			        $("input[name='checkboxes']").each(function(){this.checked=false;});   
			    }    
         });  	 
	})
	
	function show(id) {
		if(id==null){
		 var checkboxes =[];//定义一个数组      
         $('input[name="checkboxes"]:checked').each(function(){//遍历每一个名字为interest的复选框，其中选中的执行函数      
        	 checkboxes.push($(this).val());
         })  	
		}
		else {
			var checkboxes=id
			alert(checkboxes)
		}
		if(window.confirm('你确定要删除吗？')){
			 $.ajax({
					url : "/Code/user/deluser?checkboxes="+checkboxes,
					type : "post",
					dataType :"text",
					data : {
					},
					success : function(responseText) {
						alert(responseText)
						location.href="/Code/user/users";
					}
				})
            return true;
         }else{
           
            return false;
        }
	}
	
	
	function update(id){
		location.href="/Code/user/update?id="+id;
	}
	
</script>
<title>获取所有用户</title>
</head>
<body class="fixed-top">
	<!-- BEGIN EDITABLE TABLE widget-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN EXAMPLE TABLE widget-->
			<div class="widget purple">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i>查看所有用户
					</h4>
					<span class="tools"> <a href="javascript:;"
						class="icon-chevron-down"></a> <a href="javascript:;"
						class="icon-remove"></a>
					</span>
				</div>
				<div class="widget-body">
					<div>
						<div class="clearfix">
							<div class="btn-group">
								<button class="btn green">
								   <a href="/Code/user/adduser"><b>用户添加</b><i class="icon-plus"></i></a>
								</button>
							</div>
	
							<div class="btn-group">
								<button  class="btn green" >
									<a href="javascript:show(null)"><b>删除用户</b><i class="icon-remove"></i></a>
								</button>
							</div>
							
							<div class="btn-group pull-right">
								<button class="btn dropdown-toggle" data-toggle="dropdown">
									操作 <i class="icon-angle-down"></i>
								</button>
								<ul class="dropdown-menu pull-right">
									<li><a href="#">打印</a></li>
									<li><a href="#">存为PDF</a></li>
									<li><a href="#">导出Excel</a></li>
								</ul>
							</div>
						</div>
						<table class="table table-striped table-hover table-bordered" id="editable-sample">
							<thead>
								<tr>	
								<th style="width:8px;"><input type="checkbox" class="group-checkable"  id="selectall" /></th>
									<th>序号</th>
									<th>用户名</th>
									<th>密码</th>
									<th>权限</th>
									<th>邮箱</th>
									<th>编辑</th>
									<th>删除</th>
								</tr>
							</thead>
							<tbody>
							<div id="tables">
								<c:forEach items="${lis}" var="user" varStatus="st">
								<tr class="">
								<td><input type="checkbox" name="checkboxes" value="${user.id}" id="checkbox"/></td>
									<td>${st.count}</td>
									<td><a href="/Code/user/info?id=${user.id}">${user.username}</a></td>
									<td>${user.password}</td>
									<td class="center">${user.role}</td>
									<td class="center">${user.emails}</td>
									<td><a class="" href="javascript:update(${user.id})">Edit</a></td>
									<td><a class="" href="javascript:show(${user.id})">Delete</a></td>
								</tr>
								</c:forEach>
							</div>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<!-- END EXAMPLE TABLE widget-->
		</div>
	</div>
</body>
</html>