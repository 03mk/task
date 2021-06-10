<%--在庫管理ページホーム JSP/サーブレット教科書399参照 --%>

<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>在庫状況一覧</p>
<hr>


<p>商品コード検索</p>
<form action="Inventory.action" method="post">
<input type="text" name="productCode">
<input type="submit" value="検索">
</form>

<%--在庫表示 --%>
<table style="border-collapse:separate;border-spacing:10px;">
<tr>
<td>在庫番号：</td>
<td>倉庫コード:</td>
<td>商品コード:</td>
<%--<td>ロット番号:</td>
<td>良品区分:</td> --%>
<td>実在個数:</td>
<%--<td>有効在庫数</td> --%>

</tr>

<c:forEach var="inventory" items="${list1}" >
<tr>
 <td>${inventory.inventoryNumber}</td>
 <td>${inventory.warehouseCode}</td>
 <td>${inventory.productCode}</td>
<%-- <td>${inventory.rotNumber}</td>
 <td>${inventory.productQuality}</td>--%>
 <td>${inventory.actualStock}</td>
<%--<td>${inventory.activeStock}</td> --%>
<%-- <td><a href="inventory-update.jsp?" --%>
 </tr>
</c:forEach>
</table>

<br>
<a href="../chapter26/inventory-new.jsp">在庫新規登録をする</a>
<br>


<a href="../chapter26/home.jsp">ホームに戻る</a>
<hr>
<%@include file="../footer.html" %>