<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>カートに追加する商品を入力してください。</p>
<form action="cart-add" method="post">
商品名<input type="text" name="name">
価格<input type="text" name="price">
<input type="submit" value="追加">
</form>

<%@include file="../footer.html" %>
