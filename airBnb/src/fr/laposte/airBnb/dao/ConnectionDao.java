package fr.laposte.airBnb.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ConnectionDao {
	String url="jdbc:mysql://127.0.0.1:3306/airbnb";
	String login="root" ;
	String password="chatou";
	protected Connection cn = null;
	protected Statement st = null;
	
	public Statement seConnecter(){
	
	Statement st = null;
		
	try {
		//Etape 1: Chargement du driver
		Class.forName ("com.mysql.jdbc.Driver");
		// Etape 2: récupération de la connexion
		Connection cn = DriverManager.getConnection(url, login,password);
		//Etape 3: création d'un statement
		st = cn.createStatement();
	} catch (ClassNotFoundException  e) {
		e.printStackTrace();
	} catch (SQLException  e) {
		e.printStackTrace();
	}
	return st;
	}
}
