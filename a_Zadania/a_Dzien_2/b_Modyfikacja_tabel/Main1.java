package a_Zadania.a_Dzien_2.b_Modyfikacja_tabel;


public class Main1 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "ALTER TABLE Tickets ADD price_usd DECIMAL(6,2) default 0.0;";
    public String query2 = "ALTER TABLE movies ADD director CHAR(80) default 'nie wpisano';";
    public String query3 = "ALTER TABLE movies CHANGE director director VARCHAR(50);";
    public String query4 = "ALTER TABLE tickets DROP price_usd;";
}
