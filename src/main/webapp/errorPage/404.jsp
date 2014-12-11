<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<%@taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page"%> 
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
   <meta content="width=device-width, initial-scale=1.0" name="viewport" />
   <meta content="" name="description" />
   <meta content="Mosaddek" name="author" />
   <link href="<%=basePath%>ui/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   <link href="<%=basePath%>ui/assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   <link href="<%=basePath%>ui/assets/bootstrap/css/bootstrap-fileupload.css" rel="stylesheet" />
   <link href="<%=basePath%>ui/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   <link href="<%=basePath%>ui/css/style.css" rel="stylesheet" />
   <link href="<%=basePath%>ui/css/style-responsive.css" rel="stylesheet" />
   <link href="<%=basePath%>ui/css/style-default.css" rel="stylesheet" id="style_color" />
   <link href="<%=basePath%>ui/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
   <link href="<%=basePath%>ui/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen">
   <link rel="stylesheet" href="<%=basePath%>ui/assets/data-tables/DT_bootstrap.css" />
   <link rel="stylesheet" type="text/css" href="<%=basePath%>ui/assets/uniform/css/uniform.default.css" />
   
<title>404</title>
</head>
<body class="error-404">
    <div class="error-wrap error-wrap-404">
        <div class="metro big terques">
           <span> OOPS! </span>
        </div>
        <div class="metro green">
            <span> 4 </span>
        </div>
        <div class="metro yellow">
            <span> 0 </span>
        </div>
        <div class="metro purple">
            <span> 4 </span>
        </div>
        <div class="metro double red">
            <span class="page-txt"> Page Not Found </span>
        </div>
        <div class="metro gray">
            <a href="/Code/index" class="home"><i class="icon-home"></i> </a>
        </div>

    </div>
</body>
</html>