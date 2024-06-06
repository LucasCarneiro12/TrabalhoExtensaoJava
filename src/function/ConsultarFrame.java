package function;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import entities.Contrato;
import entities.Evento;
import java.awt.Color;

public class ConsultarFrame extends JFrame {
    private JTextField idContratoField;
    private JTextField cpfLocatarioField;
    private JTextArea resultadoArea;

    private List<Contrato> contratos;

    public ConsultarFrame(List<Contrato> contratos) {
    	getContentPane().setBackground(new Color(128, 255, 128));
        this.contratos = contratos;

        setTitle("Consultar Contrato");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        getContentPane().setLayout(null);

        JLabel lblIdContrato = new JLabel("ID do Contrato:");
        lblIdContrato.setBounds(10, 10, 150, 25);
        getContentPane().add(lblIdContrato);

        idContratoField = new JTextField();
        idContratoField.setBounds(160, 10, 250, 25);
        getContentPane().add(idContratoField);

        JLabel lblCpfLocatario = new JLabel("CPF do Locatário:");
        lblCpfLocatario.setBounds(10, 45, 150, 25);
        getContentPane().add(lblCpfLocatario);

        cpfLocatarioField = new JTextField();
        cpfLocatarioField.setBounds(160, 45, 250, 25);
        getContentPane().add(cpfLocatarioField);

        JButton btnConsultar = new JButton("Consultar");
        btnConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String idContrato = idContratoField.getText();
                String cpfLocatario = cpfLocatarioField.getText();
                StringBuilder resultado = new StringBuilder();

                for (Contrato contrato : contratos) {
                    if (contrato.getId().equalsIgnoreCase(idContrato.trim()) ||
                            contrato.getLocatario().getCpf().equalsIgnoreCase(cpfLocatario.trim())) {
                        resultado.append("Contrato encontrado!\n")
                                .append("ID: ").append(contrato.getId()).append("\n")
                                .append("Locador: ").append(contrato.getLocador().getNome()).append("\n")
                                .append("Locatário: ").append(contrato.getLocatario().getNome()).append("\n")
                                .append("Imóvel: ").append(contrato.getObjeto().getEndereco()).append("\n")
                                .append("Valor do aluguel: ").append(contrato.getValorDoAluguel()).append("\n")
                                .append("Valor da caução: ").append(contrato.getValorDaCaucao()).append("\n")
                                .append("Data de início: ").append(contrato.getInicio()).append("\n")
                                .append("Data de término: ").append(contrato.getFim()).append("\n")
                                .append("Dia do vencimento: ").append(contrato.getDiaDoVencimento()).append("\n")
                                .append("Eventos:\n");

                        int count = 1;
                        for (Evento evento : contrato.getEventos()) {
                            resultado.append("\tEvento ").append(count).append(":\n")
                                    .append("\t\tDescrição: ").append(evento.getDescricao()).append("\n")
                                    .append("\t\tData de adição: ").append(evento.getDataAdicionado()).append("\n")
                                    .append("\t\tFuncionário responsável: ").append(evento.getFuncionario()).append("\n");
                            count++;
                        }

                        resultado.append("\n");
                    }
                }

                if (resultado.length() == 0) {
                    resultado.append("Contrato não encontrado!");
                }

                resultadoArea.setText(resultado.toString());
            }
        });
        btnConsultar.setBounds(160, 80, 150, 25);
        getContentPane().add(btnConsultar);

        resultadoArea = new JTextArea();
        resultadoArea.setBounds(10, 115, 464, 235);
        getContentPane().add(resultadoArea);
    }
}
