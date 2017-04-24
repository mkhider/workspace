package fr.laposte.airBnb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laposte.airBnb.dao.AdresseDao;
import fr.laposte.airBnb.dao.LogementDao;

/**
 * Servlet implementation class CreationLogement
 */
@WebServlet("/CreationLogement")
public class CreationLogement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/creationLogement.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1-récupérer les données saisies par l'utilisateur
		String description = request.getParameter("description");
		String proprio = request.getParameter("proprio");
		String adresse = request.getParameter("adresse");

		
		
		
		//enregistrer les données dans la base
		
		LogementDao logementDao = new LogementDao();
		logementDao.creerLogement(description, proprio,adresse);
		
		// envoyer une reponse
		
		//this.getServletContext().getRequestDispatcher("/adresEnregistree.jsp").forward(request, response);

		}

}
