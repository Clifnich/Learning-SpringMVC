<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add todo</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"/>

</head>
<body>

<div class="container">
<h1>Add a Todo</h1>
<form:form method="post" commandName="todo">
	
	<form:hidden path="id"/>
	<form:hidden path="user"/>
	
	<fieldset class="form-group">
		<form:label path="desc">Description</form:label>
		<form:input path="desc" type="text" class="form-control" required="required"/>
		<form:errors path="desc" cssClass="text-warning"/>
	</fieldset>
	
	<fieldset class="form-group">
		<form:label path="date">Target Date</form:label>
		<form:input path="date" type="text" class="form-control" required="required"/>
		<form:errors path="date" cssClass="text-warning"/>
	</fieldset>
	
	<input class="btn btn-success" type="submit" value="Submit"/>
</form:form>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>