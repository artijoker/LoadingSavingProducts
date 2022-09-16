<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Загрузка товаров</title>
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
</head>
<body>
<jsp:include page="header.html" />


<div class="ms-5">
    <h1 class="h1">Загрузить файл с товарами</h1>
    <form class="form-group mt-3" action="load" method="post" enctype='multipart/form-data'>
        <label> Выбрать файл:
            <input name="file1" accept=".json"  type="file" required/>
        </label>
        <br/>
        <button class="btn btn-primary mt-4" type="submit">Загрузить</button>
    </form>
</div>

</body>
</html>