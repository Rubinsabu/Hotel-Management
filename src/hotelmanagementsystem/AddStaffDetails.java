package hotelmanagementsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddStaffDetails")
public class AddStaffDetails extends HttpServlet {
	
	int employeeid; // variable to store the employeeid entered in browser
	String employeename = ""; // variable to store the employeename entered in browser
	String password = ""; // variable to store the password entered in browser
	String emptype = ""; // variable to store the emptype entered in browser
	int salary = 0; // variable to store the salary entered in browser

	PreparedStatement stmt = null;
	Connection con = null;
	
	Scanner sc = new Scanner(System.in);
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			employeeid = Integer.parseInt(request.getParameter("employeeid"));
			employeename = request.getParameter("employeename");
			password = request.getParameter("password");
			emptype = request.getParameter("emptype");
			salary = Integer.parseInt(request.getParameter("salary"));

			// JDBC driver name and database URL
			final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

			// Database credentials
			final String USER = "hr";
			final String PASS = "pass";

			// Set response content type
			response.setContentType("text/html");

			// STEP 1 : Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// STEP 2 : Open a connection
			con = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 3 : Execute a query
			String sql = "insert into employeedetails values(?, ?, ?, ?,?)";

			stmt = con.prepareStatement(sql);

			stmt.setInt(1, employeeid);
			stmt.setString(2, employeename);
			stmt.setString(3, password);
			stmt.setString(4, emptype);
			stmt.setInt(5, salary);

			stmt.executeUpdate();

			RequestDispatcher rd = request.getRequestDispatcher("/StaffdetailsDisplay");
			rd.forward(request, response);

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

		} // end of try..catch...finally block
		
	} // end of doPost method

} // end of class