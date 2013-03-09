<%@ attribute name="titulo" required="true" rtexprvalue="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ tag body-content="scriptless" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Administração - ${ titulo }</title>
	<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" />" />
	<link rel="stylesheet" href="<c:url value="/css/redactor.css" />" />
</head>
<body>
	<%@include file="/admin/admin-bar.jsp" %>
	<div class="container">
		<div class="page-header">
			<h1>Administração <small>${ titulo }</small> ${ request.requestURI }</h1>
		</div>
		<div class="row">
			<div class="span3">
				<div class="sidebar-nav">
					<div class="well" style="padding: 19px 0;">
						<ul class="nav nav-list">
							<li class="nav-header"><i class="icon-pencil"></i> Artigos</li>
							<li<c:if test="${ requestScope['javax.servlet.forward.servlet_path'] eq '/cadastrar-artigo'}"> class="active"</c:if>><a href="cadastrar-artigo"><i class="icon-plus-sign"></i> Adicionar Novo</a></li>
							<li<c:if test="${ requestScope['javax.servlet.forward.servlet_path'] eq '/listar-artigos'}"> class="active"</c:if>><a href="listar-artigos"><i class="icon-list"></i> Listar todos</a></li>
							<li class="nav-header"><i class="icon-edit"></i> Páginas Estáticas</li>
							<li<c:if test="${ requestScope['javax.servlet.forward.servlet_path'] eq '/cadastrar-pagina'}"> class="active"</c:if>><a href="cadastrar-pagina"><i class="icon-plus-sign"></i> Adicionar Nova</a></li>
							<li<c:if test="${ requestScope['javax.servlet.forward.servlet_path'] eq '/listar-paginas'}"> class="active"</c:if>><a href="listar-paginas"><i class="icon-list"></i> Listar todas</a></li>
							
							<li class="nav-header"><i class="icon-tags"></i> Categorias</li>
							<li<c:if test="${ requestScope['javax.servlet.forward.servlet_path'] eq '/cadastrar-categoria'}"> class="active"</c:if>><a href="cadastrar-categoria"><i class="icon-plus-sign"></i> Adicionar Nova</a></li>
							<li<c:if test="${ requestScope['javax.servlet.forward.servlet_path'] eq '/listar-categorias'}"> class="active"</c:if>><a href="listar-categorias"><i class="icon-list"></i> Listar todas</a></li>
							
							<li class="nav-header"><i class="icon-comment"></i> Comentários</li>
							<li<c:if test="${ requestScope['javax.servlet.forward.servlet_path'] eq '/listar-comentarios'}"> class="active"</c:if>><a href="listar-comentarios"><i class="icon-list"></i> Listar todos</a></li>
							
							<li class="nav-header"><i class="icon-user"></i> Usuários</li>
							<li<c:if test="${ requestScope['javax.servlet.forward.servlet_path'] eq '/cadastrar-usuario'}"> class="active"</c:if>><a href="cadastrar-usuario"><i class="icon-plus-sign"></i> Adicionar Novo</a></li>
							<li<c:if test="${ requestScope['javax.servlet.forward.servlet_path'] eq '/listar-usuarios'}"> class="active"</c:if>><a href="listar-usuarios"><i class="icon-list"></i> Listar todos</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="span9">
				<jsp:doBody />
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
	<script type="text/javascript" src="<c:url value="/js/jquery.js" />"></script>
	<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js" />"></script>
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