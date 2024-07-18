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

@WebServlet("/CustomerHistory")
public class UpdateCustomerHistory extends HttpServlet {

	String cus_Name = "";
	String email = "";
	String phone_number = "";
	String Room_Type = "";
	String Date_arrival = "";
	int number_Of_Persons;
	int number_Of_Days;
	String address = "";

	Statement stmt = null;
	PreparedStatement stmt1 = null;
	Connection con = null;
	Scanner sc = new Scanner(System.in);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int room_number = Integer.parseInt(request.getParameter("room_number"));

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
			String sql = "select * from booking where room_number =" + room_number;
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// Retrive by column name

				cus_Name = rs.getString("cus_name");
				email = rs.getString("email");
				phone_number = rs.getString("phone_number");
				Room_Type = rs.getString("Room_Type");
				Date_arrival = rs.getString("date_arrival");
				number_Of_Persons = rs.getInt("number_of_persons");
				number_Of_Days = rs.getInt("number_of_days");
				address = rs.getString("address");

				

			}//end of while
			String sql1 = "INSERT INTO history VALUES (?,?,?,?,?,?,?,?,?)";
			stmt1 = con.prepareStatement(sql1);

			stmt1.setInt(1, room_number);
			stmt1.setString(2, cus_Name);
			stmt1.setString(3, email);
			stmt1.setString(4, phone_number);
			stmt1.setString(5, Room_Type);
			stmt1.setString(6, Date_arrival);
			stmt1.setInt(7, number_Of_Persons);
			stmt1.setInt(8, number_Of_Days);
			stmt1.setString(9, address);

			stmt1.executeUpdate();
			RequestDispatcher rd = request.getRequestDispatcher("/DeleteCustomer");
			rd.forward(request, response);
			// clean-up environment
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} // end of try..catch...finally block
	}//end of method

}//end of class
