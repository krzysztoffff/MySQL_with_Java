package a_Zadania.a_Dzien_2.c_Relacje_1_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
	
	// public String query1 = "";
	// public String query2 = "";
	// public String query3 = "";
	// public String query4 = ""; 

	public static void main(String[] args) {

		List<String> queries = createQueries();

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false",
					"root", "coderslab");
			for (String query : queries) {
				PreparedStatement ps = connection.prepareStatement(query);
				ResultSet rs = ps.executeQuery();
				System.out.println("\n\n" + query + ":\n");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " | " + rs.getInt(2) + " | " + rs.getDouble(3) + " | "
							+ rs.getInt(4) + " | " + rs.getString(5) + " | " + rs.getDate(6) + " | " + rs.getInt(6));
				}

				ps.close();
				rs.close();

			}
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<String> createQueries() {
		List<String> queries = new ArrayList<>();
		queries.add("SELECT * FROM tickets JOIN payments ON tickets.id=payments.id WHERE payments.type='cash';");
		queries.add("SELECT * FROM tickets JOIN payments ON tickets.id=payments.id WHERE payments.type='transfer';");
		queries.add("SELECT * FROM tickets JOIN payments ON tickets.id=payments.id WHERE payments.type='card';");
		queries.add("SELECT * FROM tickets JOIN payments ON tickets.id=payments.id WHERE payments.is_payment=0;");
		return queries;

	}
}
