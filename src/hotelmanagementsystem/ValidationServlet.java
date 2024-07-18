package hotelmanagementsystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String adminName = "jathin";
	String adminPass = "johny";
	private String empName = "";
	private String empPassword = "";
	Connection conn;
	PreparedStatement stmt;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// JDBC driver name and database URL

		final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

		// Database credentials
		final String USER = "hr";
		final String PASS = "pass";

		PrintWriter out = response.getWriter();

		String empNameAttS = request.getParameter("EmployeeName");
		String empPassAttS = request.getParameter("EmployeePass");

		if (empNameAttS.equals(adminName) && empPassAttS.equals(adminPass)) {
			RequestDispatcher rd = request.getRequestDispatcher("/Admin.jsp");
			rd.forward(request, response);
		} else {

			try {
				// STEP 1 : Register JDBC driver
				Class.forName("oracle.jdbc.driver.OracleDriver");

				// STEP 2 : Open a connection
				conn = DriverManager.getConnection(DB_URL, USER, PASS);

				// STEP 4 : Execute a query

				String sql;
				sql = "Select * FROM employeedetails where employeeName=?";
				stmt = conn.prepareStatement(sql);

				stmt.setString(1, empNameAttS);
				ResultSet rs = stmt.executeQuery();

				// Extract data from result set
				while (rs.next()) {
					empName = rs.getString(2);
					empPassword = rs.getString(3);

				} // end of while

				
				if (empName.equals(empNameAttS)) {
					if (empPassword.equals(empPassAttS)) {
						RequestDispatcher rd = request.getRequestDispatcher("/CustomerDetailsDisplay");
						rd.forward(request, response);

						// response.sendRedirect(request.getContextPath()+"/StaffdetailsDisplay.java");
					} else {
						String docType = "<!doctype html public \"-//wic//dtd html 4.0 transitional//en\">\n";

						out.println(docType + "<html>\n" + "<head><title>Error</title></head>\n"
								+ "<body bgcolor = \"#f0f0f0\">\n"
								+ "<h1 align = \"center\">Error!!  Invalid User Name Or Password </h1>\n");
					}
				} else {
					String docType = "<!doctype html public \"-//wic//dtd html 4.0 transitional//en\">\n";

					out.println(docType + "<html>\n" + "<head><title>Error</title></head>\n"
							+ "<body bgcolor = \"#f0f0f0\">\n"
							+ "<h1 align = \"center\">Error!!  Invalid User Name Or Password </h1>\n");

				} // end of outer if else

				// clean-up environment
				rs.close();
				stmt.close();
				conn.close();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} // end of try..catch...finally block

		}//end of if else..

	}//end of method

}//end of class
