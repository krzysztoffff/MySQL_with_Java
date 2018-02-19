package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main5 {

	public static String url = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false";
	public static String user = "root";
	public static String password = "coderslab";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		/*
		When a Scanner is closed, it will close 
		its input source if the source implements the Closeable interface.
		So, now when you re-instantiate, Scanner in second method, 
		it doesn't find any open System.in stream and hence the exception.
		Solution: I use scanner in main method and close it in the end.
		*/
		String whatToDo;
		do {
			whatToDo = "";
			System.out.println("Lista kin:\n");
			showCinemas();
			try {
				TimeUnit.SECONDS.sleep(2);// Odczekać 2 sekundy żeby Scanner zadziałał poprawnie. Metoda prób i błędów.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			whatToDo = askQuestions();

			if (whatToDo.equals("e")) {
				System.out.println("edytuję");
				continue;
			} else if (whatToDo.equals("u")) {
				System.out.println("usuwam");
				continue;
			}

		} while (!whatToDo.equals("x"));
		// editCinemas(4);
	}

//	public static String askQuestions() {
//		System.out.println("\nWpisz e aby edytować, u aby usunąć wybrane kino.\nWpisz x aby wyjść z programu.");
//		Scanner scan = new Scanner(System.in);
//		String whatToDo = scan.next();
////		scan.close();
//
//		return whatToDo;
//	}

	public static void showCinemas() {

		try {
			Connection connetion = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = connetion.prepareStatement("SELECT * FROM CINEMAS;");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("address"));

			}

			ps.close();
			rs.close();
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
				// musi być w pętli nawet jeśli oczekuję jednego wyniku.
				System.out.println("\nEdytujesz:\n" + rs.getString("name") + " | " + rs.getString("address"));
			}
			Scanner scan = new Scanner(System.in);
			System.out.println("Podaj nazwę\n");
			String name = scan.nextLine();
			System.out.println("Podaj adres\n");
			String address = scan.nextLine();

			ps = connection.prepareStatement("UPDATE cinemas SET name=?, address=? WHERE id=?;"); // UWAGA! zapytajniki,
																									// które
			// podstawiają Stringi nie trzeba dawać w cudzysłowach
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setInt(3, id);
			ps.executeUpdate();
			System.out.println("Zmieniono wiersz o id" + id);

			scan.close();
			ps.close();
			rs.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
