<%@ taglib prefix="a" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<a:template titulo="Listar Usuários">
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>#</th>
				<th>Nome</th>
				<th>Email</th>
				<th>Login</th>
				<th>Registrado em</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="usuario" items="${usuarios}" varStatus="status">
				<tr>
					<td>${ usuario.id }</td>
					<td>${ usuario.nome }</td>
					<td>${ usuario.email }</td>
					<td>${ usuario.login }</td>
					<td><fmt:formatDate pattern="dd/MM/YYY" value="${ usuario.data_registro }" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</a:template>