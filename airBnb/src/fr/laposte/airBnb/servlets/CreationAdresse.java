package fr.laposte.airBnb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laposte.airBnb.dao.AdresseDao;


@WebServlet("/CreationAdresse")
public class CreationAdresse extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/creationAdresse.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1-récupérer les données saisies par l'utilisateur
		String rue = request.getParameter("rue");
		String ville = request.getParameter("ville");
		
		//enregistrer les données dans la base
		
		AdresseDao adresseDao = new AdresseDao();
		adresseDao.creerAdresse(rue, ville);
		
		// envoyer une reponse
		
		this.getServletContext().getRequestDispatcher("/adresEnregistree.jsp").forward(request, response);

		}

}
