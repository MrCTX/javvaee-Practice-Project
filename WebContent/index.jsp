<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主界面</title>
</head>
<body>
<s:form action="index" method="post">
<s:textfield label="用户名" name="name"/>
<s:password label="密码" name="password"/>
<s:password label="确认密码" name="password2"/>
<s:textfield label="年龄" name="age"/>
<s:radio list="#{'male':'男','female':'女' }" label="性别" name="gender"/>
<s:submit value="注册"/>
</s:form>
</body>
</html>