package pacoteConexao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ProgramaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramaLogin frame = new ProgramaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProgramaLogin() {
		setResizable(false);
		setTitle("Tela de Acesso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuário");
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsuario.setBounds(109, 5, 200, 32);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSenha.setBounds(109, 65, 200, 32);
		contentPane.add(lblSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		tfUsuario.setBounds(109, 35, 200, 32);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(109, 94, 200, 32);
		contentPane.add(pfSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {	
				Connection con = Conexao.FazConexao();
				
				String sql = "select * from usuarios where usuario=? and senha=?";
				
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setString(1, tfUsuario.getText());
				stmt.setString(2, new String (pfSenha.getPassword()));
				
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next()) {
					JOptionPane.showMessageDialog(null, "Bem-vindo!");
					
					ProgramaMenu exibir = new ProgramaMenu();
					exibir.setVisible(true);
					
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario ou Senha incorreta.");
				}
				
				stmt.close();
				con.close();
				
			} catch(SQLException e1) {
				e1.printStackTrace();
				
			}
			
			}
		});
		btnEntrar.setFont(new Font("Arial", Font.BOLD, 11));
		btnEntrar.setBounds(167, 137, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnSuporte = new JButton("Suporte");
		btnSuporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Entre em contato com o seu suporte pelo Número 123456789");
			}
		});
		btnSuporte.setFont(new Font("Arial", Font.BOLD, 11));
		btnSuporte.setBounds(167, 224, 89, 23);
		contentPane.add(btnSuporte);
		
		JLabel lblNewLabel = new JLabel("Esqueceu a senha?");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(167, 199, 109, 14);
		contentPane.add(lblNewLabel);
	}
}
