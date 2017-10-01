




package cv.mikusher.estruturadados.vetor.exercios;





import java.util.ArrayList;
import java.util.Scanner;

import cv.mikusher.estruturadados.vetor.teste.Contato;





/**
 * 
 * @author Luis Tavares
 *         1 - criar um menu para o utilizador escolher as opções
 * 
 */

public class Exec07 extends Exec06 {

    public static void main(String[] args) {

        // criar as variaveis necessarias
        Scanner scan = new Scanner(System.in);

        // criar vetor com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<>(20);

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





    // as opções do utilizador para ser chamado no menu
    // adicionar contato
    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {

        System.out.println("Criando um contato, indica as informações: ");
        String nome, telefone, email;
        nome = lerInformacao("Indica o nome: ", scan);
        telefone = lerInformacao("Indica o telefone: ", scan);
        email = lerInformacao("Indica o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        lista.add(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }





    // adicionar contato em uma determinada posição
    private static void adicionarContatoPosicaoFinal(Scanner scan, ArrayList<Contato> lista) {

        System.out.println("Criando um contato, indica as informações: ");
        String nome, telefone, email;
        nome = lerInformacao("Indica o nome: ", scan);
        telefone = lerInformacao("Indica o telefone: ", scan);
        email = lerInformacao("Indica o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        int pos = lerInformacaoInt("Indica a posicao: ", scan);

        try {
            lista.add(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida, contato não adicionado");
        }

    }





    // consultar <obter> contato de uma posicao
    private static void obterContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição de pesquisa: ", scan);

        try {
            Contato contato = lista.get(pos);
            System.out.println("Informações do Contato: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // consultar <obter> a posição de um contato
    private static void obterContato(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição de pesquisa: ", scan);

        try {
            Contato contato = lista.get(pos);
            System.out.println("Informações do Contato: ");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa da posição...");
            pos = lista.indexOf(contato);
            System.out.println("Posição do contato é " + pos);
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // consultar o ultimo indice
    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição de pesquisa: ", scan);

        try {
            Contato contato = lista.get(pos);
            System.out.println("Informações do Contato: ");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do ultimo indice do contato...");
            pos = lista.lastIndexOf(contato);
            System.out.println("Indice do contato é " + pos);
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // consultar se contato existe
    private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição de pesquisa: ", scan);

        try {
            Contato contato = lista.get(pos);
            boolean existe = lista.contains(contato);

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
    private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição a ser removida: ", scan);

        try {

            lista.remove(pos);
            System.out.println("Contato Excluido!");
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // excluir contato
    private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Indica a posição a ser removida: ", scan);

        try {
            Contato contato = lista.get(pos);
            lista.remove(contato);

            System.out.println("Contato Excluido!");
        } catch (Exception e) {
            System.out.println("Posição invalida");
        }
    }





    // imprimir o tamanho do vetor
    private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {

        System.out.println("Tamanho do vetor é de " + lista.size());
    }





    // limpar o vetor
    private static void limparVetor(ArrayList<Contato> lista) {

        lista.clear();
        System.out.println("Todos os contatos removidos");
    }





    // imprimir o vetor
    private static void imprimirVetor(ArrayList<Contato> lista) {

        System.out.println("Imprimindo a Lista: ");
        System.out.println(lista);
    }





    // criar contato dinamicamento
    protected static void criarContaticosDinamicamente(int quantidadeContatos, ArrayList<Contato> lista) {

        Contato contato = new Contato();

        for (int i = 1; i < quantidadeContatos; i++) {
            contato = new Contato();
            contato.setNome("Contato_" + i);
            contato.setTelefone("123-567-0" + i);
            contato.setEmail("contato_" + i + "@email.com");

            lista.add(contato);
        }
    }
}
