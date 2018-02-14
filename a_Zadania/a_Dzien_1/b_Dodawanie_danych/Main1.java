package a_Zadania.a_Dzien_1.b_Dodawanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

	// zapisz poniżej zapytania dodające rekordy do pierwszej tabeli
	public static String table1row1 = "INSERT INTO Clients (name, surname) VALUES('Adam','Nowak');";
	public static String table1row2 = "INSERT INTO Clients (name, surname) VALUES('Bernadetta','Kowal');";
	public static String table1row3 = "";
	public static String table1row4 = "";
	public static String table1row5 = "";

	// zapisz poniżej zapytania dodające rekordy do drugiej tabeli
	public static String table2row1 = "INSERT INTO Orders VALUES (default, 'bardzo wazne zamowienie');";
	public static String table2row2 = "INSERT INTO Orders VALUES (default, 'najwazniejsze wazne zamowienie');";
	public static String table2row3 = "";
	public static String table2row4 = "";
	public static String table2row5 = "";

	// zapisz poniżej zapytania dodające rekordy do trzeciej tabeli
	public static String table3row1 = "INSERT INTO Products VALUES(default, 'cookies', 'sweet', '10.60' );";
	public static String table3row2 = "INSERT INTO Products VALUES(default, 'potatoes', 'big', '1.60' );";
	public static String table3row3 = "INSERT INTO Products VALUES (default, 'sugar', 'big pack', '11.20');";
	public static String table3row4 = "";
	public static String table3row5 = "";

	public static void main(String[] args) {
		 insertStatement(); // wrzucanie ze stringa
//		insertPreparedStatement(); // wrzucanie przygotowanego zdania

	}

	public static void insertStatement() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_ex?useSSL=false",
					"root", "coderslab");
			Statement statement = conn.createStatement();
//			statement.executeUpdate(table1row2);
//			statement.executeUpdate(table1row2);
			statement.executeUpdate(table2row2);
//			statement.executeUpdate(table3row1);
//			statement.executeUpdate(table3row2);
//			System.out.println("dodano wiersze");
			statement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertPreparedStatement() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_ex?useSSL=false",
					"root", "coderslab");
			String sql = "INSERT INTO Products (name, description, price)" + "VALUES(?,?,?);";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
//			preparedStatement.setString(1, "Zelki");
//			preparedStatement.setString(2, "Zelki owocowe");
//			preparedStatement.setFloat(3, 2.59f);
//			preparedStatement.executeUpdate();
//			System.out.println("dodano wiersz");
//			preparedStatement.setString(2, "Zelki czekoladowe");
//			System.out.println("dodano drugi wiersz");
//			preparedStatement.executeUpdate();
			preparedStatement.setString(1, "Czekolada");
			preparedStatement.setString(2, "Bia�a");
			preparedStatement.setFloat(3, 8.48f);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
