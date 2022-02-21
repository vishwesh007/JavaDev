package com.infy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step1 load the driver
		Class.forName("org.hsqldb.jdbcDriver");
		
		//String sql = "create table faculty(facultyid int PRIMARY KEY, facultyname varchar(50))";
		//String sql1 = "insert into faculty values(1003,'Nick')";
		//String sql2 = "select *from faculty";
		//Step2 connect to the database
		try (Connection conn = DriverManager
				.getConnection("jdbc:hsqldb:hsql://localhost/", "SA", "");
			//Statement stmt = conn.createStatement();
			PreparedStatement preStmt = conn.prepareStatement("select * from faculty where facultyid=?");
			){
            //Step3 send sql statements to the database
			//stmt.execute(sql);
			//System.out.println("Created table in given database...");
            //preStmt.executeUpdate();
			//System.out.println("Inserted values in the table");
			
			preStmt.setInt(1, 1001);	
        //Step4 process the results
		try (ResultSet rsFaculty = preStmt.executeQuery(); 
				){
			
			while(rsFaculty.next()) {
				System.out.println("Id : " + rsFaculty.getInt(1) + "  " +
						"Name: " + rsFaculty.getString(2));
				rsFaculty.updateString(2,"martin");
				rsFaculty.updateRow();
				System.out.println("updated");
				
			}
			/*
			preStmt = conn.prepareStatement("select * from faculty where facultyid=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// This will return a ResultSet object that is scroll-sensitive and allow
			// concurrent modifications
			
			preStmt.setInt(1, 1002);  //facultyid=1002

			rsFaculty = preStmt.executeQuery();
			 
			   while (rsFaculty.next()) {
					System.out.println("Id : " + rsFaculty.getInt("facultyid") + ", Name : " + rsFaculty.getString("facultyname"));
			    
					rsFaculty.updateString(2,"Jackson");
					rsFaculty.updateRow();
				System.out.println("updated the faculty name in table");
			}*/
           /*
           //inserting values using injection attack
		   preStmt = conn.prepareStatement("insert into faculty values(?,?)",
					ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		   
		   preStmt.setInt(1, 1004);
		   preStmt.setString(2, "Nick");
		   
		   int rows = preStmt.executeUpdate();
		   if(rows>0) {
		   System.out.println("Rows inserted into the database");*/
			
		}
		
		}
	}

}
