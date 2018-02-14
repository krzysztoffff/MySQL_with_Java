package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Main1 {

	public static void main(String[] args) {// wyświetlamy filmy o ratingu
											// większym niż średnia

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false", "root",
					"coderslab");
			String sql = "SELECT id, name FROM Movies;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();

			
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					System.out.println(id + " | " + name);

				}
				rs.close();
				preparedStatement.close();
				System.out.println("podaj do usuniecia");
				Scanner sc = new Scanner(System.in);
				int id = sc.nextInt();
				sc.close();
				sql = "DELETE FROM Movies WHERE id=?;";
				preparedStatement = conn.prepareStatement(sql);
				preparedStatement.setInt(1, id);
				preparedStatement.executeUpdate();
				preparedStatement.close();
				System.out.println("Usunieto film o id = " + id);
				conn.close();
				rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
