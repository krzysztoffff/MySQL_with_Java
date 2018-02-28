package a_Zadania.a_Dzien_2.d_Relacje_1_wiele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static String query1 = "SELECT * FROM Products JOIN Opinions ON " + "Products.id=Opinions.Products_id;";
	public static String query2 = "SELECT * FROM Products LEFT JOIN Opinions ON Products.id=Opinions.Products_id";
	public static String query3 = "SELECT * FROM Products LEFT JOIN Opinions ON Products.id=Opinions.Products_id WHERE Opinions.Products_id IS NULL";

	public static void main(String[] args) {

		List<String> queries = createQueries(); // create List from static method.

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_ex?useSSL=false",
					"root", "coderslab"); // get connection to databyse cinemas_ex
			for (String query : queries) {// iterate through the list
				PreparedStatement ps = connection.prepareStatement(query); // prepare statement from the list 'queries'
				ResultSet rs = ps.executeQuery(); // execute and save to result set value
				System.out.println("\n\n" + query + ":\n"); // show sql query in console
				while (rs.next()) { // check if there is more results
					// show result in console by getting indexes of colums instead oftheir names
					System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) 
							+ " | " + rs.getDouble(4) + " | "
							+ rs.getInt(5) + " | " + rs.getString(6) + " | " + rs.getInt(7));
					
				}
				// close prepare statement
				ps.close();
				// close result set
				rs.close();

			}
			// close connection
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static List<String> createQueries() {// create list of queries
		List<String> queries = new ArrayList<>();
		queries.add(query1);
		queries.add(query2);
		queries.add(query3);
		
		return queries;

	}

}
