package a_Zadania.a_Dzien_2.c_Relacje_1_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
	// Change assumptions. Instead execute queries one by one. Execute them from
	// List<String>
	// public String query1 = "";
	// public String query2 = "";
	// public String query3 = "";
	// public String query4 = "";

	public static void main(String[] args) {

		List<String> queries = createQueries(); // create List from static method.

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false",
					"root", "coderslab"); // get connection to databyse cinemas_ex
			for (String query : queries) {// iterate through the list
				PreparedStatement ps = connection.prepareStatement(query); // prepare statement from the list 'queries'
				ResultSet rs = ps.executeQuery(); // execute and save to result set value
				System.out.println("\n\n" + query + ":\n"); // show sql query in console
				while (rs.next()) { // check if there is more results
					// show result in console by getting indexes of colums instead oftheir names
					System.out.println(rs.getInt(1) + " | " + rs.getInt(2) + " | " + rs.getDouble(3) + " | "
							+ rs.getInt(4) + " | " + rs.getString(5) + " | " + rs.getDate(6) + " | " + rs.getInt(6));
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
		queries.add("SELECT * FROM tickets JOIN payments ON tickets.id=payments.id WHERE payments.type='cash';");
		queries.add("SELECT * FROM tickets JOIN payments ON tickets.id=payments.id WHERE payments.type='transfer';");
		queries.add("SELECT * FROM tickets JOIN payments ON tickets.id=payments.id WHERE payments.type='card';");
		queries.add("SELECT * FROM tickets JOIN payments ON tickets.id=payments.id WHERE payments.is_payment=0;");
		return queries;

	}
}
