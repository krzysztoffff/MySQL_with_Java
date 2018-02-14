package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main3 {
    //Zapisz w poni≈ºszej zmiennej kod zapytania SQL
    String query = "CREATE DATABASE cinemas_ex;";
    


    public static void main(String[] args) {
		
    	Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false", "root", "coderslab");
			
			
			System.out.println("Po≥πczenie ustanowione");

			
			
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

    	
    	
    	
	}

}
