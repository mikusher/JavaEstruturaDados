




package cv.mikusher.estruturadados.vetor.teste;





import cv.mikusher.estruturadados.vetor.Vetor;





public class Aula5 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);
        vetor.adiciona3("elemento1");
        vetor.adiciona3("elemento2");
        vetor.adiciona3("elemento3");

        System.out.println(vetor.busca(2));
        System.out.println(vetor.busca(3));
        System.out.println(vetor.busca(5));

    }

}
