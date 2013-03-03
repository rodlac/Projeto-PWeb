<%@ attribute name="titulo" required="true" rtexprvalue="true" %>
<%@ tag body-content="scriptless" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>${ titulo }</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>PWeb Blog <small>Apenas um projeto acadêmico</small></h1>
		</div>
		<div class="row">
			<div class="span9">
				<jsp:doBody />
			</div>
			<div class="span3">
				<div class="well sidebar-nav">
					
				</div>
			</div>
		</div>
	</div>
	<hr />
	<footer class="container">
		<div class="row">
			<div class="span6">
				<p>PWeb Blog</p>
			</div>
			<div class="span6 text-right">
				<p>&copy; Desenvolvido por Rodrigo Lacerda e Emerson Raniere</p>
			</div>
		</div>		
    </footer>
	<script type="text/javascript" src="js/jquery.js"></script>
</body>