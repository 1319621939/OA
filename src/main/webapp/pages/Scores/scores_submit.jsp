<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="scores_submit" method="post">
		<h3>输入要选择的分组</h3>
		<select class="group" name="groupSc">
			<option value="1">java4</option>
		</select>
		<h3>输入要录入的考试批次</h3>
		<input type="text" name="title" id="title" value="" /> 
		<input type="submit" value="提交" />
	</form>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script>
		$(function() {
			$.ajax({
				url :'scores_group',
				data:{},
				success: function(d, s) {
					var json = $.parseJSON(d);
					var htm = "";
					$.each(json, function(i, group) {					
						htm += "<option value="+group.groupId+">"+group.groupName+"</option>";
					});
					$(".group").html(htm);
				}
			});
			 
		});
		</script>
</body>
</html>