package pacotePrincipal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

/*	private static String url;
	private static String usuario;
	private static String senha;
	private static Connection con;
	
	*/

	public static Connection FazConexao() {
	
		
		try {
			Class.forName("org.postgresql.Driver");
			
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_login", "postgres", "Lucas");
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}

		
	
	}
	
	public static void fecharConcexao(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void fecharConcexao(Connection con, PreparedStatement pstm) {
		if(con != null) {
			try {
				con.close();
				pstm.close();
				
				} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	public static void fecharConcexao(Connection con, PreparedStatement pstm, ResultSet rs) {
		if(con != null) {
			try {
				con.close();
				pstm.close();
				rs.close();
				} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
