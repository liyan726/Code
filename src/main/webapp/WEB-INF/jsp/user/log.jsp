<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
<!-- Bootstrap --> 
<link href="bootstarp/css/bootstrap.css" rel="stylesheet">
<link href="bootstarp/css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="bootstarp/js/bootstrap.min.js"></script>
 <link href="assets/styles.css" rel="stylesheet" media="screen">
</head>
 <body id="login">
    <div class="，container">
      <form class="form-signin" action="/Genty/user/users">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="input-block-level" placeholder="Name Input" name="name">
         <input type="text" class="input-block-level" placeholder="Pas Input" name="id">
        <label class="checkbox">
          <h3>${err.mesName}</h3>
        </label>
        <button class="btn btn-large btn-primary" type="submit">Sign in</button>
      </form>
	
    </div> <!-- /container -->
    <script src="vendors/jquery-1.9.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    

  </body>
</html>

