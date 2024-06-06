package pacotePrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import application.MainFrame;

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
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;

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
		lblUsuario.setFont(new Font("Baskerville Old Face", Font.BOLD, 13));
		lblUsuario.setBounds(234, 0, 200, 32);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Baskerville Old Face", Font.BOLD, 13));
		lblSenha.setBounds(234, 67, 200, 32);
		contentPane.add(lblSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		tfUsuario.setBounds(224, 28, 200, 32);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(224, 95, 200, 32);
		contentPane.add(pfSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(new Color(3, 119, 0));
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
			
						MainFrame exibir = new MainFrame();
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
		btnEntrar.setFont(new Font("Baskerville Old Face", Font.BOLD, 11));
		btnEntrar.setBounds(276, 138, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnSuporte = new JButton("Suporte");
		btnSuporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Entre em contato com o seu suporte pelo Número 123456789");
			}
		});
		btnSuporte.setFont(new Font("Baskerville Old Face", Font.BOLD, 11));
		btnSuporte.setBounds(276, 227, 89, 23);
		contentPane.add(btnSuporte);
		
		JLabel lblNewLabel = new JLabel("Esqueceu a senha?");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 11));
		lblNewLabel.setBounds(276, 202, 109, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lokatus");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\EVANICE\\Downloads\\WhatsApp Image 2024-05-21 at 23.25.53.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 219, 261);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lakatus");
		lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		lblNewLabel_2.setBounds(46, 103, 94, 46);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lakatus");
		lblNewLabel_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		lblNewLabel_3.setBounds(34, 83, 150, 54);
		contentPane.add(lblNewLabel_3);
	}
}
