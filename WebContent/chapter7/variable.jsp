<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html"%>

<%! int countA=0; %>
<%
        int countB=0;
		countA++;
		countB++;
		%>

<p>宣言による変数countAは<%=countA %></p>
<p>スクリプトレット内の変数countBは<%=countB%></p>
<%@include file="../footer.html" %>