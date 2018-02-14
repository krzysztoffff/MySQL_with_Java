package a_Zadania.a_Dzien_1.c_Pobieranie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main3 {
	// zapisz poniżej zapytania do bazy
	public String query1 = "SELECT * FROM Movies WHERE name LIKE 'M%';";
	public String query2 = "SELECT * FROM Tickets WHERE price>15.30;";
	public String query3 = "SELECT * FROM Tickets WHERE quantity>3;";
	public String query4 = "SELECT * FROM Movies WHERE rating > 6.5;";

	private final String connUrl = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false";
	private final String user = "root";
	private final String password = "coderslab";

	public static void main(String[] args) {

		Main3 m3 = new Main3();
		m3.showSelections();
	}

	public void showSelections() {

		try {
			Connection connection = DriverManager.getConnection(connUrl, user, password);
			PreparedStatement ps = connection.prepareStatement(this.query1);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("description")
						+ " | " + rs.getFloat("rating"));

			}
			System.out.println("\n");
			ps = connection.prepareStatement(this.query4);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("description")
						+ " | " + rs.getFloat("rating"));

			}
			
			System.out.println("\n");
			ps = connection.prepareStatement(this.query2);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getInt("quantity") + " | " + rs.getFloat("price"));

			}

			System.out.println("\n");
			ps = connection.prepareStatement(this.query3);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getInt("quantity") + " | " + rs.getFloat("price"));

			}

			ps.close();
			rs.close();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
