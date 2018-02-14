package a_Zadania.a_Dzien_2.c_Relacje_1_1;


public class Main3 {
    //zapisz poniżej zapytanie tworzące tabelę - pamiętaj o relacji i dodaniu odpowiedniej kolumny
    public String queryCreateTable = "CREATE TABLE Payments( id INT, type VARCHAR(50),"
    		+ " date DATE, pay TINYINT, PRIMARY KEY(id), FOREIGN KEY(id) REFERENCES Tickets(id)"
    		+ " ON DELETE CASCADE);";
}
//SELECT * FROM Tickets LEFT JOIN Payments on Tickets.id=Payments.id WHERE Payments.id IS NULL;