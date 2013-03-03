<%@ tag body-content="scriptless" %>
<%@ attribute name="type" required="true" %>
<div class="alert alert-${type} fade in">
	<button type="button" class="close" data-dismiss="alert">×</button>
	<jsp:doBody/>
</div> 