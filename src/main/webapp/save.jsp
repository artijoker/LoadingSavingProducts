<%--
  Created by IntelliJ IDEA.
  User: artij
  Date: 16.09.2022
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Сохранение товаров</title>
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
</head>
<body>
<jsp:include page="header.html" />

<div class="ms-5">
    <h1>Сохранить файл с товарами</h1>
    <form class="w-50  mt-3" action="save" method="post">

            <div class="form-group">
                <label for="nameId">Название*</label>
                <input type="text" id="nameId" class="form-control" name="name"  required>
            </div>
            <button type="submit" class="btn btn-primary  mt-4">Сохранить</button>
    </form>
</div>

</body>
</html>
