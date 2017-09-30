




package cv.mikusher.estruturadados.vetor.exercios;





import cv.mikusher.estruturadados.vetor.Lista;
import cv.mikusher.estruturadados.vetor.teste.Contato;





public class Exec {

    public static void main(String[] args) {

        Lista<Contato> vetorLista = new Lista<Contato>(2);

        Contato c1 = new Contato("Contato 1", "123423", "cont1@mail.com");
        Contato c2 = new Contato("Contato 2", "223423", "cont2@mail.com");
        Contato c3 = new Contato("Contato 3", "333423", "cont3@mail.com");

        vetorLista.adiciona3(c1);
        vetorLista.adiciona3(c2);
        vetorLista.adiciona3(c3);

        System.out.println(vetorLista);
        // vetorLista.removeAll();
        // System.out.println(vetorLista);
        // vetorLista.adiciona3(c1);
        // System.out.println(vetorLista);
        // System.out.println(vetorLista.tamanho());

        if (vetorLista.ultimoIndice() < 0) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("O ultimo elemento esta na posição " + vetorLista.ultimoIndice());
        }

    }

}
