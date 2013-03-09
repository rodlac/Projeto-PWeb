<%@ taglib prefix="p" tagdir="/WEB-INF/tags/public"%>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<p:template titulo="${ artigo.titulo }">

	<h2>${ artigo.titulo }</h2>
	<div class="well well-small">
		<i class="icon-user"></i> ${ artigo.usuario.nome } | <i
			class="icon-calendar"></i>
		<fmt:formatDate type="both" dateStyle="short" timeStyle="short"
			value="${artigo.data_atualizacao}" />
		| <i class="icon-comment"></i> <a href="#">3 Comments</a> | <span
			class="label label-info">${ artigo.categoria.nome }</span>
	</div>
	<div id="content">${ artigo.texto }</div>
	<hr />
	<form action="comentar" method="POST" class="well">
		<fieldset>
			<legend>Deixe seu comentário</legend>
			<div class="row-fluid">
				<div class="span4">
					<label>Nome</label> <input type="text" class="span12" placeholder="Digite seu nome" required />
					<label>Email</label> <input type="email" class="span12" placeholder="Digite seu email" required />
					<label>Site/Blog</label> <input type="url" class="span12" placeholder="http://" /> 
				</div>
				<div class="span8">
					<label>Comentário</label>
					<textarea name="message" id="message" class="input-xlarge span12" rows="8"></textarea>
				</div>
	
				<button type="submit" class="btn btn-large btn-primary pull-right">Comentar</button>
			</div>
		</fieldset>
		<input type="hidden" name="pid" value="${ artigo.id }" />
	</form>
</p:template>