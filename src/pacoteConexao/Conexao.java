package pacoteConexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

/*	private static String url;
	private static String usuario;
	private static String senha;
	private static Connection con;
	
	*/

	public static Connection FazConexao() {
	/*	url = "jdbc:postgresql://localhost:5432/db_login";
		usuario = "postgres";
		senha = "Lucas";
		*/
		
		
		try {
			Class.forName("org.postgresql.Driver");
			
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_login", "postgres", "Lucas");
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}

		
	
	}
	
	
}
