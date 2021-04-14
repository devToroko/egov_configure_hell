<%@page import="egovframework.sample.service.impl.SampleDaoJdbc"%>
<%@page import="egovframework.sample.vo.SampleVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="/resources/bootstrap.min.css">
	<script src="/resources/jquery.min.js"></script>
	<script src="/resources/bootstrap.min.js"></script>
	<title>SAMPLE 상세</title>
</head>
<body>
	<div class="container">
	  <h2>SAMPLE 상세</h2>
	  <p>SampleVO의 상세한 내용입니다.</p><br>
	  
	  <%-- action 속성값을 수정 --%>
	  <form action="updateSample" method="post">
	    <input type="hidden" name="id" value="${sample.id}">
	    
	    <div class="form-group">
	      <label for="title">제목</label>
	      <input type="text" name="title" class="form-control" id="title" value="${sample.title}">
	    </div>
	    <div class="form-group">
	      <label for="regUser">작성자</label>
	      <input type="text" name="regUser" class="form-control" id="regUser" value="${sample.regUser}" disabled="disabled">
	    </div>
	    <div class="form-group">
	      <label for="content">내용</label>
	      <textarea class="form-control" name="content">${sample.content}</textarea>
	    </div>
	    <br>
	        등록일 : ${sample.regDate}
		<br><br>
	    <button type="submit" class="btn btn-default">UPDATE</button>
	  </form>
	</div>
	
	<div class="container" style="margin-top:2em; text-align:right">
		  <a href="insertSample" class="btn btn-success" role="button">INSERT</a>
		  <a href="deleteSample?id=${sample.id}" class="btn btn-danger" role="button">DELETE</a>
		  <a href="selectSampleList" class="btn btn-info" role="button">LIST</a>
	</div>
</body>
</html>