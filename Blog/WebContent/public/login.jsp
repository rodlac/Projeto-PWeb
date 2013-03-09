<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>PWeb Blog - Login</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<style type="text/css">
		body {
			padding: 100px 0;
			background-color: #f5f5f5;
		}
		
		.form-signin {
	        max-width: 300px;
	        padding: 19px 29px 29px;
	        margin: 0 auto 20px;
	        background-color: #fff;
	        border: 1px solid #e5e5e5;
	        -webkit-border-radius: 5px;
	           -moz-border-radius: 5px;
	                border-radius: 5px;
	        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
	           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
	                box-shadow: 0 1px 2px rgba(0,0,0,.05);
	      }
	      
	      .form-signin input[type="text"],
	      .form-signin input[type="password"] {
	        font-size: 16px;
	        height: auto;
	        margin-bottom: 15px;
	        padding: 7px 9px;
	      }
	</style>
</head>
<body>
	<form class="form-signin" method="POST" action="login">
		<c:if test="${ error eq true }">
			<m:alert type="error">Usuário ou Senha inválidos</m:alert>
		</c:if>
		<fieldset>
			<legend>Efetuar login</legend>
			<input type="text" class="span4" name="login" placeholder="Usuário" title="No mínimo 6 letras minúsculas" pattern="[a-z]{6,}" required>
			<input type="password" id="password" class="span4" name="senha" placeholder="Senha" required>
			<button type="submit" name="submit" class="btn btn-info btn-block btn-large">Logar</button>
		</fieldset>
	</form>
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>