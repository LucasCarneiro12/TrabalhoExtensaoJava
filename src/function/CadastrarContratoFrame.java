package function;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import entities.Contrato;
import entities.Locador;
import entities.Locatario;
import entities.Objeto;
import java.awt.Font;
import java.awt.Color;

public class CadastrarContratoFrame extends JFrame {
    private JTextField nomeLocadorField;
    private JTextField enderecoLocadorField;
    private JTextField cpfLocadorField;
    private JTextField nomeLocatarioField;
    private JTextField enderecoLocatarioField;
    private JTextField cpfLocatarioField;
    private JTextField rgLocatarioField;
    private JTextField telefoneLocatarioField;
    private JTextField rendaLocatarioField;
    private JTextField profissaoLocatarioField;
    private JTextField enderecoObjetoField;
    private JTextField inscricaoIPTUField;
    private JTextField valorAluguelField;
    private JTextField valorCaucaoField;
    private JTextField dataInicioField;
    private JTextField dataFimField;
    private JTextField diaVencimentoField;

    private List<Contrato> contratos;

    public CadastrarContratoFrame(List<Contrato> contratos) {
    	getContentPane().setBackground(new Color(128, 255, 128));
        this.contratos = contratos;

        setTitle("Cadastrar Contrato");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1035, 673);
        getContentPane().setLayout(null);

        JLabel lblNomeLocador = new JLabel("Nome Locador:");
        lblNomeLocador.setBounds(10, 30, 120, 25);
        getContentPane().add(lblNomeLocador);

        nomeLocadorField = new JTextField();
        nomeLocadorField.setBounds(150, 30, 300, 25);
        getContentPane().add(nomeLocadorField);
        nomeLocadorField.setColumns(10);

        JLabel lblEnderecoLocador = new JLabel("Endereço Locador:");
        lblEnderecoLocador.setBounds(10, 66, 120, 25);
        getContentPane().add(lblEnderecoLocador);

        enderecoLocadorField = new JTextField();
        enderecoLocadorField.setBounds(150, 66, 300, 25);
        getContentPane().add(enderecoLocadorField);
        enderecoLocadorField.setColumns(10);

        JLabel lblCpfLocador = new JLabel("CPF Locador:");
        lblCpfLocador.setBounds(10, 102, 120, 25);
        getContentPane().add(lblCpfLocador);

        cpfLocadorField = new JTextField();
        cpfLocadorField.setBounds(150, 102, 300, 25);
        getContentPane().add(cpfLocadorField);
        cpfLocadorField.setColumns(10);

        // Locatário
        JLabel lblNomeLocatario = new JLabel("Nome Locatário:");
        lblNomeLocatario.setBounds(541, 30, 120, 25);
        getContentPane().add(lblNomeLocatario);

        nomeLocatarioField = new JTextField();
        nomeLocatarioField.setBounds(671, 30, 300, 25);
        getContentPane().add(nomeLocatarioField);
        nomeLocatarioField.setColumns(10);

        JLabel lblEnderecoLocatario = new JLabel("Endereço Locatário:");
        lblEnderecoLocatario.setBounds(541, 66, 120, 25);
        getContentPane().add(lblEnderecoLocatario);

        enderecoLocatarioField = new JTextField();
        enderecoLocatarioField.setBounds(671, 66, 300, 25);
        getContentPane().add(enderecoLocatarioField);
        enderecoLocatarioField.setColumns(10);

        JLabel lblCpfLocatario = new JLabel("CPF Locatário:");
        lblCpfLocatario.setBounds(541, 102, 120, 25);
        getContentPane().add(lblCpfLocatario);

        cpfLocatarioField = new JTextField();
        cpfLocatarioField.setBounds(671, 102, 300, 25);
        getContentPane().add(cpfLocatarioField);
        cpfLocatarioField.setColumns(10);

        JLabel lblRgLocatario = new JLabel("RG Locatário:");
        lblRgLocatario.setBounds(541, 138, 120, 25);
        getContentPane().add(lblRgLocatario);

        rgLocatarioField = new JTextField();
        rgLocatarioField.setBounds(671, 138, 300, 25);
        getContentPane().add(rgLocatarioField);
        rgLocatarioField.setColumns(10);

        JLabel lblTelefoneLocatario = new JLabel("Telefone Locatário:");
        lblTelefoneLocatario.setBounds(541, 174, 120, 25);
        getContentPane().add(lblTelefoneLocatario);

        telefoneLocatarioField = new JTextField();
        telefoneLocatarioField.setBounds(671, 174, 300, 25);
        getContentPane().add(telefoneLocatarioField);
        telefoneLocatarioField.setColumns(10);

        JLabel lblRendaLocatario = new JLabel("Renda Locatário R$:");
        lblRendaLocatario.setBounds(541, 210, 120, 25);
        getContentPane().add(lblRendaLocatario);

        rendaLocatarioField = new JTextField();
        rendaLocatarioField.setBounds(671, 210, 300, 25);
        getContentPane().add(rendaLocatarioField);
        rendaLocatarioField.setColumns(10);

        JLabel lblProfissaoLocatario = new JLabel("Profissão Locatário:");
        lblProfissaoLocatario.setBounds(541, 253, 120, 25);
        getContentPane().add(lblProfissaoLocatario);

