package connettore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Connettore {
	
	private final String PATHDRIVER = "org.postgresql.Driver";
	private final String URLDB = "jdbc:postgresql://localhost:5433/primo_jdbc";
	private final String USERDBMS = "postgres";
	private final String PASSDBMS = "admin";
	//mi avvalgo del polimorfismo per interfaccia
	//in quanto Connection e' un'interfaccia.
	private Connection conn = null;
	private static Connettore instance = null;
	
	//questo metodo deve ritornare al DAO un oggetto Connection
	//per aprire e chiudere la connessione al DB per ogni operazione
	//crud
	public synchronized Connection openConnection() {
		try {
			//riga suscettibile a ClassNotFoundException
			Class.forName(PATHDRIVER); 
			//riga suscettibile a SQLException
			conn = DriverManager.getConnection(URLDB, USERDBMS, PASSDBMS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	private Connettore() {}
	
	public static Connettore getInstance() {
		if(instance == null) {
			instance = new Connettore();
		}
		return instance;
	}

}
