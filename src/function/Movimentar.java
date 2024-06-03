package function;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import entities.Contrato;
import entities.Evento;

public class Movimentar {
	
	public static void movimentarContrato(Scanner sc, List<Contrato> contratos, String idContrato) {
        for (Contrato contrato : contratos) {
            if (contrato.getId().equalsIgnoreCase(idContrato.trim()))  {
				System.out.println("Contrato encontrado!");
				
				System.out.printf("Digite a descrição do evento: ");
				String descricaoEvento = sc.nextLine();
				
				System.out.printf("Digite a data de adição do evento (formato: yyyy-MM-dd): ");
				String dataAdicionado = sc.nextLine();
				LocalDate dataAdicionadoEvento = LocalDate.parse(dataAdicionado);
				
				System.out.printf("Digite o funcionário responsável pelo evento: ");
				String funcionario = sc.nextLine();
				
				Evento evento = new Evento(descricaoEvento, dataAdicionadoEvento, funcionario);
				contrato.adicionarEvento(evento);
				
				System.out.println("Evento adicionado com sucesso!");
				System.out.println();
				return;
			}
		}
		
		System.out.println("Contrato não encontrado!");
		System.out.println();
	}
}
