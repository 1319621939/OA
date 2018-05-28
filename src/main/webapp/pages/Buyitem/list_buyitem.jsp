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
<div class="hand"></div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script>
		$(function() {
			$.ajax({
				url :'list_buyitem',
				data:{},
				success: function(d, s) {
					var json = $.parseJSON(d);
					var htm = "";
					$.each(json, function(i, buyitem) {
						var see_status = "";
						var see_result = "";
						var see_remark = "";
						if(buyitem.status == 0){
							see_status = "已提交";
							}else{
							see_status="正在审核";
							}
						if(buyitem.result == 0){
							see_result = "未处理";
							}else if(buyitem.result == 1){
								see_result="未通过";
							}else{
								see_result="已通过";					
								}
						if(buyitem.remark == null){
							see_remark = "无";
							}else{
							see_remark=buyitem.remark;
							}
						
						htm += "  标题:"+buyitem.title+"  内容:"+buyitem.content+
						"  备注:"+see_remark+"  状态码:"+see_status+"  申请人:"+"xxx"+"  审核结果:"+
						"<form action=aremark?id="+buyitem.buyitemId+" method='post'>"+
						"<select name=result><option value='0'>审核中</option>"+
							"<option value='1'>未通过</option>"+
							"<option value='2'>已通过</option>"+
						"</select><input type='submit' value='提交' /></form>";
					});
					$(".hand").html(htm);
				}
			});
			 
		});
		
		
		</script>
</body>
</html>