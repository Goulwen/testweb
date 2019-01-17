<%@page import="java.util.Date"%>
<%!private String nom;
	private String prenom;%>
<html>
<head>
<title>Page de test</title>
</head>
<body>
	<h1>Bonjour tout le monde</h1>
	Nous sommes le
	<%=new Date().toString()%>
	et c'est bientot la pause.
</body>
</html>