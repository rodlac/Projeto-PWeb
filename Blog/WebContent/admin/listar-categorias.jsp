<%@ taglib prefix="a" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<a:template titulo="Listar Categorias">
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>#</th>
				<th>Nome</th>
				<th>Descrição</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="categoria" items="${categorias}" varStatus="status">
				<tr>
					<td>${ categoria.id }</td>
					<td>${ categoria.nome }</td>
					<td>${ categoria.descricao }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</a:template>