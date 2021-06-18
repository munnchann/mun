/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mun Chan
 */

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import model.book;

public class modify {
 public static List<book> findAll(){
	 List<book> bookList= new ArrayList<>();
	 Connection connection = null;
	 Statement statement= null;
 try {
	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");	 
	 String sql= "select * from book";
	 statement = connection.createStatement();
	 ResultSet resultSet= statement.executeQuery(sql);
	 while (resultSet.next()) {
		 book bo = new book(resultSet.getInt("id"),
				 resultSet.getString("name_book"),
				 
				 resultSet.getFloat("price"),
				 resultSet.getInt("amount"));
		 bookList.add(bo);
	 }
 }catch (SQLException ex) {
	 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
 }finally {
	 if(statement!= null) {
		 try {
			 statement.close();
		 }catch (SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
	 if(connection !=null) {
		 try {
			 connection.close();
		 }catch(SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
}
 return bookList;
}
 public static void insert(book bo) {
	 Connection connection = null;
	 PreparedStatement statement= null;
 try {
	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");	 
	 String sql= "insert into book(name_book,price,amount) values(?,?,?)";
	 statement = connection.prepareCall(sql);
	 statement.setString(1, bo.getName_book());
	 //statement.setInt(2, bo.getAuthor_id());
	 statement.setFloat(2, bo.getPrice());
	 statement.setInt(3, bo.getAmount());
	 //statement.setInt(5, bo.getCate_id());
	 
	 statement.execute();
 }catch (SQLException ex) {
	 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
 }finally {
	 if(statement!= null) {
		 try {
			 statement.close();
		 }catch (SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
	 if(connection !=null) {
		 try {
			 connection.close();
		 }catch(SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
}
 }
 
 public static void update(book bo) {
	 Connection connection = null;
	 PreparedStatement statement= null;
 try {
	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");	 
	 String sql= "update book set name_book=?,price=?,amount=?" +"where id=?";
	 statement = connection.prepareCall(sql);
	 statement.setInt(1, bo.getId());
	 statement.setString(2, bo.getName_book());
	 
	 statement.setFloat(3, bo.getPrice());
	 statement.setInt(4, bo.getAmount());
	 
	 
	 statement.execute();
 }catch (SQLException ex) {
	 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
 }finally {
	 if(statement!= null) {
		 try {
			 statement.close();
		 }catch (SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
	 if(connection !=null) {
		 try {
			 connection.close();
		 }catch(SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
}
 }
 
 public static void delete(int id) {
	 Connection connection = null;
	 PreparedStatement statement= null;
 try {
	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");	 
	 String sql= "delete from book where id=?";
	 statement = connection.prepareCall(sql);
	 statement.setInt(1, id);

	 statement.execute();
 }catch (SQLException ex) {
	 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
 }finally {
	 if(statement!= null) {
		 try {
			 statement.close();
		 }catch (SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
	 if(connection !=null) {
		 try {
			 connection.close();
		 }catch(SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
}
 }
 public static List<book> findByName_Book(String name_book){
	 List<book> bookList= new ArrayList<>();
	 Connection connection = null;
	 PreparedStatement statement= null;
 try {
	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");	 
	 String sql= "select * from book where name_book like?";
	 statement = connection.prepareCall(sql);
         statement.setString(1,"%"+name_book+"%");
	 ResultSet resultSet= statement.executeQuery();
	 while (resultSet.next()) {
		 book bo = new book(resultSet.getInt("id"),
				 resultSet.getString("name_book"),
				 
				 resultSet.getFloat("price"),
				 resultSet.getInt("amount"));
		 bookList.add(bo);
	 }
 }catch (SQLException ex) {
	 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
 }finally {
	 if(statement!= null) {
		 try {
			 statement.close();
		 }catch (SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
	 if(connection !=null) {
		 try {
			 connection.close();
		 }catch(SQLException ex) {
			 Logger.getLogger(modify.class.getName()).log(Level.SEVERE,null,ex);
		 }
	 }
}
 return bookList;
}
}
