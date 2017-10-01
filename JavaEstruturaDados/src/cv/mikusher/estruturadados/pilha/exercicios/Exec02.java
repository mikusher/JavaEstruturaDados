




package cv.mikusher.estruturadados.pilha.exercicios;





import java.util.Scanner;

import cv.mikusher.estruturadados.pilha.Pilha;





public class Exec02 {

    public static void main(String[] args) {

        Pilha<Integer> pilhaImpar = new Pilha<>();
        Pilha<Integer> pilhaPar = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        boolean flagGeralVazio = false;
        for (int i = 1; i < 10; i++) {
            System.out.println("Indica um valor: ");
            Integer numero = scan.nextInt();
            System.out.println();

            if (numero == 0) {
                String checkPar = (pilhaPar.estaVazia() && pilhaImpar.estaVazia()) ? "Vazia" : "Contem";

                switch (checkPar) {
                    case "Vazia":
                        System.out.println("Esta vazia");
                        flagGeralVazio = true;
                        break;

                    case "Contem":
                        System.out.println("Desempilhando um elemento de cada pilha");
                        pilhaPar.desimpilha();
                        pilhaImpar.desimpilha();
                        System.out.println("Par: " + pilhaPar + "\nImpar: " + pilhaImpar);
                        break;

                    default:
                        System.out.println("! Erro desconhecido");
                        break;
                }

            } else {
                if (numero % 2 == 0) {
                    pilhaPar.empilha(numero);
                    System.out.println(numero + " empilhado na Pilha Par");
                } else {
                    pilhaImpar.empilha(numero);
                    System.out.println(numero + " empilhado na Pilha Impar");
                }
            }
        }
        if (!flagGeralVazio) {
            System.out.println("Desempilhando todos os elementos");
            while (!pilhaPar.estaVazia() && !pilhaImpar.estaVazia()) {
                System.out.println("Desempilhando um elemento da pilha Par " + pilhaPar.desimpilha());
                System.out.println("Desempilhando um elemento da pilha Impar " + pilhaImpar.desimpilha());
            }
        } else {
            System.out.println("Pilhas Limpas");
        }
        System.out.println("Par: " + pilhaPar + "\nImpar: " + pilhaImpar);

    }

}
