




package cv.mikusher.estruturadados.pilha.exercicios;





import java.util.Scanner;

import cv.mikusher.estruturadados.pilha.Pilha;





public class Exec01 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Indica um numero: ");
            int numeroEmpilhar = scan.nextInt();

            if (numeroEmpilhar % 2 == 0) {
                System.out.println("Empilhando o numero");
                pilha.empilha(numeroEmpilhar);
            } else {
                Integer numeroDesempilha = pilha.desimpilha();

                if (numeroDesempilha == null) {
                    System.out.println("Pilha vazia");
                } else {
                    System.out.println("Numero impar, desempilhando " + numeroDesempilha);
                }
            }
        }

        System.out.println("Todos os numeros lidos, desempilhando");
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha " + pilha.desimpilha());
        }
        System.out.println("Todos os elementos removidos");
    }
}
