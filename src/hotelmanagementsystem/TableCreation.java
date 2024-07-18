package hotelmanagementsystem;

import java.sql.*;
import java.util.Scanner;

public class TableCreation {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	// Database connection credentials
	static final String USER = "hr";
	static final String PASS = "pass";

	// Start of main method

	public static void main(String[] args) {
		Statement stmt = null;
		Connection con = null;
		Scanner sc = new Scanner(System.in);

		try {
			// STEP 1 : Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2 : Open a connection
			System.out.println("Connecting to a selected database...");
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4 : Execute a query
			System.out.println("Creating statement...");
			stmt = con.createStatement();

			// create all tables if not created

			try {

				stmt.execute(
						"Create table employeedetails (employeeId number(10) constraint empId_pk_const primary key,"
								+ "employeeName varchar2(25) constraint empName_nn_const Not Null,"
								+ " password varchar2(20) constraint pass_nn_const Not Null,"
								+ " empType varchar2(20) constraint employeeType_nn_const Not Null,"
								+ "salary number(10) constraint sal_const Not Null)");

				stmt.execute("create table history(room_number number(10) ," + "cus_Name varchar2(40) ,"
						+ "email varchar2(50) ," + "phone_number varchar2(15) ," + "Room_Type varchar2(30) ,"
						+ "Date_arrival varchar2(20) ," + "number_Of_Persons number(10) ,"
						+ " number_Of_Days  number(10) ," + " address  varchar2(60) )");

				Boolean res = stmt.execute("create table Booking(room_number number(10) constraint roomno_co1 not null,"
						+ "cus_Name varchar2(40) ," + "email varchar2(50) ," + "phone_number varchar2(15) ,"
						+ "Room_Type varchar2(30) constraint Room_Type_co1 not null," + "Date_arrival varchar2(20) ,"
						+ "number_Of_Persons number(10) ," + " number_Of_Days  number(10) ,"
						+ " address  varchar2(60) )");
				if (!res) {
					System.out.println("All Tables created...");
				} else {
					System.out.println("Not able to create table...");
				}
			} catch (SQLSyntaxErrorException e) {
				System.out.println("All Tables are already created");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				} // end of if
			} catch (SQLException se) {
				se.printStackTrace();
			} // end of try..catch block

			try {
				if (con != null) {
					con.close();
				} // end of if
			} catch (SQLException se) {
				se.printStackTrace();
			} // end of try..catch block
			sc.close();
		} // end of try..catch...finally block

	}// end of main method

}// end of class
