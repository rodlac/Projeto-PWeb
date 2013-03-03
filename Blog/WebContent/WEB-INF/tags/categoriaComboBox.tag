<%@tag pageEncoding="UTF-8" body-content="empty"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@attribute name="lista" required="true" type="java.util.List" %>

<%@attribute name="name" required="true" %>

<select name="${name}">
    <c:forEach var="elemento" items="${lista}" varStatus="status">
        <option value="${elemento.id}">${elemento.nome}</option>
    </c:forEach>
</select>