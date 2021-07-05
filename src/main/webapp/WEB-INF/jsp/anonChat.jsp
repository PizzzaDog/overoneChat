<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="header.jsp"/>
<html>
<body>
<div style="overflow:auto;  align-items: center; width: 400px; height: 500px; position: center">
<form>
    <c:forEach var="message" items="${messages}">
        <tr>
            <td>
                <div>
                        ${message.sender}:
                        ${message.text}
                </div>
            </td>
            <td>
            </td>
        </tr>
        <tr>
        </tr>
    </c:forEach>
</form>
</div>
<div>
    <form action="/anon/chat" method="post">
        <input type="text" name="text">
        <c:if test="${not empty name}">
         <input hidden type="text" name="name" value="${name}">
        </c:if>
        <c:if test="${isGet}">
            <input type="text" name="name">
        </c:if>
        <button type="submit">Send</button>
    </form>
</div>
</body>
</html>