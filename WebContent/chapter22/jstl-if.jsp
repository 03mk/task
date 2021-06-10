<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

抽選結果：
<c:if test="${Math.random()<0.5}">
	あたり！
</c:if>

<%@include file="../footer.html" %>
