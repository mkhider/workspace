package fr.laposte.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.laposte.beans.Auteur;
import fr.laposte.forms.ConnectionForm;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name = request.getParameter("name");
		//request.setAttribute("name", name);
		//String[] noms = {"Mathieu","François", "Alain"};
		//request.setAttribute("noms",noms);
		//request.setAttribute("heure", "soir");
		//Auteur auteur = new Auteur();
		//auteur.setNom("khider");
		//auteur.setPrenom("mokhtar");
		//auteur.setActif(true);
		//request.setAttribute("auteur", auteur);
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
		//ConnectionForm form = new ConnectionForm();
		//form.verifierIdentifiants(request);
		//request.setAttribute("form", form);
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
	}

}
