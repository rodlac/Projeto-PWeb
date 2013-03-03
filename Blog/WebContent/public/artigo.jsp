<%@ taglib prefix="p" tagdir="/WEB-INF/tags/public" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<p:template titulo="${ artigo.titulo }">
	
	<div class="page-header">
		<h2>${ artigo.titulo }</h2>
	</div>
	<div class="well well-small text-right">
		<span>Categoria: ${ artigo.categoria.nome }</span> - <small> Atualizado em <fmt:formatDate value="${ artigo.data_atualizacao }" pattern="dd/MM/YYYY"/> </small>
	</div>
	<div id="content">
		${ artigo.texto }
	</div>
</p:template>