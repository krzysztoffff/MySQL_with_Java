package a_Zadania.a_Dzien_2.c_Relacje_1_1;


public class Main1 {
    //zapisz poniżej zapytania dodający tabelę do bazy pamiętaj o relacji
    public String tableAddQuery = "CREATE TABLE ClientAddress( client_id INT, city VARCHAR(50),"
    		+ " street VARCHAR(50), house_nr VARCHAR(10),"
    		+ " PRIMARY KEY(client_id), FOREIGN KEY(client_id)"
    		+ " REFERENCES Clients(id) ON DELETE CASCADE);";

    //zapisz poniżej kod dodania do bazy rekordów
    public String tableAddRow1 = "INSERT INTO ClientAddress VALUES(2, 'Oswiecim', 'fabryczna', '63');";
    public String tableAddRow2 = "INSERT INTO ClientAddress VALUES(3, 'Zator', 'Diamentowa', '88');";
    public String tableAddRow3 = "INSERT INTO ClientAddress VALUES(4, 'Alwernia', 'fabryczna', '21');";
    public String tableAddRow4 = "";
    public String tableAddRow5 = "";
}
