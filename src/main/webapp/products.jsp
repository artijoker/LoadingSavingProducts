<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Товары</title>
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
</head>
<body>
<jsp:include page="header.html"/>
<div class="ms-5">
    <h1>Список товаров</h1>

    <c:choose>
        <c:when test="${products.size() > 0}">
            <table class="mt-3">
                <thead>
                <tr>
                    <th></th>
                    <th style="padding:15px;">Название</th>
                    <th style="padding:15px; text-align:right;">Цена</th>
                    <th style="padding:15px; text-align:right;">Количество</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="product" items="${products}">
                    <tr>
                        <td style="padding:15px;">
                            <img src="${product.getUrlImage()}" width="125" alt="None">
                        </td>
                        <td style="padding:15px;">${product.getName()}</td>
                        <td style="padding:15px; text-align:right;">${product.getPrice()}</td>
                        <td style="padding:15px; text-align:right;">${product.getQuantity()}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:when>
        <c:otherwise>
            <p>
                Загрузите список товаров из
                <a href="index.jsp">файла</a>
                или
                <a href="add-product.jsp">добавте товары</a>
                вручную.
            </p>
        </c:otherwise>
    </c:choose>
</div>


</body>
</html>
