package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import function.CadastrarContrato;
import function.Consultar;
import function.Movimentar;

public class program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contrato> contratos = new ArrayList<>();
		
		while (true) {
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Cadastrar contrato");
			System.out.println("2 - Movimentar contrato");
			System.out.println("3 - Consultar contrato");
			System.out.println("4 - Sair");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
				case 1:
					CadastrarContrato cadastrarContrato = new CadastrarContrato(sc);
					Contrato contrato = cadastrarContrato.cadastrarContrato();
					contratos.add(contrato);
					System.out.printf("Contrato cadastrado com sucesso!%n");
					System.out.println("ID do contrato: " + contrato.getId());
					System.out.println();
					break;
				case 2:
				    System.out.println("MOVIMENTAR");
				    System.out.printf("Digite o ID do contrato: ");
				    String idContrato = sc.nextLine();
				    Movimentar.movimentarContrato(sc, contratos, idContrato);
				    break;
				case 3:
				    if (contratos.isEmpty()) {
				        System.out.println("Não há contratos cadastrados.");
				    } else {
				        System.out.println("CONSULTAR");
				        System.out.printf("Digite o ID do contrato: ");
				        idContrato = sc.nextLine();
				        Consultar consulta = new Consultar(contratos, idContrato);
				        consulta.consultarContratoPorId(sc);
				    }
				    break;
				case 4:
					System.out.println("Saindo do programa...");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Opção inválida, tente novamente.");
			}
		}
	}
}