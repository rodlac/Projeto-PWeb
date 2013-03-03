<%@ taglib prefix="a" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<a:template titulo="Listar Categorias">
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>#</th>
				<th>Título</th>
				<th>Categoria</th>
				<th>Data</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="artigo" items="${artigos}">
				<tr>
					<td>${ artigo.id }</td>
					<td>${ artigo.titulo }</td>
					<td>${ artigo.categoria.nome }</td>
					<td><fmt:formatDate pattern="dd/MM/YYY" value="${ artigo.data_publicacao }" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</a:template>