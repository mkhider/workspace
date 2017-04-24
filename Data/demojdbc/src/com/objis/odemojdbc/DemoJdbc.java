package com.objis.odemojdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DemoJdbc {

	public static void main(String[] args) {
	DemoJdbc test = new DemoJdbc();
	test.seConnecterBase();
		
	}

	public static void seConnecterBase(){
		String url="jdbc:mysql://127.0.0.1:3306/airbnb";
		String login="root" ;
		String password="chatou";
		Connection cn = null;
		Statement st = null;
		try{
			//Etape 1: Chargement du driver
			Class.forName ("com.mysql.jdbc.Driver");
			// Etape 2: r�cup�ration de la connexion
			cn = (Connection) DriverManager.getConnection(url, login,password);
			//Etape 3: cr�ation d'un statement
			st = (Statement) cn.createStatement();
//			String sql ="insert into 'proprietaire' ('nom','prenom') values ('khider','mokhtar')";
			//Etape 4: execution de la requ�te
			st.executeUpdate("insert into proprietaire (nom,prenom) values ('khider','mokhtar')");
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(" les valeurs n'ont pas ete inserees");
			
		}catch (ClassNotFoundException e){
			System.out.println(" �a ne marche pas");
		}finally{
			try {
				//Etape 6: lib�rer ressources m�moire
				cn.close();
				st.close();
				System.out.println("l'insertion s'est bien pass�e");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	
		
	}
}
