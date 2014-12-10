<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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
<title>用户添加</title>
<script type="text/javascript">
$(function(){
	
	$('#confirm_password').blur(function(){
		var pasword=$('#password').val();
		var pascom=$('#confirm_password').val();
		if(pasword!=pascom){
			alert("密码输入不一致，请核对重试");
			$('#confirm_password').val("");
			return true
		}
	})
})

</script>
</head>
<body>
	 <div class="widget green">
                        <div class="widget-title">
                            <h4><i class="icon-reorder"></i>用户添加</h4>
                            <div class="tools">
                                <a href="javascript:;" class="collapse"></a>
                                <a href="#portlet-config" data-toggle="modal" class="config"></a>
                                <a href="javascript:;" class="reload"></a>
                                <a href="javascript:;" class="remove"></a>
                            </div>
                        </div>
                        <div class="widget-body form">
                            <!-- BEGIN FORM-->
                            <sf:form class="cmxform form-horizontal" id="signupForm" method="post" action="/Code/user/add" commandName="user">
                               
                                <div class="control-group ">
                                    <label for="username" class="control-label">用户名</label>
                                    <div class="controls">
                                        <input class="span6 " id="username" name="username" type="text" /><sf:errors path="username"/>
                                    </div>
                                </div>
                                <div class="control-group ">
                                    <label for="password" class="control-label">密码</label>
                                    <div class="controls">
                                        <input class="span6 " id="password" name="password" type="password" /><sf:errors path="password"/>
                                    </div>
                                </div>
                                 <div class="control-group ">
                                    <label for="confirm_password" class="control-label">确认密码</label>
                                    <div class="controls">
                                        <input class="span6 " id="confirm_password" name="confirm_password" type="password" /><sf:errors path="confirm_password"></sf:errors>
                                    
                                    </div>
                                 	
                                </div>
                                <div class="control-group ">
                                    <label for="email" class="control-label">Email</label>
                                    <div class="controls">
                                        <input class="span6 " id="email" name="emails" type="email" /><sf:errors path="emails"/>
                                    </div>
                                </div>
                                
                                <div class="form-actions">
                                    <button class="btn btn-success" type="submit">保存</button>
                                    <button class="btn" type="button">清除</button>
                                </div>
                            </sf:form>              
                            <!-- END FORM-->
                        </div>
                    </div>
                       <script src="<%=basePath%>ui/js/form-validation-script.js"></script>
</body>
</html>