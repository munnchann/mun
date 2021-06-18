/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Mun Chan
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection openConnection()  throws Exception {		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bookstore?useSSL=false";
			String user="root";
			String password="";
			Connection con=(Connection) DriverManager.getConnection(url, user, password);
			return con;		
	}

}
