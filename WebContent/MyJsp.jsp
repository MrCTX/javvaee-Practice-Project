<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件的上传</title>
</head>
<body>
<s:actionerror/>
<s:form action="FileAction" method="post" enctype="multipart/form-data">
<s:file label="请选择文件" name="photo"></s:file>
<s:file label="请选择文件" name="photo"></s:file>
<s:file label="请选择文件" name="photo"></s:file>
<s:submit value="上传"></s:submit>
</s:form>
</body>
</html>