<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
</head>
<body>
<h4>我的好友：</h4>
    <#list list as item>
    <marquee>姓名：${item.title} , 年龄${item.content}</marquee>
    <br>
    </#list>
</body>
</html>