        profissaoLocatarioField = new JTextField();
        profissaoLocatarioField.setBounds(671, 253, 300, 25);
        getContentPane().add(profissaoLocatarioField);
        profissaoLocatarioField.setColumns(10);

        // Imóvel
        JLabel lblEnderecoObjeto = new JLabel("Endereço Imóvel:");
        lblEnderecoObjeto.setBounds(10, 210, 120, 25);
        getContentPane().add(lblEnderecoObjeto);

        enderecoObjetoField = new JTextField();
        enderecoObjetoField.setBounds(150, 210, 300, 25);
        getContentPane().add(enderecoObjetoField);
        enderecoObjetoField.setColumns(10);

        JLabel lblInscricaoIPTU = new JLabel("Inscrição IPTU:");
        lblInscricaoIPTU.setBounds(10, 253, 120, 25);
        getContentPane().add(lblInscricaoIPTU);

        inscricaoIPTUField = new JTextField();
        inscricaoIPTUField.setBounds(150, 253, 300, 25);
        getContentPane().add(inscricaoIPTUField);
        inscricaoIPTUField.setColumns(10);

        // Contrato
        JLabel lblValorAluguel = new JLabel("Valor Aluguel R$:");
        lblValorAluguel.setBounds(10, 298, 120, 25);
        getContentPane().add(lblValorAluguel);

        valorAluguelField = new JTextField();
        valorAluguelField.setBounds(150, 298, 300, 25);
        getContentPane().add(valorAluguelField);
        valorAluguelField.setColumns(10);

        JLabel lblValorCaucao = new JLabel("Valor Caução R$:");
        lblValorCaucao.setBounds(10, 343, 120, 25);
        getContentPane().add(lblValorCaucao);

        valorCaucaoField = new JTextField();
        valorCaucaoField.setBounds(150, 343, 300, 25);
        getContentPane().add(valorCaucaoField);
        valorCaucaoField.setColumns(10);

        JLabel lblDataInicio = new JLabel("Data Início (yyyy-MM-dd):");
        lblDataInicio.setBounds(10, 379, 140, 25);
        getContentPane().add(lblDataInicio);

        dataInicioField = new JTextField();
        dataInicioField.setBounds(150, 379, 300, 25);
        getContentPane().add(dataInicioField);
        dataInicioField.setColumns(10);

        JLabel lblDataFim = new JLabel("Data Fim (yyyy-MM-dd):");
        lblDataFim.setBounds(10, 415, 140, 25);
        getContentPane().add(lblDataFim);

        dataFimField = new JTextField();
        dataFimField.setBounds(150, 415, 300, 25);
        getContentPane().add(dataFimField);
        dataFimField.setColumns(10);

        JLabel lblDiaVencimento = new JLabel("Dia do Vencimento:");
        lblDiaVencimento.setBounds(10, 459, 120, 25);
        getContentPane().add(lblDiaVencimento);

        diaVencimentoField = new JTextField();
        diaVencimentoField.setBounds(150, 459, 300, 25);
        getContentPane().add(diaVencimentoField);
        diaVencimentoField.setColumns(10);


        // Continue com os campos do Locatário, Objeto e Contrato...

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Locador locador = new Locador(
                        nomeLocadorField.getText(),
                        enderecoLocadorField.getText(),
                        cpfLocadorField.getText()
                );

                Locatario locatario = new Locatario(
                        nomeLocatarioField.getText(),
                        enderecoLocatarioField.getText(),
                        cpfLocatarioField.getText(),
                        rgLocatarioField.getText(),
                        telefoneLocatarioField.getText(),
                        Double.parseDouble(rendaLocatarioField.getText()),
                        profissaoLocatarioField.getText()
                );

                Objeto objeto = new Objeto(
                        enderecoObjetoField.getText(),
                        inscricaoIPTUField.getText()
                );

                Contrato contrato = new Contrato(
                        locador,
                        locatario,
                        objeto,
                        Double.parseDouble(valorAluguelField.getText()),
                        Double.parseDouble(valorCaucaoField.getText()),
                        LocalDate.parse(dataInicioField.getText()),
                        LocalDate.parse(dataFimField.getText()),
                        Integer.parseInt(diaVencimentoField.getText())
                );

                contratos.add(contrato);
                JOptionPane.showMessageDialog(null, "Contrato cadastrado com sucesso! ID: " + contrato.getId());
                dispose();
            }
        });
        btnCadastrar.setBounds(437, 527, 130, 25);
        getContentPane().add(btnCadastrar);
        
        JLabel lblNewLabel = new JLabel("Informações do Locador");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel.setBounds(217, 11, 192, 14);
        getContentPane().add(lblNewLabel);
        
        JLabel lblInformaesDoImvel = new JLabel("Informações do Imóvel");
        lblInformaesDoImvel.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblInformaesDoImvel.setBounds(204, 179, 192, 14);
        getContentPane().add(lblInformaesDoImvel);
        
        JLabel lblInformaesDoLocatrio = new JLabel("Informações do Locatário");
        lblInformaesDoLocatrio.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblInformaesDoLocatrio.setBounds(736, 11, 192, 14);
        getContentPane().add(lblInformaesDoLocatrio);
    }
}
