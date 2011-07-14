<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html" import="java.util.*"%>
<html>
    <head>
        <title>Check validate!</title>
  </head>
    <body>
      <s:if test="#session.etatConnexion != 'true'">
      	<script language="javascript">
			document.location.href="/CorePharma/";
		</script>
      </s:if>
    </body>
</html>