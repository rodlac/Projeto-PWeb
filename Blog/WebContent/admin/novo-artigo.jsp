<%@ taglib prefix="a" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<a:template titulo="Novo Artigo">
	<form action="cadastrar-artigo" class="well" method="POST">
		<fieldset class="row-fluid">
			<legend>Cadastrar novo artigo</legend>
			<input class="span12 required" id="titulo" type="text" name="titulo" placeholder="Digite o título aqui" />
			<label><textarea id="redactor_content" name="texto" rows="10"></textarea></label>
			<m:categoriaComboBox name="categoria" lista="${ categorias }" />
			<label><button type="submit" class="btn btn-primary">Salvar</button></label>			
		</fieldset>
	</form>
</a:template>