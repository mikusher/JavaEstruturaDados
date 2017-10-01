




package cv.mikusher.estruturadados.pilha.exercicios;





import java.util.Scanner;

import cv.mikusher.estruturadados.pilha.Pilha;





public class Exec02_vL {

    public static void main(String[] args) {

        Pilha<Integer> Impar = new Pilha<>();
        Pilha<Integer> Par = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Indica um valor: ");
            Integer numero = scan.nextInt();
            System.out.println();

            if (numero == 0) {
                // pilha par
                Integer desempilhado = Par.desimpilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Remover da pilha par " + desempilhado);
                }

                // pilha impar
                desempilhado = Impar.desimpilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Remover da pilha impar " + desempilhado);
                }

            } else if (numero % 2 == 0) {
                System.out.println("Empilhando no Par " + numero);
                Par.empilha(numero);
            } else {
                System.out.println("Empilhando no Impar " + numero);
                Impar.empilha(numero);
            }
        }

        System.out.println("Desempilhando tudo");
        while (!Par.estaVazia() && !Impar.estaVazia()) {
            System.out.println("Remover um elemento da pilha Par " + Par.desimpilha());
            System.out.println("Remover um elemento da pilha Impar " + Impar.desimpilha());
        }
    }
}
