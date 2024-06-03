package pacotePrincipal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class FuncionarioDao {


	public void cadastrarFuncionario(Funcionario f) {
		
		String sql = "INSERT INTO usuarios (usuario, senha, acesso) VALUES (?,?,?)";
		PreparedStatement pstm = null;
		Connection con = Conexao.FazConexao();		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, f.nome);
			pstm.setString(2, f.senha);
			pstm.setString(3, f.acesso);
			
			if(pstm.executeUpdate()>0) {
				System.out.println("Funcionario cadastrado com sucesso!");
				JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
			}
			else {
				System.out.println("User já existe");
			}
			pstm.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}



}
