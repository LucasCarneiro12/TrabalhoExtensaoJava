package pacoteConexao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ProgramaMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramaMenu frame = new ProgramaMenu();
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
	public ProgramaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Contratos");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Adicionar");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Atualizar");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Suporte");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Admin");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JButton btnCadastrarUser = new JButton("Cadastrar usuario");
		btnCadastrarUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		mnCadastro.add(btnCadastrarUser);
		
		JMenu mnNewMenu_2 = new JMenu("Encerrar seção");
		menuBar.add(mnNewMenu_2);
		
		JButton btnSair = new JButton("      Sair     ");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		mnNewMenu_2.add(btnSair);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
