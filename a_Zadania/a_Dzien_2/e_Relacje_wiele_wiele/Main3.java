package a_Zadania.a_Dzien_2.e_Relacje_wiele_wiele;


public class Main3 {
    //poniżej zapisz zapytanie tworzące tabele i łączące je.
	
	
	
	
	
    public String query1 = "CREATE TABLE Screenings( id INT AUTO_INCREMENT,"
    		+ " Cinemas_id INT, Movies_id INT, PRIMARY KEY(id), FOREIGN KEY (Cinemas_id)"
    		+ " REFERENCES Movies(id), FOREIGN KEY (Movies_id) REFERENCES Cinemas(id));";
}
