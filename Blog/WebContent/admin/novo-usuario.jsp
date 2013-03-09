<%@ taglib prefix="a" tagdir="/WEB-INF/tags/admin" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<a:template titulo="Novo Usuário">
	<form action="cadastrar-usuario" class="offset2 span4 well" method="POST">
		<fieldset>
			<c:if test="${ cadastrado eq true }">
				<m:alert type="success">Usuário cadastrado com sucesso</m:alert>
			</c:if>
			<legend>Cadastra novo usuário</legend>
			<label for="nome">Nome</label>
			<input class="span4 required" id="nome" type="text" name="nome" required />
			<label for="email">E-mail</label>
			<input class="span4 required" id="email" type="email" name="email" required />
			<label for="login">Login</label>
			<input class="span4 required" id="login" type="text" name="login" required />
			<label for="senha">Senha</label>
			<input class="span4 required" id="senha" type="password" name="senha" required />
			<label><button type="submit" class="btn btn-primary">Salvar</button></label>			
		</fieldset>
	</form>
</a:template>