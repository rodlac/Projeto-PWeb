<%@ taglib prefix="a" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<a:template titulo="Nova Categoria">
	<form action="cadastrar-categoria" class="offset2 span4 well" method="POST">
		<c:if test="${ cadastrado eq true }">
			<m:alert type="success">Categoria cadastrada com sucesso</m:alert>
		</c:if>
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