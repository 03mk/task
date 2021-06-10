<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<jsp:useBean id="product" class="bean.Product" />

<jsp:setProperty name="product" property="id" value="2" />
<jsp:setProperty name="product" property="name" value="サーモン" />
<jsp:setProperty name="product" property="price" value="100" />
<jsp:getProperty name="product" property="id" />：
<jsp:getProperty name="product" property="name" />：
<jsp:getProperty name="product" property="price" />

<%@include file="../footer.html" %>
