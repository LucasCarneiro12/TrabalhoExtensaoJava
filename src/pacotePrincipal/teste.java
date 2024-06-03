package pacotePrincipal;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
    			
		System.out.println("nome");
		String usuario = sc.nextLine();
		System.out.println("senha");
		String senha = sc.nextLine();
		System.out.println("acesso");
		String acesso = sc.nextLine();
		sc.close();    	
        Funcionario f = new Funcionario(usuario, senha, acesso);
        FuncionarioDao fdao = new FuncionarioDao();
        fdao.cadastrarFuncionario(f);
        
		    }
	}


