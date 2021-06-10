<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="p" items="${list}">
	<p>${p.id}：${p.name}：${p.price}</p>
</c:forEach>

<c:forEach var="c" items="${list2}">
	<p>${c.id}：${c.name}：${c.price}</p>
</c:forEach>

<%@include file="../footer.html" %>
