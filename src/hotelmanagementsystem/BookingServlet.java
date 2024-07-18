package hotelmanagementsystem;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {

	String cus_Name = ""; // variable to store the customer name entered in browser
	String email = ""; // variable to store the customer email entered in browser
	String phone_number = ""; // variable to store the customer phone number entered in browser
	String Room_Type = ""; // variable to store the room type entered in browser
	String Date_arrival = ""; // variable to store the date of arrival entered in browser
	int number_Of_Persons; // variable to store the number of persons entered in browser
	int number_Of_Days; // variable to store the number of days entered in browser
	String address = ""; // variable to store the customer address entered in browser	

	PreparedStatement stmt = null;
	Connection con = null;

	Scanner sc = new Scanner(System.in);

	private static final long serialVersionUID = 1L;

	public BookingServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			cus_Name = request.getParameter("name");
			email = request.getParameter("email");
			phone_number = request.getParameter("phone");
			Room_Type = request.getParameter("type");
			Date_arrival = request.getParameter("arrivaldate");
			number_Of_Persons = Integer.parseInt(request.getParameter("persons"));
			number_Of_Days = Integer.parseInt(request.getParameter("days"));
			address = request.getParameter("address");

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
			String sql = "UPDATE booking Set cus_name=?,email=?,phone_number=?,date_arrival=?,number_Of_Persons=?,number_Of_Days=?,address=? where room_number = ( select min(room_number) from booking where cus_Name is null and room_type =?)";
			
			stmt = con.prepareStatement(sql);

			stmt.setString(1, cus_Name);
			stmt.setString(2, email);
			stmt.setString(3, phone_number);
			stmt.setString(4, Date_arrival);
			stmt.setInt(5, number_Of_Persons);
			stmt.setInt(6, number_Of_Days);
			stmt.setString(7, address);
			stmt.setString(8, Room_Type);

			stmt.executeUpdate();

			System.out.println("Updated");
			
			System.out.println(cus_Name);
			System.out.println(email);
			System.out.println(phone_number);
			System.out.println(Room_Type);
			System.out.println(Date_arrival);
			System.out.println(number_Of_Persons);
			System.out.println(number_Of_Days);
			System.out.println(address);
			
			RequestDispatcher rd = request.getRequestDispatcher("/submitsuccessful.jsp");
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