<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>
<h2>update Registration..</h2>
<form action="update" method="post">
<pre>
    
     email <input type="text" name="email" value="<%=request.getAttribute("email")%>"/>
     mobile <input type="text" name="mobile" value="<%=request.getAttribute("mobile")%>"/>
     <input type="submit" value="update"/>
</pre>
     
</form>
<%
  if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
}
%>

</body>
</html>