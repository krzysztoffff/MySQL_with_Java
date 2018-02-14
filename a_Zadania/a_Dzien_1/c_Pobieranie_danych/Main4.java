package a_Zadania.a_Dzien_1.c_Pobieranie_danych;


public class Main4 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT SUM(quantity) FROM Tickets;";
    public String query2 = "SELECT COUNT(type) FROM Payments WHERE type='card';";
    public String query3 = "SELECT AVG(price) from Tickets;";
    public String query4 = "SELECT * FROM Payments LIMIT 2, 7;";  //SELECT * FROM Payments LIMIT 7 OFFSET 2;
    public String query5 = "SELECT type, COUNT(*) AS size from Payments GROUP BY type HAVING size > 2;";
    public String query6 = "SELECT SUM(quantity) FROM Tickets WHERE quantity > 200;"; //dla przykładu sumuję wszystkie bilety, których ilość jest większa od 200
    
    
    
}
