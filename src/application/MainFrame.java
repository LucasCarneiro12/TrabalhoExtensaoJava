package application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import entities.Contrato;
import function.CadastrarContratoFrame;
import function.ConsultarFrame;
import function.MovimentarFrame;
import java.awt.Color;

public class MainFrame extends JFrame {
    private List<Contrato> contratos = new ArrayList<>();

    public MainFrame() {
        setTitle("Sistema de Contratos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(128, 255, 128));
        getContentPane().add(panel);
        panel.setLayout(null);

        JButton btnCadastrarContrato = new JButton("Cadastrar Contrato");
        btnCadastrarContrato.setBounds(111, 52, 200, 25);
        panel.add(btnCadastrarContrato);

        btnCadastrarContrato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CadastrarContratoFrame(contratos).setVisible(true);
            }
        });

        JButton btnMovimentarContrato = new JButton("Movimentar Contrato");
        btnMovimentarContrato.setBounds(111, 99, 200, 25);
        panel.add(btnMovimentarContrato);

        btnMovimentarContrato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MovimentarFrame(contratos).setVisible(true);
            }
        });

        JButton btnConsultarContrato = new JButton("Consultar Contrato");
        btnConsultarContrato.setBounds(111, 149, 200, 25);
        panel.add(btnConsultarContrato);

        btnConsultarContrato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ConsultarFrame(contratos).setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
