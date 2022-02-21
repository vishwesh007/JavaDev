package com.infy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

/*Both the tables should be created and should exists in the database*/
public class TransactionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = null;
		PreparedStatement preStmt = null;
	
		try {

			Class.forName("org.hsqldb.jdbcDriver");

			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", "SA", "");

			// Assume a valid connection object conn
			
			conn.setAutoCommit(false);
			preStmt = conn.prepareStatement("insert into faculty values(?,?)");
			preStmt.setInt(1, 1015);
			preStmt.setString(2, "Jammy");
			int facultyRows = preStmt.executeUpdate();
			if (facultyRows > 0) {
				System.out.println("Faculty details inserted");
			}

			preStmt = conn.prepareStatement("insert into course values(?,?)");
			preStmt.setInt(1, 1100);
			preStmt.setString(2, "Spring");
			int courseRows = preStmt.executeUpdate();
			if (courseRows > 0) {
				System.out.println("course details inserted");
			}
			// Only if both the above insert operations are successful, changes must be made
			// permanent in the database
			conn.commit();
			System.out.println("Rows inserted into the database");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.print("Exception Occured");
			e.printStackTrace();
			conn.rollback();

		} finally {

			preStmt.close();
			conn.close();
		}

	}

}
