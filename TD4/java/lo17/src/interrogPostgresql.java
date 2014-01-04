import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class interrogPostgresql  {
	public static void main(String args[]) throws SQLException {

	String username;
	String password;
	String url;
	String nom;
	int nbre;
	
	//Je veux les articles possedant le terme juge.
	
	// ---- configure START
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
	// Syntax: jdbc:TYPE:machine:port/DB_NAME
	url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	//username = "Romain";
	//password = "";
	//url = "jdbc:postgresql://localhost:5432/lo17";
		
	String requete;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Google: ");
	String ss = "";
	ss = scanner.nextLine();
	TalMain3 grammaire = new TalMain3(ss);
	requete = grammaire.getArbre();
	
	//requete = "(  select distinct article from titreresume  where  (    ( mot LIKE '%possedant%'  ) AND    ( mot LIKE '%juge%'  ) ) )";
	//requete="select distinct page,rubrique from titre where mot='pape';";
	
	// INSTALL/load the Driver (Vendor specific Code)
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
		stmt = con.createStatement();
		 // Send the query and bind to the result set
		ResultSet rs = stmt.executeQuery(requete);
		
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		ResultSetMetaData metaData = rs.getMetaData();
		int columnCount = metaData.getColumnCount();

		while (rs.next()) {
		    Map<String, Object> columns = new LinkedHashMap<String, Object>();

		    for (int i = 1; i <= columnCount; i++) {
		        columns.put(metaData.getColumnLabel(i), rs.getObject(i));
		        System.out.print(rs.getObject(i)+"\t");
		    }
		    System.out.println();
		    rows.add(columns);
		}
		
		
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
