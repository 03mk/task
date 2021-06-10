<%--入荷入力処理 --%>

<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>入荷入力</p>
<hr>
<%--項目が空欄の場合エラーメッセージ --%>
<form action="Incoming.action" method="post">
<p>商品コード:<input type="text" name="productCode" required></p>
<p>仕入先名:<input type="text" name="supplierCode" required></p>
<p>倉庫名:<input type="text" name="warehouseCode" required></p>
<p>入荷日:<input type="date" name="incomingDate" required></p>
<p>入荷担当者:<input type="text" name="personName" required></p>
<p>数量:<input type="text" name="volume" required></p>
<p>単価:<input type="text" name="price" required></p>


<p><input type="submit" value="入荷データ登録"></p>
</form>
<%@include file="../footer.html" %>