<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@page errorPage="total-error.jsp" %>

<%
request.setCharacterEncoding("UTF-8");
int price=Integer.parseInt(request.getParameter("price"));
int count=Integer.parseInt(request.getParameter("count"));
int shipping=Integer.parseInt(request.getParameter("shipping"));
%>

<%=price %>円×<%=count %>個＋送料<%=shipping %>円＝<%=price*count+shipping %>円

<%@include file="../footer.html" %>
