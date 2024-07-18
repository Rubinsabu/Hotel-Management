package hotelmanagementsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteCustomer")
public class DeleteCustomer extends HttpServlet {
	Statement stmt = null;
	Connection con = null;
	Scanner sc = new Scanner(System.in);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String room_number = request.getParameter("room_number");

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

			stmt = con.createStatement();
			String sql = "UPDATE booking Set cus_name=null,email=null,phone_number=null,date_arrival=null,number_of_persons=0,number_of_days=0,address=null where room_number ="
					+ room_number;
			stmt.executeUpdate(sql);

			RequestDispatcher rd = request.getRequestDispatcher("/CustomerDetailsDisplay");
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
