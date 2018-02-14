package a_Zadania.a_Dzien_1.b_Dodawanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main3 {

	private List<String> querries = new ArrayList<>();
	private String table1row1 = "INSERT INTO Cinemas VALUES(default, 'John', 'Doe');";
	private String table1row2 = "INSERT INTO Cinemas VALUES(default, 'Krzysztof', 'Kurzak');";
	private String table1row3 = "INSERT INTO Cinemas SET name='centrum', address='Legnicka 5';";
	private String table1row4 = "INSERT INTO Cinemas SET name='siede_D', address='kosciuszki 11';";
	private String table1row5 = "INSERT INTO Cinemas SET name='Multikino', address='Dworcowa 21';";
	private String table2row1 = "INSERT INTO Movies SET name='Milczenie Owiec', description='romans'  ,rating=10.0;";
	private String table2row2 = "INSERT INTO Movies SET name='Pila5', description='komedia'  ,rating=3.0;";
	private String table2row3 = "INSERT INTO Movies SET name='Freddie', description='horror', rating=5.0;";
	private String table2row4 = " INSERT INTO Movies SET name='Matrix', description='horror', rating=7.0;";
	private String table2row5 = "INSERT INTO Movies SET name='Matrix II', description='horror', rating=4.0;";
	private String table3row1 = "INSERT INTO Payments SET type='cash', date=NOW();";
	private String table3row2 = "INSERT INTO Payments SET type='cash', date='2017-02-13';";
	private String table3row3 = "INSERT INTO Payments SET type='card', date='2017-12-13';";
	private String table3row4 = "INSERT INTO Payments SET type='cash', date='2017-11-13';";
	private String table3row5 = "INSERT INTO Payments SET type='bitcoin', date='2016-11-13';";
	private String table4row1 = "INSERT INTO Tickets SET quantity = 505, price=12.5;";
	private String table4row2 = "INSERT INTO Tickets SET quantity = 405, price=10.5;";
	private String table4row3 = "INSERT INTO Tickets SET quantity = 305, price=19.5;";
	private String table4row4 = "INSERT INTO Tickets SET quantity = 205, price=9.5;";
	private String table4row5 = "INSERT INTO Tickets SET quantity = 105, price=19.5;";

	public static void main(String[] args) {
		Main3 m = new Main3();

		m.addToList();

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false",
					"root", "coderslab");
			Statement s = connection.createStatement();
			for (String statement : m.querries) {
				// wykonujê ka¿de zapytanie SQL z listy
				s.executeUpdate(statement);
			}
			s.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addToList() {
		this.querries.add(this.table1row1);
		this.querries.add(this.table1row2);
		this.querries.add(this.table1row3);
		this.querries.add(this.table1row4);
		this.querries.add(this.table1row5);
		this.querries.add(this.table2row1);
		this.querries.add(this.table2row2);
		this.querries.add(this.table2row3);
		this.querries.add(this.table2row4);
		this.querries.add(this.table2row5);
		this.querries.add(this.table3row1);
		this.querries.add(this.table3row2);
		this.querries.add(this.table3row3);
		this.querries.add(this.table3row4);
		this.querries.add(this.table3row5);
		this.querries.add(this.table4row1);
		this.querries.add(this.table4row2);
		this.querries.add(this.table4row3);
		this.querries.add(this.table4row4);
		this.querries.add(this.table4row5);
		System.out.println("Usupe³niono listê");

	}

}
