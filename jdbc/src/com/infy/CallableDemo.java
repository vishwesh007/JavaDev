package com.infy;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* CREATE PROCEDURE regFaculty(IN fac_id BIGINT, OUT fac_name VARCHAR(50))
READS SQL DATA
BEGIN ATOMIC
  SELECT facultyName INTO fac_name from faculty where facultyId=fac_id;
END;*/


public class CallableDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("org.hsqldb.jdbcDriver");
		try (Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", "SA", "");
				CallableStatement callStmt = conn.prepareCall("{call regFaculty(?,?)}");){
				
			//set the faculty id parameter
			callStmt.setInt(1, 1007);
			//Register the out parameter
			callStmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			callStmt.execute();
			//Get the out parameter value
			String outRet = callStmt.getString(2);
			System.out.println("Faculty Name :" +outRet);
			
		}

	}
}