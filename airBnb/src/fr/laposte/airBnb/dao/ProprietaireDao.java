package fr.laposte.airBnb.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSet;

import fr.laposte.airBnb.bean.Proprietaire;

public class ProprietaireDao {
	public void creerProprietaire(String nom,String prenom){
	
	try {
		ConnectionDao connect = new ConnectionDao();
		Statement st = connect.seConnecter();
		String maRequete ="INSERT INTO proprietaire(nom,prenom) VALUES('" + nom + "','" + prenom + "');";
		st.executeUpdate(maRequete);
		st.close();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
	public ArrayList<Proprietaire> listerProprietaire(){
		ArrayList<Proprietaire> listeProprietaire = new ArrayList<Proprietaire>();
		
		try {
			ConnectionDao connect = new ConnectionDao();
			Statement st = connect.seConnecter();
			String maRequete ="SELECT * FROM proprietaire;";
			ResultSet resultat = (ResultSet) st.executeQuery(maRequete);
			while(resultat.next()) {
				Proprietaire proprio = new Proprietaire();
				proprio.setId(resultat.getInt(1));
				proprio.setNom(resultat.getString(2));
				proprio.setPrenom(resultat.getString(3));
				listeProprietaire.add(proprio);
			}
			st.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return listeProprietaire;
				
	}
}
