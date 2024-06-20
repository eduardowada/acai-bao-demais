package ecommerce;

import java.util.*;

import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  AÇAÍ BÃO DEMAIS!		     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar Produtos               	     ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Deletar Produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = sc.nextInt();
			
			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nAçaí bão demais - NOSSA! BÃO DEMAIS SÔ");
				sobre();
				sc.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto \n\n");
				
				break;
			case 2:
				System.out.println("Listar Produtos \n\n");
				
				break;
			case 3:
				System.out.println("Buscar Produto por Numero \n\n");
				
				break;
			case 4:
				System.out.println("Atualizar Produto \n\n");
				
				break;
			case 5:
				System.out.println("Deletar Produto\n\n");
				
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Eduardo Wada");
		System.out.println("https://github.com/eduardowada/acai-bao-demais.git");
		System.out.println("Projetro para o Bootcamp da Generation Brasil");
		System.out.println("Projeto desenvolvido para avaliação final do módulo 1.");
		System.out.println("*********************************************************");
	}
}
