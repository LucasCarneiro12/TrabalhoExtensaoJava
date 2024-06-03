package function;

import java.util.List;
import java.util.Scanner;

import entities.Contrato;
import entities.Evento;

public class Consultar {
	private List<Contrato> contratos;
    private String idContrato;

    public Consultar(List<Contrato> contratos, String idContrato) {
        this.contratos = contratos;
        this.idContrato = idContrato;
    }

    public void consultarContratoPorId(Scanner sc) {
        for (Contrato contrato : contratos) {
            if (contrato.getId().equalsIgnoreCase(idContrato.trim()))  {
                System.out.println("Contrato encontrado!%n");
                System.out.printf("ID: %s%n", contrato.getId());
                System.out.printf("Locador:%n");
                System.out.printf("\tNome: %s%n", contrato.getLocador().getNome());
                System.out.printf("\tEndereço: %s%n", contrato.getLocador().getEndereco());
                System.out.printf("\tCPF: %s%n", contrato.getLocador().getCpf());
                System.out.printf("Locatário:%n");
                System.out.printf("\tNome: %s%n", contrato.getLocatario().getNome());
                System.out.printf("\tEndereço: %s%n", contrato.getLocatario().getEndereco());
                System.out.printf("\tCPF: %s%n", contrato.getLocatario().getCpf());
                System.out.printf("\tRG: %s%n", contrato.getLocatario().getRg());
                System.out.printf("\tTelefone: %s%n", contrato.getLocatario().getTelefone());
                System.out.printf("\tRenda R$: %.2f%n", contrato.getLocatario().getRenda());
                System.out.printf("\tProfissão: %s%n", contrato.getLocatario().getProfissao());
                System.out.printf("Imóvel:%n");
                System.out.printf("\tEndereço: %s%n", contrato.getObjeto().getEndereco());
                System.out.printf("\tInscrição IPTU: %s%n", contrato.getObjeto().getInscricaoIPTU());
                System.out.println();
                System.out.printf("Valor do aluguel R$: %.2f%n", contrato.getValorDoAluguel());
                System.out.printf("Valor da caução R$: %.2f%n", contrato.getValorDaCaucao());
                System.out.printf("Data de início: %s%n", contrato.getInicio());
                System.out.printf("Data de término: %s%n", contrato.getFim());
                System.out.printf("Dia do vencimento: %d%n", contrato.getDiaDoVencimento());
                System.out.println();

                System.out.printf("Eventos:%n");
                int count = 1;
                for (Evento evento : contrato.getEventos()) {
                    System.out.printf("\tEvento %d:%n", count);
                    System.out.printf("\t\tDescrição: %s%n", evento.getDescricao());
                    System.out.printf("\t\tData de adição: %s%n", evento.getDataAdicionado());
                    System.out.printf("\t\tFuncionário responsável: %s%n", evento.getFuncionario());
                    System.out.println();
                    count++;
                }
                return;
            }
}
        System.out.println("Contrato não encontrado!");
        System.out.println();
    }
}