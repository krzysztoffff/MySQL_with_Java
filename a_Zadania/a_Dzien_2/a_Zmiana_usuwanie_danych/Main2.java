package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {// wyświetlamy filmy o ratingu
		// większym niż średnia

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false", "root",
					"coderslab");
			String sql = "SELECT * FROM Tickets;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String quantity = rs.getString("quantity");
				String price = rs.getString("price");
				System.out.println(id + " | " + quantity + " | "+price);

			}
			rs.close();
			
			preparedStatement.close();
			Scanner scan = new Scanner(System.in);
			System.out.println("podajid biletu");
			int userId = scan.nextInt();
			scan.close();
			sql = "UPDATE Tickets SET quantity=quantity+1 WHERE id=?;";
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, userId);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			System.out.println("dodano bilet");
			conn.close();
			


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
