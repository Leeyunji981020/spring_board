<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 아래 다 내장 객체임 -->
<%
application.setAttribute("application_name", "application_value");
session.setAttribute("session_name", "session_value");
pageContext.setAttribute("page_name", "pageContext_value");
request.setAttribute("request_name", "request_value");
%>

</head>
<body>
		<!-- 뿌릴때는 스코프 달아줌  -->
		${applicationScope.application_name}
		<br /> ${sessionScope.session_name}
		<br /> ${pageScope.page_name}
		<br /> ${requestScope.request_name}
		<br />
		
		<a href="${pageContext.request.contextPath}/scope/result">결과 보기</a>

</body>
</html>
