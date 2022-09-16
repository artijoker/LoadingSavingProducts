<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление товара</title>
  <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
</head>
<body>
<jsp:include page="header.html" />
<div class="ms-5">
  <h1>Добавить товар</h1>
  <form class="w-50  mt-3" action="add-product" method="post">
      <div class="form-group">
        <label for="nameId">Название*</label>
        <input type="text" id="nameId" class="form-control" name="name"  required>
      </div>
      <div class="form-group mt-2">
        <label for="priceId">Цена*</label>
        <input type="number" step="0.001" id="priceId" class="form-control" name="price" required>
      </div>
      <div class="form-group mt-2">
        <label for="quantityId">Количество*</label>
        <input type="number" min="0" id="quantityId" class="form-control" name="quantity" required>
      </div>
      <div class="form-group mt-2">
        <label for="urlImageId">URL изображения</label>
        <input type="number" id="urlImageId"  class="form-control" name="urlImage">
      </div>

      <button type="submit" class="btn btn-primary mt-4">Добавить</button>
    </form>
</div>


</body>
</html>
