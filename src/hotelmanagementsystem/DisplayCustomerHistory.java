package hotelmanagementsystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayCustomerHistory")
public class DisplayCustomerHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	// Database connection credentials
	static final String USER = "hr";
	static final String PASS = "pass";
	static Connection conn = null;
	static PreparedStatement stmt = null;
	static ResultSet rs = null;
	static Scanner sc = new Scanner(System.in);
	static int count;
	
	int phone;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "History of Customer   ";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0" + "transitonal//en\">\n";

		out.println(docType + "<html>\n" + "<head><title>" + title + "</title><style>" + "body{"
				+ "background-image:url(images/customer-banner.jpg);background-size: cover;}</style></head>\n"
				+ "<body>  <div  class=\"back\">\r\n" + "		<a href=\"Index.jsp\">\r\n"
				+ "    	<input  type =\"button\" value=\"Home\" style=\"background: rgb(81, 154, 224) ;width: 150px;border-radius: 10px;padding:10px;\">\r\n"
				+ "    	</a>\r\n" + "		<a href=\"login.jsp\">\r\n"
				+ "    	<input  type =\"button\" value=\"log out\" style=\"background: rgb(81, 154, 224) ;width: 150px;border-radius: 10px;padding:10px;\">\r\n"
				+ "    	</a>\r\n" + "</div>\n" + "<h1 align = \"center\">" + title + "</h1>\n"
				+ "<table width =\"100%\" border =\"1\" align =\"center\">\n" + "<tr bgcolor =\"#949494\">\n"
				+ "<th>Room Number</th><th>Customer Name</th><th>Email</th><th>Phone Number</th><th>Room type</th><th>Date Arrival</th><th>Number of Persons</th><th>Number of Days</th><th>Address</th>\n"
				+ "</tr>\n");

		try {
			Class.forName(JDBC_DRIVER);
			phone = Integer.parseInt(request.getParameter("phone"));

			// STEP 3: Open a connection
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String sql = "SELECT * FROM history where phone_number="+phone;
			stmt = conn.prepareStatement(sql);
			count = 0;
			rs = stmt.executeQuery();
			while (rs.next()) {
				count = 1;
				out.print("<tr bgcolor =\"white\"><td>" + rs.getInt(1) + "</td>\n");
				out.print("<td>" + rs.getString(2) + "</td>\n ");
				out.print("<td>" + rs.getString(3) + "</td>\n ");
				out.print("<td>" + rs.getString(4) + "</td>\n ");
				out.println("<td>" + rs.getString(5) + "</td>\n");
				out.println("<td>" + rs.getString(6) + "</td>\n");
				out.println("<td>" + rs.getInt(7) + "</td>\n");
				out.println("<td>" + rs.getInt(8) + "</td>\n");
				out.println("<td>" + rs.getString(9) + "</td>\n");
			}
			if (count == 0) {
				out.println("</table><h1 align=\"center\">NO customer HISTORY</h1>\n</body></html>");
			}
			out.println("</table>\n</body></html>");

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end try catch
		} // end finally
	}// end method
}//end of class