<%--入荷入力処理 --%>

<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>


<p>入荷入力</p>
<hr>

     商品コード<select form="IncomingForm" name="productCode">
        <option selected disabled hidden>選んでください</option>
        <c:forEach var="item" items="${proList}">
        	<option value="${item.productCode}">${item.productCode}</option>
        </c:forEach>
    </select>

     仕入先コード<select form="IncomingForm" name="supplierCode">
        <option selected disabled hidden>選んでください</option>
        <c:forEach var="item" items="${supList}">
        	<option value="${item.supplierCode}">${item.supplierCode}</option>
        </c:forEach>
    </select>

     倉庫コード<select form="IncomingForm" name="warehouseCode">
        <option selected disabled hidden>選んでください</option>
        <c:forEach var="item" items="${warList}">
        	<option value="${item.warehouseCode}">${item.warehouseCode}</option>
        </c:forEach>
    </select>

     <p>入荷日:<input type="date" form="IncomingForm" name="incomingDate" required></p>

     担当者名<select form="IncomingForm" name="personName">
        <option selected disabled hidden>選んでください</option>
        <c:forEach var="item" items="${empList}">
        	<option value="${item.personName}">${item.personName}</option>
        </c:forEach>
    </select>

     <p>数量<input type="text" form="IncomingForm" name="volume" required></p>

     <p>単価<input type="text" form="IncomingForm" name="price" required></p>

<p><button type="submit" form="IncomingForm">入荷データの登録と実在庫数の更新</button></p>

<form action="Incoming.action" method="post" id="IncomingForm"></form>

<%@include file="../footer.html" %>