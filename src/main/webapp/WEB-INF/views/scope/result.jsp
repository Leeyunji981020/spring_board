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
		<!-- 뿌릴때는 스코프 달아줌  -->
		${applicationScope.application_name}
		<br /> ${sessionScope.session_name}
		<br /> ${pageScope.page_name}
		<br /> ${requestScope.request_name}
		<br />

		<a href="${pageContext.request.contextPath}/scope/">돌아가기</a>

</body>
</html>
