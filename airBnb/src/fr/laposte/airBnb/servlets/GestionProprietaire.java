package fr.laposte.airBnb.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laposte.airBnb.bean.Proprietaire;
import fr.laposte.airBnb.dao.ProprietaireDao;

/**
 * Servlet implementation class GestionProprietaire
 */
@WebServlet("/GestionProprietaire")
public class GestionProprietaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionProprietaire() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProprietaireDao proprietaire = new ProprietaireDao();
		ArrayList<Proprietaire> listeProprietaire = new ArrayList<Proprietaire>();
		
		listeProprietaire = proprietaire.listerProprietaire();
		request.setAttribute("listeProprietaire", listeProprietaire);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/creationProprietaire.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProprietaireDao proprietaire = new ProprietaireDao();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		ArrayList<Proprietaire> listeProprietaire = new ArrayList<Proprietaire>();
		proprietaire.creerProprietaire(nom, prenom);	
		listeProprietaire = proprietaire.listerProprietaire();
		request.setAttribute("listeProprietaire", listeProprietaire);
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/creationProprietaire.jsp").forward(request, response);

	}

}
