<%--入荷入力完了画面 --%>

<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>入荷入力が完了しました</p>
<br>
<hr>
<table>
<c:forEach var="incoming" items="${list2}" >
<tr>
 <td>${incoming.incomingNumber}</td>
 <td>${incoming.productCode}</td>
 <td>${incoming.supplierCode}</td>
 <td>${incoming.warehouseCode}</td>
 <td>${incoming.incomingDate}</td>
 <td>${incoming.personName}</td>
 <td>${incoming.volume}</td>
<%-- <td><a href="inventory-update.jsp?" --%>
 </tr>
</c:forEach>
</table>


<a href="../chapter26/incoming-sheet.jsp">入荷伝票表示</a>
<br>
<a href="../chapter26/home.jsp">ホームに戻る</a>

<%@include file="../footer.html"%>
