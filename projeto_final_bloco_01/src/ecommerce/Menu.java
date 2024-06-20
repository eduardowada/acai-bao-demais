package ecommerce;

import ecommerce.controller.ProdutoController;
import ecommerce.model.Acai;
import ecommerce.model.AcaiBranco;
import ecommerce.model.AcaiPuro;
import ecommerce.model.AcaiTrufado;
import ecommerce.model.Produto;
import ecommerce.util.Cores;

import java.util.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoController controller = new ProdutoController();
        int opcao;

        /*
         Exemplo de Criação 1:
         ID: 1
         Nome: Copo da Felicidade
         Preço: 15 
         Tamanho: Grande
         Tipo: 3*/
        
        /*
        Exemplo de Criação 2:
        ID: 2
        Nome: Copo Espanta Tristeza
        Preço: 20
        Tamanho: Médio
        Tipo: 2*/
        
        while (true) {
            System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND
                    + "*****************************************************");
            System.out.println("                                                     ");
            System.out.println("      CADASTRO DE E-COMMERCE: AÇAÍ" +Cores.TEXT_YELLOW_BOLD_BRIGHT + " BÃO" + Cores.TEXT_GREEN_BOLD_BRIGHT + " DEMAIS!       ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar Produto                    ");
            System.out.println("            2 - Listar Produtos                      ");
            System.out.println("            3 - Buscar Produto por Numero            ");
            System.out.println("            4 - Atualizar Produto                    ");
            System.out.println("            5 - Deletar Produto                      ");
            System.out.println("            6 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     " + Cores.TEXT_RESET);

            try {
            	opcao = sc.nextInt();
            	sc.nextLine();
            } catch (InputMismatchException e) {
            	System.out.println("Entrada Inválida. Por favor, digite uma opção válida.");
            	sc.nextLine();
            	continue;
            }
            

            if (opcao == 6) {
                System.out.println(Cores.TEXT_WHITE_BOLD + "\nAçaí bão demais - NOSSA! BÃO DEMAIS SÔ");
                sobre();
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Produto \n\n");
                    cadastrarProduto(controller, sc);
                    break;
                case 2:
                    System.out.println("Listar Produtos \n\n");
                    listarProdutos(controller);
                    break;
                case 3:
                    System.out.println("Buscar Produto por Numero \n\n");
                    buscarProduto(controller, sc);
                    break;
                case 4:
                    System.out.println("Atualizar Produto \n\n");
                    atualizarProduto(controller, sc);
                    break;
                case 5:
                    System.out.println("Deletar Produto\n\n");
                    deletarProduto(controller, sc);
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    private static void cadastrarProduto(ProdutoController controller, Scanner sc) {
        System.out.println("\nDigite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("\nDigite o preço do produto: ");
        double preco = sc.nextDouble();
        
        int tipo;
        do {
        	
            System.out.println("\nEscolha o tipo de açaí:");
            System.out.println("1 - Açaí Puro");
            System.out.println("2 - Açaí Trufado");
            System.out.println("3 - Açaí Branco");
            tipo = sc.nextInt();
        } while (tipo < 1 || tipo > 3);
        
        int tamanho = 0;
		do {
        	System.out.println("\nDigite o tamanho do produto: ");
        	System.out.println("1 - Pequeno");
        	System.out.println("2 - Médio");
        	System.out.println("3 - Grande");
        	tamanho = sc.nextInt();
        } while (tamanho < 1 || tamanho > 3);
        

        Produto produto;
        int id = 0;
		switch (tipo) {
            case 1:
                produto = new AcaiPuro(id, nome, preco, tamanho);
                break;
            case 2:
                produto = new AcaiTrufado(id, nome, preco, tamanho);
                break;
            case 3:
                produto = new AcaiBranco(id, nome, preco, tamanho);
                break;
            default:
                System.out.println("Tipo de produto inválido!");
                return;
        }

        controller.adicionarProduto(produto);
    }

    private static void listarProdutos(ProdutoController controller) {
        for (Produto produto : controller.listarProdutos()) {
            System.out.println(produto);
        }
    }

    private static void buscarProduto(ProdutoController controller, Scanner sc) {
        System.out.println("Digite o ID do produto: ");
        int id = sc.nextInt();
        Produto produto = controller.buscarProdutoPorId(id);
        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void atualizarProduto(ProdutoController controller, Scanner sc) {
        System.out.println("Digite o ID do produto a ser atualizado: ");
        int id = sc.nextInt();
        Produto produto = controller.buscarProdutoPorId(id);
        if (produto != null) {
            sc.nextLine(); // Consumir a nova linha
            System.out.println("\nDigite o novo nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("\nDigite o novo preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine(); // Consumir a nova linha
            int tamanho = 0;
			do {
            	System.out.println("\nDigite o tamanho do produto: ");
            	System.out.println("1 - Pequeno");
            	System.out.println("2 - Médio");
            	System.out.println("3 - Grande");
            	tamanho = sc.nextInt();
            } while (tamanho < 1 || tamanho > 3);
            
            
            ((Acai) produto).setTamanho(tamanho);
            produto.setNome(nome);
            produto.setPreco(preco);
            controller.atualizarProduto(produto);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void deletarProduto(ProdutoController controller, Scanner sc) {
        System.out.println("Digite o ID do produto a ser deletado: ");
        int id = sc.nextInt();
        controller.deletarProduto(id);
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Eduardo Wada");
        System.out.println("https://github.com/eduardowada/acai-bao-demais.git");
        System.out.println("Projeto para o Bootcamp da Generation Brasil");
        System.out.println("Projeto desenvolvido para avaliação final do módulo 1.");
        System.out.println("*********************************************************");
    }
}
