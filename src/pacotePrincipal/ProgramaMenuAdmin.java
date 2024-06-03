package pacotePrincipal;

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
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;


public class ProgramaMenuAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramaMenuAdmin frame = new ProgramaMenuAdmin();
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
	public ProgramaMenuAdmin() {
		setTitle("Acesso para adminstrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuário");
		lblUsuario.setFont(new Font("Baskerville Old Face", Font.BOLD, 13));
		lblUsuario.setBounds(10, 57, 61, 32);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Baskerville Old Face", Font.BOLD, 13));
		lblSenha.setBounds(10, 100, 57, 32);
		contentPane.add(lblSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		tfUsuario.setBounds(121, 61, 210, 23);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(121, 100, 210, 23);
		contentPane.add(pfSenha);
		
		JButton btnEntrar = new JButton("Criar funcionário");
		btnEntrar.setBackground(new Color(183, 255, 255));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {	
				Connection con = Conexao.FazConexao();
				
				String sql = "select * from superuser where usuario=? and senha=?";
				
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
		btnEntrar.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		btnEntrar.setBounds(10, 199, 172, 32);
		contentPane.add(btnEntrar);
		
		JLabel lblNewLabel_3 = new JLabel("Cadastrar usuário");
		lblNewLabel_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		lblNewLabel_3.setBounds(155, -4, 150, 54);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Lakatus");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 14));
		lblNewLabel.setBounds(393, 2, 122, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Baskerville Old Face", Font.BOLD, 13));
		lblCpf.setBounds(10, 139, 57, 32);
		contentPane.add(lblCpf);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(121, 143, 210, 23);
		contentPane.add(passwordField);
		
		JButton btnCriarAdminstrador = new JButton("Criar Adminstrador");
		btnCriarAdminstrador.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		btnCriarAdminstrador.setBackground(new Color(183, 255, 255));
		btnCriarAdminstrador.setBounds(263, 199, 172, 32);
		contentPane.add(btnCriarAdminstrador);
	}
}
