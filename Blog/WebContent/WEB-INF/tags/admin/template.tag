<%@ attribute name="titulo" required="true" rtexprvalue="true" %>
<%@ tag body-content="scriptless" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Administra��o - ${ titulo }</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/redactor.css" />
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>Administra��o <small>${ titulo }</small></h1>
		</div>
		<div class="row">
			<div class="span3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">Artigos</li>
						<li><a href="#">Adicionar Novo</a></li>
						<li><a href="#">Listar todos</a></li>
						
						<li class="nav-header">P�ginas Est�ticas</li>
						<li><a href="#">Adicionar Nova</a></li>
						<li><a href="#">Listar todas</a></li>
						
						<li class="nav-header">Categorias</li>
						<li><a href="#">Adicionar Nova</a></li>
						<li><a href="#">Listar todas</a></li>
						
						<li class="nav-header">Coment�rios</li>
						<li><a href="#">Listar todos</a></li>
						
						<li class="nav-header">Usu�rios</li>
						<li><a href="#">Adicionar Novo</a></li>
						<li><a href="#">Listar todos</a></li>
					</ul>
				</div>
			</div>
			<div class="span9">
				<jsp:doBody />
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/redactor.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#redactor_content').redactor({
				lang: 'pt_br',
				minHeight: 200
			});
		});
	</script>
</body>