<%@ taglib prefix="a" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<a:template titulo="Páginas publicadas">
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>#</th>
				<th>Título</th>
				<th>Página pai</th>
				<th>Data</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pagina" items="${paginas}">
				<tr>
					<td>${ pagina.id }</td>
					<td>${ pagina.titulo }</td>
					<td>${ pagina.pai.titulo }</td>
					<td><fmt:formatDate pattern="dd/MM/YYY" value="${ pagina.data_publicacao }" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</a:template>