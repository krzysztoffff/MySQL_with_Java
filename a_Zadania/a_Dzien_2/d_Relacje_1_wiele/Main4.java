package a_Zadania.a_Dzien_2.d_Relacje_1_wiele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main4 {
	public static String query1 = "SELECT Categories.name, Categories_sub.name FROM categories JOIN categories_sub ON Categories.id=Categories_sub.Categories_id WHERE Categories.id=1;";
	public static String query2 = "SELECT DISTINCT Categories.id, Categories.name FROM Categories JOIN Categories_sub ON Categories.id=Categories_sub.Categories_id;";

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_ex?useSSL=false",
					"root", "coderslab");
			PreparedStatement ps = connection.prepareStatement(query1);
			ResultSet rs = ps.executeQuery();
			System.out.println(query1);
			while (rs.next()) {
				System.out.println(rs.getString(1) + " | " + rs.getString(2));
			}
			ps = connection.prepareStatement(query2);
			rs = ps.executeQuery();
			System.out.println(query2);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " | " + rs.getString(2));
			}

			ps.close();
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
