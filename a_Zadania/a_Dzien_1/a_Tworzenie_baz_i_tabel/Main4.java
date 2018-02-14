package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

public class Main4 {
//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
	String queryCreateTable1 = "CREATE TABLE Cinemas( id INT AUTO_INCREMENT, name VARCHAR(50),"
			+ " address VARCHAR(100), PRIMARY KEY(id));";

//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
	String queryCreateTable2 = "Movies( id INT AUTO_INCREMENT, name VARCHAR(50),"
			+ " description VARCHAR(100), rating DECIMAL(6,2), PRIMARY KEY(id));";

//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
	String queryCreateTable3 = "CREATE TABLE Tickets( id INT AUTO_INCREMENT, quantily INT,"
			+ " price DECIMAL(6,2), PRIMARY KEY(id));";

//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego czwartą tabelę
	String queryCreateTable4 = "CREATE TABLE Payments( id INT AUTO_INCREMENT, type VARCHAR(100),"
			+ " date DATE, PRIMARY KEY(id));";
}
