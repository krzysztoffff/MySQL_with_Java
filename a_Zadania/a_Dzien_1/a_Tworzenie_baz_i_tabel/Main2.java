package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

public class Main2 {
	// Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
	public String queryCreateTable1 = "CREATE TABLE Products( id INT AUTO_INCREMENT, name VARCHAR(50),"
			+ " description VARCHAR(255), price DECIMAL(10,2), PRIMARY KEY(id));";

	// Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
	public String queryCreateTable2 = "CREATE TABLE Orders( id INT AUTO_INCREMENT,"
			+ " description VARCHAR(255), PRIMARY KEY(id));";

	// Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
	public String queryCreateTable3 = "CREATE TABLE Clients( id INT AUTO_INCREMENT, name VARCHAR(255),"
			+ " surname VARCHAR(255), PRIMARY KEY(id));";
}
