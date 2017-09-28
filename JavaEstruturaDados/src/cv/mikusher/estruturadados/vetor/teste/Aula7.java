




package cv.mikusher.estruturadados.vetor.teste;





import cv.mikusher.estruturadados.vetor.Vetor;





public class Aula7 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona3("B");
        vetor.adiciona3("C");
        vetor.adiciona3("E");
        vetor.adiciona3("F");
        vetor.adiciona3("G");

        System.out.println(vetor);

        vetor.adiciona3(0, "A");
        System.out.println(vetor);

        vetor.adiciona3(3, "D");
        System.out.println(vetor);

    }

}
