package function;

import java.time.LocalDate;
import java.util.Scanner;

import entities.Contrato;
import entities.Locador;
import entities.Locatario;
import entities.Objeto;

public class CadastrarContrato {
    private Scanner sc;

    public CadastrarContrato(Scanner sc) {
        this.sc = sc;
    }

    public Contrato cadastrarContrato() {
        System.out.println("LOCADOR");
        System.out.printf("Digite o nome: ");
        String nomeLocador = sc.nextLine();
   

        System.out.printf("Digite o endereço: ");
        String enderecoLocador = sc.nextLine();

        System.out.printf("Digite o CPF: ");
        String cpfLocador = sc.nextLine();
        System.out.println();

        Locador locador = new Locador(nomeLocador, enderecoLocador, cpfLocador);

        System.out.println("LOCATÁRIO");
        System.out.printf("Digite o nome: ");
        String nomeLocatario = sc.nextLine();

        System.out.printf("Digite o endereço: ");
        String enderecoLocatario = sc.nextLine();

        System.out.printf("Digite o CPF: ");
        String cpfLocatario = sc.nextLine();

        System.out.printf("Digite o RG: ");
        String rgLocatario = sc.nextLine();

        System.out.printf("Digite o telefone: ");
        String telefoneLocatario = sc.nextLine();

        System.out.printf("Digite a renda R$: ");
        double rendaLocatario = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Digite a profissão: ");
        String profissaoLocatario = sc.nextLine();
        System.out.println();

        Locatario locatario = new Locatario(nomeLocatario, enderecoLocatario, cpfLocatario, rgLocatario, telefoneLocatario, rendaLocatario, profissaoLocatario);

        System.out.println("IMÓVEL");
        System.out.printf("Digite o endereço: ");
        String enderecoObjeto = sc.nextLine();

        System.out.printf("Digite a inscrição IPTU: ");
        String inscricaoIPTU = sc.nextLine();
        System.out.println();

        Objeto objeto = new Objeto(enderecoObjeto, inscricaoIPTU);

        System.out.println("CONTRATO");
        System.out.printf("Digite o valor do aluguel R$: ");
        double valorDoAluguel = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Digite o valor da caução R$: ");
        double valorDaCaucao = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Digite a data de início (formato: yyyy-MM-dd): ");
        String dataInicio = sc.nextLine();
        LocalDate inicio = LocalDate.parse(dataInicio);

        System.out.printf("Digite a data de fim (formato: yyyy-MM-dd): ");
        String dataFim = sc.nextLine();
        LocalDate fim = LocalDate.parse(dataFim);

        System.out.printf("Digite o dia do vencimento: ");
        int diaDoVencimento = sc.nextInt();
        sc.nextLine();
        System.out.println();

        Contrato contrato = new Contrato(locador, locatario, objeto, 
        		valorDoAluguel, valorDaCaucao, 
        		inicio, fim, diaDoVencimento);
        return contrato;
    }
}
