package a_Zadania.a_Dzien_1.b_Dodawanie_danych;

/**
 * Created by dell on 08.02.17.
 */
public class Main2 {

    public String query1 = "INSERT INTO Products SET id=0, name=produkt1, description=name, price=904";
    public String query1fixed = "INSERT INTO Products SET name='produkt1', description='name', price=904;";

    public String query2 = "INSERT INTO Clients VALUES(\"Jan\", \"Kowalski\", 4, \"Mr.\")";
    public String query2fixed = "INSERT INTO Clients VALUES( default, 'Jan', 'Kowalski');";

    public String query3 = "INSERT INTO Movies(id, rating, name) VALUES(default, 'bardzo dobry', 'Szybcy i wœciekli');";
    public String query3fixed = "INSERT INTO Movies(id, rating, name) VALUES(default, 9.9, 'Szybcy i wœciekli');";

    public String query4 = "INSERT INTO Payments SET id=90 AND VALUES(\"cash\", NOW())";
    public String query4fixed = "INSERT INTO Payments VALUES(90, 'cash', NOW());";
}
