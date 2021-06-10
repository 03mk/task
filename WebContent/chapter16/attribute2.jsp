<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@page import="bean.Product, java.util.List" %>

<!-- 下記の@SuppressWarningsはEclipseの警告を消すための記述です。 -->
<%
@SuppressWarnings("unchecked")
List<Product> list=(List<Product>)request.getAttribute("list");
%>

<% for (Product p : list) { %>
	<p><%=p.getId() %>：<%=p.getName() %>：<%=p.getPrice() %></p>
<% } %>

<%@include file="../footer.html" %>
