<%@ taglib prefix="a" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<a:template titulo="Novo Usuário">
	<form action="cadastrar-categoria" class="offset2 span4 well" method="POST">
		<fieldset>
			<legend>Cadastra novo usuário</legend>
			<label for="nome">Nome</label>
			<input class="span4 required" id="nome" type="text" name="nome" />
			<label for="email">E-mail</label>
			<input class="span4 required" id="email" type="text" name="email" />
			<label for="login">Login</label>
			<input class="span4 required" id="login" type="text" name="login" />
			<label for="senha">Senha</label>
			<input class="span4 required" id="senha" type="password" name="senha" />
			<label><button type="submit" class="btn btn-primary">Salvar</button></label>			
		</fieldset>
	</form>
</a:template>