package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;


public class Main4 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "UPDATE Cinemas SET name='Stadion Narodowy' WHERE name LIKE '%z';";
    public String query2 = "DELETE FROM payments WHERE date < NOW() - INTERVAL 4 DAY;";
    public String query3 = "UPDATE Movies SET rating = 5.4 WHERE LENGTH(description) > 8;";
    public String query4 = "UPDATE tickets SET price = (price + price*0.5) WHERE quantity > 10;";

}
