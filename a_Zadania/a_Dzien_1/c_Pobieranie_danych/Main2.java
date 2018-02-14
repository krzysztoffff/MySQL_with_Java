package a_Zadania.a_Dzien_1.c_Pobieranie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {

	public static void main(String[] args) {//wyświetlamy filmy o ratingu większym niż średnia

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false", "root",
					"coderslab");
			String sql = "SELECT AVG(rating) AS avg FROM Movies;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				float avgRating = rs.getFloat("avg");

				sql = "SELECT id, name, description, rating FROM Movies WHERE rating > ?;";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setFloat(1, avgRating);
				ResultSet rs2 = ps.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String descr = rs.getString("description");
					float rating = rs.getFloat("price");
					System.out.println(id + " | " + name + " | " + descr + " | " + rating);
					if (descr.length() > 10) {
						descr = descr.substring(0, 10) + "...";
					}
				}
				rs2.close();
				ps.close();

			}

			preparedStatement.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
