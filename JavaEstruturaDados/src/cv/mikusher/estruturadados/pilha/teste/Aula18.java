




package cv.mikusher.estruturadados.pilha.teste;





import java.util.Stack;

import cv.mikusher.estruturadados.pilha.Pilha;





/**
 * 
 * @author Luis Tavares
 *         verificar a classe Stack
 */
public class Aula18 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        // empilhar
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);

        System.out.println(stack.peek()); // espiar a pilha

        System.out.println(stack.pop()); // desempilha elemento

        System.out.println(stack);

    }

}
