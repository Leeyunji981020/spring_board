<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
		
	<%
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i=0; i<cookies.length; i++){
				out.println(cookies[i].getName() + ":");
				out.println(cookies[i].getValue() + "<br />");
			}
		}
	%>
	<hr>
	<!-- 쿠키 값: ${cookie.JSESSIONID.value}<br> -->
	<hr>
	
	<a href="${pageContext.request.contextPath}/cookie/del">쿠키 삭제</a>
</body>
</html>
