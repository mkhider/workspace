<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="fr.laposte.airBnb.bean.Proprietaire" %>
<%@ page import="java.util.Iterator" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creation proprietaire</title>
</head>
<body>
<jsp:useBean id="proprietaire" class="fr.laposte.airBnb.bean.Proprietaire" scope="request" />
        <jsp:useBean id="listeProprietaire" class="java.util.ArrayList" scope="request" />
<form method ="post">
Nom <input type="text" name="nom"/>
Prenom <input type="text" name="prenom"/>
<input type="submit" value="s'inscrire"/> 

</form>
<table>
<tr>
<th>id</th>
<th>Nom</th>
<th>Prenom</th>
</tr>
<%
   for (Iterator<Proprietaire> it = listeProprietaire.iterator(); it.hasNext();) {
                   Proprietaire prop = it.next();
           %>        
                       <tr>                                        
                           <td><%=prop.getId()%></td>
                           <td><%=prop.getNom()%></td>
                           <td><%=prop.getPrenom()%></td>
                       </tr>
           <%
               }
           %>
</table>

</body>
</html>