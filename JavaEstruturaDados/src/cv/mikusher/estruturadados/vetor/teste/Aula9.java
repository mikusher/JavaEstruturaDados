




package cv.mikusher.estruturadados.vetor.teste;





import cv.mikusher.estruturadados.vetor.Vetor;





public class Aula9 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);
        vetor.adiciona3("elemento1");
        vetor.adiciona3("elemento2");
        vetor.adiciona3("elemento3");
        vetor.adiciona3("elemento4");
        vetor.adiciona3("elemento5");
        vetor.adiciona3("elemento6");
        vetor.adiciona3("elemento7");
        vetor.adiciona3("elemento8");
        vetor.adiciona3("elemento9");
        vetor.adiciona3("elemento10");

        System.out.println("Original: " + vetor);

        System.out.println("Removendo posição 5: " + vetor);
        vetor.remove(5);

        System.out.println(vetor);
        vetor.buscarRevomerElemento("elemento9");
        System.out.println("Removendo o elemento 9: " + vetor);

    }

}
