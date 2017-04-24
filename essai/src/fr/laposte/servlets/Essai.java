package fr.laposte.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laposte.bdd.Noms;
import fr.laposte.essai.Utilisateur;

/**
 * Servlet implementation class Essai
 */
@WebServlet("/Essai")
public class Essai extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
       
    public Essai() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Noms tableNoms = new Noms();
        request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(request.getParameter("nom"));
        utilisateur.setPrenom(request.getParameter("prenom"));
        
        Noms tableNoms = new Noms();
        tableNoms.ajouterUtilisateur(utilisateur);
        
        request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }
    
    

}