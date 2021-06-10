<%--在庫登録処理 --%>

<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>在庫入力</p>
<hr>

<form action="InventoryNew.action" method="post">
<p>倉庫コード:<input type="text" name="warehouseCode"></p>
<p>商品コード:<input type="text" name="productCode"></p>
<%-- <p>ロット番号:<input type="text" name="rotNumber"></p> --%>
<%--<p>良品区分:<input type="text" name="productQuality"></p> --%>
<p>実在個数:<input type="text" name="actualStock"></p>
<%--<p>有効在庫数:<input type="text" name="activeStock"></p> --%>



<p><input type="submit" value="在庫データ登録"></p>
</form>
<%@include file="../footer.html" %>