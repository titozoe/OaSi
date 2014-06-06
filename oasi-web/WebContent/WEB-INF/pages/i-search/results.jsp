<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RESULTS</title>
</head>
<body>
	
	
		<c:choose>
	<c:when test="${not empty requestScope.profileResults}">
		<h1>RESULT FOR: ${requestScope.research.name }</h1>
		<br>
		<table>
			<c:forEach var="item" items="${requestScope.profileResults}">
				<tr>
					<td>${item.name} ${item.surname}</td>
					<td>${item.birthDate}</td>
					<td>${item.registeredSince}</td>
					<td>
						<form action="editLibro.do">
							<input type="hidden" name="id" value="${item.id}">
							<input type="submit" value="CONTACT">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<p>NO RESULT AVAILABLE</p>
	</c:otherwise>
	</c:choose>
	
	

</body>
</html>