<%@ taglib prefix="a" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<a:template titulo="Nova Categoria">
	<form action="cadastrar-categoria" class="offset2 span4 well" method="POST">
		<fieldset>
			<legend>Cadastra nova categoria</legend>
			<label for="nome">Nome</label>
			<input class="span4 required" id="nome" type="text" name="nome" />
			<label for="nome">Descrição</label>
			<input class="span4 required" id="descricao" type="text" name="descricao" />
			<label><button type="submit" class="btn btn-primary">Salvar</button></label>			
		</fieldset>
	</form>
</a:template>