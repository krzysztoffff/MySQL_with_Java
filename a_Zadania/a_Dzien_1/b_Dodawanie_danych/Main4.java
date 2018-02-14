package a_Zadania.a_Dzien_1.b_Dodawanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main4 {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("podaj id: ");
	int id = scan.nextInt();
	System.out.println("podaj name:");
	String name = scan.next();
	System.out.println("podaj adres kina: ");
	String address = scan.next();
	addCinema(id, name, address);
	scan.close();
	
	//wywala się scan.nextLine
}	
	
	static void addCinema(int id, String name, String address){
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false",
					"root", "coderslab");
			Statement statement = conn.createStatement();
			statement.executeUpdate("INSERT INTO Cinemas SET id='"+id+"', name='"+name+"', address='"+address+"'");
			System.out.println("dodano wiersz");
			statement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
