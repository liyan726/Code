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
<script type="text/javascript" src="<%=basePath%>js/jquery-1.6.2.js"></script>

<script type="text/javascript">
	$(function() {
		 $("#bu").click(function () {//全选  
		
			$("#fo").submit()
         });  	 
	})
</script>
</head>

<body>
	  <div class="widget purple">
                        <div class="widget-title">
                            <h4><i class="icon-reorder"></i> File Upload</h4>
                                <span class="tools">
                                   <a class="icon-chevron-down" href="javascript:;"></a>
                                   <a class="icon-remove" href="javascript:;"></a>
                                   </span>
                        </div>
                        <div class="widget-body form">
                            <!-- BEGIN FORM-->
                             <sf:form  method="post" enctype="multipart/form-data" action="/Code/info/photo" id="fo">
                                <div class="control-group">
                                    <label class="control-label">Image Upload</label>
                                    <div class="controls">
                                        <div data-provides="fileupload" class="fileupload fileupload-new">
                                            <div style="width: 200px; height: 150px;" class="fileupload-new thumbnail">
                                                <img alt="" src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image">
                                            </div>
                                            <div style="max-width: 200px; max-height: 150px; line-height: 20px;" class="fileupload-preview fileupload-exists thumbnail"></div>
                                            <div>
                                               <span class="btn btn-file"><span class="fileupload-new">选择图片</span>
                                               <span class="fileupload-exists">更改图片</span>
                                               <input type="file" class="default" name="attachs" id="img"></span>
                                                <a data-dismiss="fileupload" class="btn fileupload-exists" href="#">移除图片</a>
                                            </div>
                                        </div>
                                        
                                         <span>
	                                         建议使用一下浏览器： Firefox, Chrome, Opera,
	                                         Safari and Internet Explorer 10 only
                                         </span>
                                    </div>
                                </div>
                                    <button class="btn  btn-info" type="button" id="bu">提交上传</button>
	                        </sf:form> 
                            <!-- END FORM-->
                        </div>
                    </div>
	
	
	
	
	
</body>
</html>
