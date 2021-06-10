<%--発注データ・発注明細データ登録用画面 --%>

<%@page pageEncoding="UTF-8" %>

<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>


<p>発注入力</p>
<form action="" method="post"> <%--送信先仮 --%>
<p>発注番号:<input type="text" name="orderNo"></p>
<p>発注日:<input type="date" name="orderDay"></p>
<p>受注番号:<input type="text" name="receiveNo"></p> <%--受注データ明細から --%>
<p>仕入先コード: <input type="text" name="supplierNo"></p> <%--仕入先マスタから --%>
<p>仕入先枝番:<input type="text" name="branchNo"></p> <%--上に同じ --%>
<p>発注担当者コード:<input type="text" name="orderStaffNo"></p> <%--社員マスタから --%>
<p>指定納期:<input type="date" name="delivaryTime"></p>
<p>倉庫コード:<input type="text" name="warehouseNo"></p> <%--倉庫マスタから --%>
<p>発注金額合計:<input type="text" name="total"></p>
<p>消費税金額:<input type="text" name="tax">
<p>発注行表示番号:<input type="text" name="orderLowNo"></p>
<p>発注行番号: <input type="text" name="orderLowNo"></p>
<p>受注行番号: <input type="text" name="receiveLowNo"></p> <%--受注データ明細から --%>
<p>商品コード:<input type="text" name="productNo"></p> <%--商品マスタから --%>
<p>商品名:<input type="text" name="productName"></p> <%--上に同じ --%>
<p>仕入単価:<input type="text" name="unitPrice"></p>
<p>発注数量:<input type="text" name="orderAmount"></p>
<p>入荷済数量:<input type="text" name="stock"></p>
<p>完了フラグ:<input type="radio" name="okFlag" value="0">未完了
			  <input type="radio" name="okFlag" value="1">完了
<p>備考:</p><textarea name="other" rows="6" cols="40"></textarea>
<p>作成日時:<input type="datetime-local" name="createDay">
<p>作成者名:<input type="text" name="createName"></p>
<p>更新日時:<input type="datetime-local" name="updateDay"></p>
<p>更新者名:<input type="text" name="updateName"></p>

<p><input type="submit" value="発注データ登録"></p>
</form>

<%@include file="../footer.html" %>


