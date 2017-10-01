




package cv.mikusher.estruturadados.pilha.exercicios;





import java.util.Stack;





public class Exec04 {

    public static void main(String[] args) {

        Stack<Livro> pilha = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("La Bita");
        livro1.setAutor("Luis");
        livro1.setAnoLancamento("2012");
        livro1.setIsbn("0392423");

        Livro livro2 = new Livro();
        livro2.setNome("La Bita II");
        livro2.setAutor("Helio");
        livro2.setAnoLancamento("2014");
        livro2.setIsbn("0392423");

        Livro livro3 = new Livro();
        livro3.setNome("A vida");
        livro3.setAutor("Miguel");
        livro3.setAnoLancamento("2015");
        livro3.setIsbn("0392423");

        Livro livro4 = new Livro();
        livro4.setNome("Viagem");
        livro4.setAutor("Amilcar");
        livro4.setAnoLancamento("2011");
        livro4.setIsbn("0392423");

        Livro livro5 = new Livro();
        livro5.setNome("Pensamento");
        livro5.setAutor("Tavares");
        livro5.setAnoLancamento("2010");
        livro5.setIsbn("0392423");

        Livro livro6 = new Livro();
        livro6.setNome("Estrutura");
        livro6.setAutor("Neves");
        livro6.setAnoLancamento("2017");
        livro6.setIsbn("0392423");

        System.out.println("A pilha esta vazia? " + pilha.isEmpty());

        System.out.println("Empilhando os livros");
        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        pilha.push(livro6);

        System.out.println(pilha.size() + " livros foram empilhado");
        System.out.println(pilha);

        System.out.println("A pilha esta vazia? " + pilha.isEmpty());
        System.out.println();
        System.out.println("Espiando o topo da pilha de livros " + pilha.peek());

        System.out.println("Desempilhando os livros");
        while (!pilha.isEmpty()) {
            System.out.println("Removendo livro: " + pilha.pop());
        }
        System.out.println("Todos os livros removidos: " + pilha + " \nPilha Limpa: " + pilha.isEmpty());
    }

}
