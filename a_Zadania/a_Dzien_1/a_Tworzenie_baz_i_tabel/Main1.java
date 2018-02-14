package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main1 {
	// Zapisz w poni¿szej zmiennej kod zapytania SQL
	public String query = "CREATE DATABASE products_ex";

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", "root", "coderslab");
			System.out.println("Po³¹czenie ustanowione");

			
			
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
