package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main5 {
	
	public static String url = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false";
	public static String user = "root";
	public static String password = "coderslab";

	public static void main(String[] args) {

		showCinemas();
		System.out.println("\nWpisz e aby edytować, u aby usunąć wybrane kino.\nWpisz x aby wyjść z programu.");
		editCinemas(4);
	}

	public static void showCinemas() {

		try {
			Connection connetion = DriverManager.getConnection(url,
					user, password);
			PreparedStatement ps = connetion.prepareStatement("SELECT * FROM CINEMAS;");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("address"));
			}

			// TODO Rest of the functionalities

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void editCinemas(int id) {
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = connection.prepareStatement("SELECT name, address FROM cinemas WHERE id = ?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("\nEdytujesz:\n" + rs.getString("name") + " | " + rs.getString("address"));
			}
			Scanner scan = new Scanner
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
