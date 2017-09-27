




package cv.mikusher.estruturadados.vetor.teste;





import cv.mikusher.estruturadados.vetor.Vetor;





public class Aula6 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);
        vetor.adiciona3("elemento1");
        vetor.adiciona3("elemento2");
        vetor.adiciona3("elemento3");

        System.out.println(vetor.busca("elemento3"));
        System.out.println(vetor.busca2("elemento3"));
        System.out.println(vetor.busca2("elemento5"));

    }

}
