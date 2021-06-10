<%--ホームページ画面 --%>

<%@page pageEncoding="UTF-8" %>
<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テスト株式会社</title>
<link rel="stylesheet" href="style.css">

</head>
<body>

<header>
<h1>テスト株式会社</h1>
</header>
<hr>

<table style="border-collapse:separate;border-spacing:10px;">
<tr>
<th>○入力操作○</th>
<th>○書類/伝票○</th>
<th>○データ内容編集○</th>
<th>○検索○</th>
</tr>
<tr>
<td><a href="../chapter26/purchase_order_input.jsp">発注</a></td>
<td><a href="">注文書</a></td>
<td><a href="">自社情報</a></td>
<td><a href="../chapter26/Inventory.action">在庫</a></td>
</tr>

<tr>
<td><a href="../chapter26/incoming.jsp">入荷</a></td>
<td><a href="">入荷伝票</a></td>
<td><a href="">仕入先情報</a></td>
</tr>
<tr>
<td><a href="">仕入</a></td>
<td><a href="">仕入伝票</a></td>
<td><a href="">材料</a></td>
</tr>

</table>


<%@include file="../footer.html" %>