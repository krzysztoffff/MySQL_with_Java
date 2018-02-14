package a_Zadania.a_Dzien_2.d_Relacje_1_wiele;


public class Main3 {
    public String query1 = "SELECT * FROM Products JOIN Opinions ON "
    		+ "Products.id=Opinions.Products_id;";
    public String query2 = "SELECT * FROM Products LEFT JOIN Opinions ON Products.id=Opinions.Products_id";
    public String query3 = "SELECT * FROM Products LEFT JOIN Opinions ON Products.id=Opinions.Products_id WHERE Opinions.Products_id IS NULL";

}
