package a_Zadania.a_Dzien_2.e_Relacje_wiele_wiele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {
	
public static void main(String[] args) {
		
    	try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/products_ex?useSSL=false",
					"root", "coderslab");
			String sql = "SELECT Products.id, Orders.id "
					+ "FROM Products JOIN Products_Orders ON Products.id= Products_Orders.Products_id "
					+ "JOIN Orders ON Products_Orders.Orders_id=Orders.id ORDER BY Products.id;";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			int previousProductId = 0;
			while(rs.next()){
				int productId = rs.getInt("Products.id");
				if(productId != previousProductId){
					System.out.println("Product o id= " +productId);
					previousProductId = productId;
				}
				int orderId = rs.getInt("Orders.id");
				System.out.println("Zamowienie o id" +orderId);
				

			}
			
			
			preparedStatement.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
	}

}
