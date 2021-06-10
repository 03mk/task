<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="message" value="Hello" />
<p>message : ${message}</p>

<c:set var="message2">Welcome</c:set>
<p>message2 : ${message2}</p>

<c:set var="result" value="${1+2}" />
<p>result : ${result}</p>

<jsp:useBean id="product" class="bean.Product" />
<c:set target="${product}" property="name" value="さんま" />
<p>product.name : ${product.name}</p>

<!--
下記のuseBeanに対するEclipseの警告を消すためには、
[ウィンドウ]メニュー->[設定]->[Java]->[コンパイラー]->[エラー/警告]->[総称型]->[raw型の使用]
を[無視]に設定してください。
-->
<jsp:useBean id="map" class="java.util.HashMap" />
<c:set target="${map}" property="apple" value="りんご" />
<p>map.apple : ${map.apple}</p>

<%@include file="../footer.html" %>
