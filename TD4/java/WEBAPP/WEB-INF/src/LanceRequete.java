import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
import java.io.*;

//select * from titreresume limit 10;
//Je veux les articles possedant le terme juge.

public class LanceRequete extends HttpServlet {
	String username;
	String password;
	String url;
	String requete ="";
	String nom;
	int nbre;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' type='text/css' href='../../WEBAPP/design.css'>");
        out.println("<title>Lance requete!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='results'>");

	// ---- configure START
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
   //     url = "jdbc:postgresql://tuxa/dblo17";
		  url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	// ---- configure END

	String requete_nl;
	requete_nl = request.getParameter("requete");
	if (requete_nl != null) {
		// INSTALL/load the Driver (Vendor specific Code)
		TalMain3 grammaire = new TalMain3(requete_nl);
		requete = grammaire.getArbre();
		String normalisation = grammaire.getNormalisation();
		String lemmatisation = grammaire.getLemmatisation();
		
        out.println("<div class='info'>");
		if (requete.length() < 3) {
	        out.println("<span class='error'> La requete a retournee 0 resultat </span>");
		}
		
		out.println("<table id='info-table'><tr><td class='table-th'>Requete NL:</td><td>"+requete_nl+"</td></tr>");
		out.println("<tr><td class='table-th'>Normalisation: </td><td>"+normalisation+"</td></tr>");
		out.println("<tr><td class='table-th'>Lemmatisation: </td><td>"+lemmatisation+"</td></tr>");
		out.println("<tr><td class='table-th'>Requete SQL: </td><td>"+requete+"</td></tr></table>");
        out.println("</div>");
		
		try {
			Class.forName("org.postgresql.Driver");
			} catch(java.lang.ClassNotFoundException e) {
	    		System.err.print("ClassNotFoundException: ");
	    		System.err.println(e.getMessage());
			}
		try {
			Connection con;
			Statement stmt;
			// Establish Connection to the database at URL with usename and password
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			// Send the query and bind to the result set
			ResultSet rs = stmt.executeQuery(requete);
			ResultSetMetaData rsmd=rs.getMetaData();
			nbre=rsmd.getColumnCount();
			
			int rowcount = 0;
			if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
			
	        out.println("<div class='info'>");
		    out.println("<span class='no-error'> La requete a retournee "+rowcount+" resultats</span>");
	        out.println("</div>");
	        
			while (rs.next()) {
				for (int i=1; i<=nbre;i++){
					nom = rsmd.getColumnName(i);
					String s = rs.getString(nom);
										
					//document.getElementById(\'webview\').src
					out.print("<div class='div-link'><a class='link' href='../../WEBAPP/LCI/"+s+"'>"+s+"</a></div>");
					//out.print("<div class='div-link'><a class='link' onclick='changeView('"+s+"')';' >"+s+"</a></div>");
				}
			}
	    out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		// Close resources
		stmt.close();
		con.close();
		}
		// print out decent erreur messages
		catch(SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage ());
				System.out.println("SQLState:  " + ex.getSQLState ());
				System.out.println("ErrorCode: " + ex.getErrorCode ());
				ex = ex.getNextException();
				System.out.println("");
	    	}
		}
        }
	} 
}
