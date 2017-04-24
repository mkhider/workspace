package fr.laposte.airBnb.dao;

import java.sql.SQLException;
import java.sql.Statement;

public class AdresseDao {
	public void creerAdresse(String rue,String ville) {
		
			try {
				ConnectionDao connect = new ConnectionDao();
				Statement st = connect.seConnecter();
				String maRequete ="INSERT INTO Adresse(rue,ville) VALUES('" + rue + "','" + ville + "');";
				st.executeUpdate(maRequete);
				st.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}


