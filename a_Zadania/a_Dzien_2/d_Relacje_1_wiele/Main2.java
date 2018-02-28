package a_Zadania.a_Dzien_2.d_Relacje_1_wiele;


public class Main2 {
//zapisz poniżej zapytania tworzące odpowiednie tabele
    public String queryAddCategories =  "CREATE TABLE Categories( id INT AUTO_INCREMENT,"
    		+ " name VARCHAR(50), PRIMARY KEY(id));";

    public String queryAddCategoriesSub =  "CREATE TABLE Categories_sub( id INT AUTO_INCREMENT,"
    		+ " Categories_id INT, name VARCHAR(50), PRIMARY KEY (id), FOREIGN KEY (Categories_id)"
    		+ " REFERENCES Categories(id));";

    public String queryRelationTable =  "SELECT *  FROM Categories JOIN Categories"
    		+ "_sub ON Categories.id=Categories_sub.Categories_id WHERE Categories.name"
    		+ " = 'Słodycze';";
}
