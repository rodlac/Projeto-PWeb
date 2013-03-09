<%@ taglib prefix="p" tagdir="/WEB-INF/tags/public" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p:template titulo="PWeb Blog - ${ artigo.titulo }">
	
	<div class="page-header">
		<h2>${ pagina.titulo }</h2>
	</div>
	<div id="content">
		${ pagina.texto }
	</div>
</p:template>