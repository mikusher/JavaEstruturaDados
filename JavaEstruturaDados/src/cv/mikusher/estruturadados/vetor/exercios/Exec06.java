




package cv.mikusher.estruturadados.vetor.exercios;





import java.util.Scanner;

import cv.mikusher.estruturadados.vetor.Lista;
import cv.mikusher.estruturadados.vetor.teste.Contato;





/**
 * 
 * @author Luis Tavares
 *         1 - criar um menu para o utilizador escolher as opções
 * 
 */

public class Exec06 {

    public static void main(String[] args) {

        // criar as variaveis necessarias
        Scanner scan = new Scanner(System.in);

        // criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<>(20);

        // criar e adicionar contatos
        criarContaticosDinamicamente(5, lista);

        // criar um menu que o utilizador escolhe as opções
        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicaoFinal(scan, lista);
                    break;
                case 3:
                    obterContatoPosicao(scan, lista);
                    break;
                case 4:
                    obterContato(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPorPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;

                default:
                    break;
            }
        }
    }





    // criar menu
    private static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        String entrada;
        int opcao = 0;

        while (!entradaValida) {
            System.out.println("Indica a opção:");
            System.out.println("1 - Aciciona no Final");
            System.out.println("2 - Aciciona em uma posição de escolha");
            System.out.println("3 - Consultar Contato");
            System.out.println("4 - Buscar");
            System.out.println("5 - Consultar ultimo indice");
            System.out.println("6 - Verificar se contato existe");
            System.out.println("7 - Remove na Posição");
            System.out.println("8 - Excluir contato");
            System.out.println("9 - Verificar o tamanho do Vetor");
            System.out.println("10 - Excluir tudo");
            System.out.println("11 - Imprimir vetor");
            System.out.println();
            System.out.println("0 - Sair do Menu");
            System.out.println();

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                //
                System.out.println("Entrada invalida\n\n");
            }

        }
        return opcao;
    }





    // ler as informações passada pelo utilizador
    private static String lerInformacao(String msg, Scanner scan) {

        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;
    }





    // ler as informações passada pelo utilizador - posição
    private static int lerInformacaoInt(String msg, Scanner scan) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scan.nextLine();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                //
                System.out.println("Entrada invalida");
            }
        }
        return num;
    }





    // as opções do utilizador para ser chamado no menu
    // adicionar contato
    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {

        System.out.println("Criando um contato, indica as informações: ");
        String nome, telefone, email;
        nome = lerInformacao("Indica o nome: ", scan);
        telefone = lerInformacao("Indica o telefone: ", scan);
        email = lerInformacao("Indica o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        lista.adiciona3(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }





    // adicionar contato em uma determinada posição
    private static void adicionarContatoPosicaoFinal(Scanner scan, Lista<Contato> lista) {

        System.out.println("Criando um contato, indica as informações: ");
        String nome, telefone, email;
        nome = lerInformacao("Indica o nome: ", scan);
        telefone = lerInformacao("Indica o telefone: ", scan);
        email = lerInformacao("Indica o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        int pos = lerInformacaoInt("Indica a posicao: ", scan);

        try {
            lista.adiciona3(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida, contato não adicionado");
        }

    }





    // consultar <obter> contato de uma posicao
    private static void obterContatoPosicao(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição de pesquisa: ", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Informações do Contato: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // consultar <obter> a posição de um contato
    private static void obterContato(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição de pesquisa: ", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Informações do Contato: ");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa da posição...");
            pos = lista.buscaIDelemento(contato);
            System.out.println("Posição do contato é " + pos);
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // consultar o ultimo indice
    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição de pesquisa: ", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Informações do Contato: ");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do ultimo indice do contato...");
            pos = lista.ultimoIndice(contato);
            System.out.println("Indice do contato é " + pos);
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // consultar se contato existe
    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição de pesquisa: ", scan);

        try {
            Contato contato = lista.busca(pos);
            boolean existe = lista.contem(contato);

            if (existe) {
                System.out.println("Informações do Contato: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // excluir por posição
    private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição a ser removida: ", scan);

        try {

            lista.remove(pos);
            System.out.println("Contato Excluido!");
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // excluir contato
    private static void excluirContato(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição a ser removida: ", scan);

        try {
            Contato contato = lista.busca(pos);
            lista.remove(contato);

            System.out.println("Contato Excluido!");
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // imprimir o tamanho do vetor
    private static void imprimeTamanhoVetor(Lista<Contato> lista) {

        System.out.println("Tamanho do vetor é de " + lista.tamanho());
    }





    // limpar o vetor
    private static void limparVetor(Lista<Contato> lista) {

        lista.removeAll();
        System.out.println("Todos os contatos removidos");
    }





    // imprimir o vetor
    private static void imprimirVetor(Lista<Contato> lista) {

        System.out.println("Imprimindo a Lista: ");
        System.out.println(lista);
    }





    // criar contato dinamicamento
    private static void criarContaticosDinamicamente(int quantidadeContatos, Lista<Contato> lista) {

        Contato contato = new Contato();

        for (int i = 1; i < quantidadeContatos; i++) {
            contato = new Contato();
            contato.setNome("Contato_" + i);
            contato.setTelefone("123-567-0" + i);
            contato.setEmail("contato_" + i + "@email.com");

            lista.adiciona3(contato);
        }
    }
}
