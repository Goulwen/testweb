<%@ page import="testweb.domaine.Personne,java.util.List" %>

<html>

<body>
<h1>Voici la liste des personnes</h1>
<ol>
<% 
	List<Personne> listePersonnes = (List<Personne>) request.getAttribute("listePersonnes");
	for(Personne personne: listePersonnes) {
		%>
			<li><%= personne.getNom() %> - <%= personne.getPrenom() %> </li>
		<% 	
	}
%>
</ol>
</body>

</html>