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

@WebServlet("/DeteteStaff")
public class DeteteStaff extends HttpServlet {
	PreparedStatement stmt = null;
	Connection con = null;
	Scanner sc = new Scanner(System.in);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String employeeid = request.getParameter("employeeid");

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

			// STEP 4 : Execute a query
			String sql = "Delete from employeedetails where employeeid =?";

			stmt = con.prepareStatement(sql);

			stmt.setString(1, employeeid);

			stmt.executeUpdate();

			RequestDispatcher rd = request.getRequestDispatcher("/StaffdetailsDisplay");
			rd.forward(request, response);
			// clean-up environment
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} // end of try..catch...finally block
	}//end of main method

}//end of class
