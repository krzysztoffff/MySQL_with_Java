package a_Zadania.a_Dzien_1.c_Pobieranie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main1 {
    //Zapisz w poniższej zmiennej kod zapytania SQL pobierającego odpowiednie dane
    public String query = "";
    
    
    public static void main(String[] args) {
		
    	try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_ex?useSSL=false",
					"root", "coderslab");
			String sql = "SELECT id, name, description, price FROM Products;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String descr = rs.getString("description");
				float price = rs.getFloat("price");
				if (descr.length() > 10){
					descr = descr.substring(0, 10) + "...";
				}
				System.out.println(id + " | " + name + " | " + descr + " | " + price);
			}
			
			
			preparedStatement.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
	}
}
