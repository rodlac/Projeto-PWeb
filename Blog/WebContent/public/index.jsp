<%@ taglib prefix="p" tagdir="/WEB-INF/tags/public"%>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<p:template titulo="PWeb Blog">

	<c:forEach var="artigo" items="${artigos}">
		<h2><a href="<c:url value="/artigo?id=${ artigo.id }" />">${ artigo.titulo }</a></h2>
		<div class="well well-small">
			<i class="icon-user"></i> ${ artigo.usuario.nome } | <i
				class="icon-calendar"></i>
			<fmt:formatDate type="both" dateStyle="short" timeStyle="short"
				value="${artigo.data_atualizacao}" />
			| <i class="icon-comment"></i> <a href="#">3 Comments</a> | <span
				class="label label-info">${ artigo.categoria.nome }</span>
		</div>
		<div id="content"><m:resumo length="70">${ artigo.texto }</m:resumo></div>
		<hr />
	</c:forEach>
</p:template>