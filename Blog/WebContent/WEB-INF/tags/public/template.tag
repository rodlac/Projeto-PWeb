<%@ attribute name="titulo" required="true" rtexprvalue="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag body-content="scriptless" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>${ titulo }</title>
	<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" />" />
</head>
<body>
	<c:if test="${ sessionScope.user != null }"><%@include file="/admin/admin-bar.jsp" %></c:if>
	<div class="container">
		<div class="page-header">
			<h1><a href="<c:url value="/" />"><img src="<c:url value="/img/pweb-logo.png" />" /></a> <small>Apenas um projeto acadêmico</small></h1>
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
	<script type="text/javascript" src="<c:url value="/js/jquery.js" />"></script>
	<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js" />"></script>
	
</body>