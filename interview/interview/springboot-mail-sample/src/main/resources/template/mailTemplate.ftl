<!DOCTYPE html>
<html lang="zh" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>用户验证码</title>
</head>
<body>
<div><span th:text="${username}">XXX</span>&nbsp;先生/女士,您好： </div>
<p style="text-indent: 2em">您的用户验证码为<span th:text="${code}" style="color: cornflowerblue">123456</span>，请妥善保管。></p>
</body>
</html>