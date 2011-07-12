<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

<title>CorePharma - Commande - Commande Produits</title>
<sx:head />
<!-- Reset Stylesheet -->
<link rel="stylesheet" href="../resources/css/reset.css" type="text/css"
	media="screen" />

</head>

<body>
<div id="body-wrapper"></div>

<div id="sidebar">
<div id="sidebar-wrapper">
<h1 id="sidebar-title"><a href="#">CorePharma</a></h1>
<a href="#"><img src="../resources/images/Logo-CorePharma.png"
	alt="CorePharma logo" width="167" height="107" id="logo" /></a> <!-- Sidebar Profile links -->
<div id="profile-links">Bienvenue, <a href="#"
	title="Edit your profile">Utilisateur</a>, <br />
<a href="<%=basePath%>deconnexion" title="Déconnexion">Déconnexion</a></div>
<ul id="main-nav">
	<!-- Accordion Menu -->

	<li><a href="<%=basePath%>tableau_de_bord"
		class="nav-top-item no-submenu"> Tableau de bord </a></li>

	<li><a href="#" class="nav-top-item"> Exemple Menu </a>
	<ul>
		<li><a href="<%=basePath%>exemplemenu/page_tablo">Page avec
		Tablo</a></li>
		<li><a href="<%=basePath%>exemplemenu/page_form">Page avec
		formulaire</a></li>
	</ul>
	</li>

	<li><a href="#" class="nav-top-item"> Produits </a>
	<ul>
		<li><a href="#" class="current">Sous menu 1</a></li>
		<li><a href="#">Sous menu 2</a></li>
		<li><a href="#">Sous menu 3</a></li>
	</ul>
	</li>

	<li><a href="#" class="nav-top-item current"> Ventes </a>
	<ul>
		<li><a href="vente_produits" class="current">Vendre produits</a></li>
		<li><a href="#">Consulter vente</a></li>
	</ul>
	</li>

	<li><a href="#" class="nav-top-item"> Commandes </a>
	<ul>
		<li><a href="#">Commande produits</a></li>
		<li><a href="#">Sous menu 2</a></li>
		<li><a href="#">Sous menu 3</a></li>
	</ul>
	</li>

	<li><a href="#" class="nav-top-item"> Clients </a>
	<ul>
		<li><a href="#">Sous menu 1</a></li>
		<li><a href="#">Sous menu 2</a></li>
		<li><a href="#">Sous menu 3</a></li>
	</ul>
	</li>

	<li><a href="#" class="nav-top-item"> Fournisseurs </a>
	<ul>
		<li><a href="#">Sous menu 1</a></li>
		<li><a href="#">Sous menu 2</a></li>
		<li><a href="#">Sous menu 3</a></li>
	</ul>
	</li>

	<li><a href="#" class="nav-top-item"> Gestion des utilisateurs
	</a>
	<ul>
		<li><a href="#">Sous menu 1</a></li>
		<li><a href="#">Sous menu 2</a></li>
		<li><a href="#">Sous menu 3</a></li>
	</ul>
	</li>

</ul>

</div>
</div>
<div id="main-content"><!-- Page Head -->
<h2>Commande - Creer une commande</h2>
<!-- Mettree une belle image ici 
 <div id="rechercher" align="left"></div>
<s:form method="post" id="idFormulaireRecherche"
	name="formulaireRecherche">
	<table cellpadding="0" cellspacing="0" id="idTableau" width="100%"
		border="0">
		<tr>
			<td><input name="searchProduit" id="searchProduit"
				style="width: 292px" type="text"
				onkeydown="searchProduits(this.value)"
				onkeyup="searchProduits(this.value)" /></td>
			<td style="width: 341px"> <s:textfield
				name="recherche" id="recherche" label="Recherche"
				labelposition="left" cssClass="input"/></td>
			<td><sx:autocompleter onclick=""/></td>
		</tr>
		<tr>
			<td style="width: 341px" style="background-color:#C0C0C0"><select
				name="typeRecherche" id="typeRecherche" size="6"
				style="width: 300px" onchange="" class="" /></td>
		</tr>
		<tr>
			<td style="width:100px">Nom du produit</td>
			<td style="width:100px">Code du produit</td>
			<td style="width:100px">Quantite</td>
			<td style="width:100px">Prix</td>
			<td style="width:100px">Fournisseur</td>
			<td style="width:100px">Delai du fournisseur</td>
		</tr>
		<tr>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
			<td align="center"><input type="button"
				value="Ajouter au panier" name="AjoutPanier" id="AjoutPanier"
				onclick="ajouterPanier()" /></td>
		</tr>
	</table>
</s:form>
<table border="0" id="tableau" cellpadding="0" cellspacing="0">
	<tr>
		<td>Nom du produit</td>
		<td>Code du produit</td>
		<td>Quantite</td>
		<td>Prix</td>
		<td>Fournisseur</td>
		<td>Delai du fournisseur</td>
	</tr>
	<s:iterator value="">
		<tr>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
			<td><s:property value="" /></td>
		</tr>
	</s:iterator>
	<tr>
		<a href=""></a>
	</tr>
</table>
-->
</div>

</body>
</html>