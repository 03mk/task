<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="i" begin="101" end="200">
	<c:choose>
		<c:when test="${i%10==1}">(${i},</c:when>
		<c:when test="${i%10==0}">${i})<br></c:when>
		<c:otherwise>${i},</c:otherwise>
	</c:choose>
</c:forEach>

<%@include file="../footer.html" %>
