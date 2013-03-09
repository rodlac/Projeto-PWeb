<%@ tag import="java.util.ArrayList"%>
<%@ tag import="java.util.Arrays" %>
<%@ tag body-content="scriptless" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="length" required="false" %>
<%@ attribute name="etc" required="false" type="java.lang.String" %>

<c:if test="${length == null}"><c:set var="length" value="80" /></c:if>
<c:if test="${etc == null}"><c:set var="etc" value="..." /></c:if>

<jsp:doBody var="bodyRes"/>
<%
	int length = Integer.parseInt(jspContext.getAttribute("length").toString());
	String etc = (String) jspContext.getAttribute("etc");
	String bodyRes = (String) jspContext.getAttribute("bodyRes");
	String[] words = bodyRes.replaceAll("<(.|\n)*?>", "")
			  .replaceAll("\n"," ")
			  .replaceAll("\r"," ")
			  .split(" ", length+1);
	
	ArrayList<String> palavras = new ArrayList<String>(Arrays.asList(words));
	if(palavras.size() > length) {
		palavras.remove(length);
		palavras.add(etc);
	}
	
	StringBuilder sb = new StringBuilder();
	for(String s : palavras)
		sb.append(s).append(" ");
	
	
	jspContext.setAttribute("words", sb.toString().trim());
%>
${words}