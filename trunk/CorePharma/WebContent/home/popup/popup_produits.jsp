<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Menu Produits - Choix</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
</head>
<body style="background-color:#FFFFFF;">
<center>

<p>
  <ul>
    	<!-- <li><a href="#" onclick="opener.location='../produits/produits_sous_menu_01.jsp'; window.close(); return false;">Produits - Sous menu 1</a></li>
        <li><a href="#" onclick="opener.location='../produits/produits_sous_menu_02.jsp'; window.close(); return false;">Produits - Sous menu 2</a></li>-->
        <li><a href="#" onclick="opener.location='<%=basePath%>produits/produits_sous_menu_01'; window.close(); return false;">Produits - Sous menu 1</a></li>
        <li><a href="#" onclick="opener.location='/produits/produits_sous_menu_02'; window.close(); return false;">Produits - Sous menu 2</a></li>
  </ul>
    <input type="button" value="Fermer" onclick="window.close()"/>
</p>

</center>
</body>
</html>