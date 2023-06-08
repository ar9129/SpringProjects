package main;
import java.sql.*;

public class JDBC_test_Class {

	public static void main(String[] args) {
		Connection myConn = null;
		Statement myStmt= null;
		ResultSet myRes= null;
		
		try {
			myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "student", "student");
			System.out.println("Database connection successful \n");
			
			myStmt= myConn.createStatement();
			
			
//			int rowsAffected= myStmt.executeUpdate(
//					"insert into empdetails "+" values "+ "(8, 'Bhaalu', 41, 'Doctor', 'State')"
//					);
//	
			
//			int rowsAffected= myStmt.executeUpdate(
//			"update empdetails set emp_name='Mannnnish', emp_age=24, emp_designation='Er', emp_state='WB' where emp_id=1"
//			);
			
			int rowsAffected= myStmt.executeUpdate(
			 "delete from empdetails where emp_id=4"
			);
			

			myRes = myStmt.executeQuery("select * from empdetails");
			
			while(myRes.next()) {
				System.out.println(myRes.getString("emp_name") + "," + myRes.getString("emp_age") + "," + myRes.getString("emp_designation"));
			}			
			
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
		finally {
			
		}
		

	}

}
