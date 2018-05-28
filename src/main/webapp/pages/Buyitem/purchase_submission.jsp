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
	<form action="buyitem_submit" method="post">
			申请采购标题:<input type="text" name="title" id="title" value="" /><br />
			采购清单:<input type="text" name="content" id="content" value="" /><br />
			备注:<input type="text" name="remark" id="remark" value="" /><br />
			<input type="submit" value="提交" />
		</form>
</body>
</html>