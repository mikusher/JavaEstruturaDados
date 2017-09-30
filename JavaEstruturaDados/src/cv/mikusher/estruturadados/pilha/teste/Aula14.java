




package cv.mikusher.estruturadados.pilha.teste;





import cv.mikusher.estruturadados.pilha.Pilha;





public class Aula14 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println("Pilha Vazia: " + pilha.estaVazia());

        for (int i = 1; i <= 10; i++) {
            pilha.empilha(i);
        }
        System.out.println("Tamanho da Pilha: " + pilha.tamanho());
        System.out.println("Elementos da Pilha: " + pilha);
        System.out.println("Pilha Vazia: " + pilha.estaVazia());
        pilha.empilha(11);
        pilha.empilha(12);
        pilha.empilha(13);
        pilha.desimpilha();

        System.out.println("Espiar o topo da pilha: " + pilha.topo());
    }
}