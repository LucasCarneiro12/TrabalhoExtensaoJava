package function;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import entities.Contrato;
import entities.Evento;

public class MovimentarFrame extends JFrame {
    private JTextField idContratoField;
    private JTextField descricaoEventoField;
    private JTextField dataAdicionadoField;
    private JTextField funcionarioField;

    private List<Contrato> contratos;

    public MovimentarFrame(List<Contrato> contratos) {
        this.contratos = contratos;

        setTitle("Movimentar Contrato");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);

        JLabel lblIdContrato = new JLabel("ID do Contrato:");
        lblIdContrato.setBounds(10, 10, 150, 25);
        getContentPane().add(lblIdContrato);

        idContratoField = new JTextField();
        idContratoField.setBounds(160, 10, 250, 25);
        getContentPane().add(idContratoField);

        JLabel lblDescricaoEvento = new JLabel("Descrição do Evento:");
        lblDescricaoEvento.setBounds(10, 45, 150, 25);
        getContentPane().add(lblDescricaoEvento);

        descricaoEventoField = new JTextField();
        descricaoEventoField.setBounds(160, 45, 250, 25);
        getContentPane().add(descricaoEventoField);

        JLabel lblDataAdicionado = new JLabel("Data Adicionado:");
        lblDataAdicionado.setBounds(10, 80, 150, 25);
        getContentPane().add(lblDataAdicionado);

        dataAdicionadoField = new JTextField();
        dataAdicionadoField.setBounds(160, 80, 250, 25);
        getContentPane().add(dataAdicionadoField);

        JLabel lblFuncionario = new JLabel("Funcionário:");
        lblFuncionario.setBounds(10, 115, 150, 25);
        getContentPane().add(lblFuncionario);

        funcionarioField = new JTextField();
        funcionarioField.setBounds(160, 115, 250, 25);
        getContentPane().add(funcionarioField);

        JButton btnAdicionarEvento = new JButton("Adicionar Evento");
        btnAdicionarEvento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String idContrato = idContratoField.getText();
                for (Contrato contrato : contratos) {
                    if (contrato.getId().equalsIgnoreCase(idContrato.trim())) {
                        Evento evento = new Evento(
                                descricaoEventoField.getText(),
                                LocalDate.parse(dataAdicionadoField.getText()),
                                funcionarioField.getText()
                        );
                        contrato.adicionarEvento(evento);
                        JOptionPane.showMessageDialog(null, "Evento adicionado com sucesso!");
                        dispose();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Contrato não encontrado!");
            }
        });
        btnAdicionarEvento.setBounds(160, 160, 150, 25);
        getContentPane().add(btnAdicionarEvento);
    }
}
