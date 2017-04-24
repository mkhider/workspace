package fr.laposte.airBnb.dao;

import java.sql.SQLException;
import java.sql.Statement;

public class LogementDao {
	
	public void creerLogement(String description, String proprio, String adresse) {
		
		try {
			ConnectionDao connect = new ConnectionDao();
			Statement st = connect.seConnecter();
			String maRequete ="INSERT INTO Logement(descripstion) VALUES('" + description + "','"+ proprio +"','"+ adresse + "');";
			st.executeUpdate(maRequete);
			st.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
}



