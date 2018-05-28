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
	<form action="one_scores_group" method="post" class="group">
			<h3>序号:xx,姓名:xx,考试批次:xx</h3>
			<h3>分数</h3>
			<input type="text" name="score" id="title" value="" />
			<h3>备注</h3>
			<input type="text" name="remark" id="title" value="" />
			<input type="button" value="提交" />
		</form>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script>
		$(function() {
			$.ajax({
				url :'list_scores_group',
				data:{},
				success: function(d, s) {
					var json = $.parseJSON(d);
					var htm = "";
					$.each(json, function(i, user) {					
						htm += "<h3>序号:"+user.userId+"姓名:"+user.realName+"</h3>"
							+"<h3>分数</h3>"+
							"<input type='text' name='score' class=fs"+user.userId+" value='' />"+
							"<h3>备注</h3>"+
							"<input type='text' name='remark' class=br"+user.userId+" value='' />"+
							"<input type='button' value='确定' class="+user.userId+"/>";
					});
					$(".group").html(htm);
				}
			});
			 
		});

		$(":button").click(function(){
			 var Ibutton=$(this).attr("class");
			 alert("cc");
			$.ajax({
				url :'one_scores_group',
				data:{Iscore:$(".fs"+Ibutton).val(),Iremark:$(".fs"+Ibutton).val()},
				success: function(d, s) {
					var json = $.parseJSON(d);
					$.each(json, function(i, user) {									
					});
					
				}
			});
			  
			});
		
		</script>
</body>
</html>