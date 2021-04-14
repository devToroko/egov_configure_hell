<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="/resources/bootstrap.min.css">
	<script src="/resources/jquery.min.js"></script>
	<script src="/resources/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	  <h2>Sample 등록</h2>
	  <p>Spring Form 을 배우기 위한 임시 SampleVO 등록 페이지입니다.</p><br>
	  
	  <form:form modelAttribute="sample" action="${pageContext.request.contextPath}/register" method="post">
	  	<div class="form-group">
			<label for="title">제목</label>
			<form:input class="form-control" path="id"  />
		</div>
		<div class="form-group">
			<label for="title">제목</label>
			<form:input class="form-control" path="title"  />
		</div>
		<div class="form-group">
			<label for="title">제목</label>
			<form:input class="form-control" path="regUser"  />
		</div>
		<div class="form-group">
			<label for="title">제목</label>
			<form:input class="form-control" path="content"  />
		</div>
	    <br><br> 
	    <form:button type="submit" class="btn btn-success">등록</form:button>
	    
	    <a href="/home" class="btn btn-info" role="button">GO HOME</a>
	  </form:form>
	</div>
</body>
</html>