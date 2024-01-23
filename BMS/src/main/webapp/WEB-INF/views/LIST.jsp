<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
  <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<%@ include file="menu.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>custName</th>
<th>items</th>
<th>Quantity</th>
<th>Price</th>
<th>Update</th>
</tr>

  <c:forEach  var="item" items="${msg}">
   <tr>
  <td>${item.custName}</td>
  <td>${item.items}</td>
  <td>${item.quantity}</td>
  <td>${item.price}</td>
  

  <td><a href="/Updated?id=${item.id}"> update</a></td>
  </tr>
  </c:forEach>
  

</table>
</body>
</html>