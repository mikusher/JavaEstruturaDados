




package cv.mikusher.estruturadados.vetor.teste;





import cv.mikusher.estruturadados.vetor.Vetor;





public class Aula3 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);
        Vetor vetor2 = new Vetor(2);
        Vetor vetor3 = new Vetor(3);

        vetor.adiciona("elemento1");
        vetor.adiciona("elemento2");

        try {
            vetor2.adicionar2("elemento3");
            vetor2.adicionar2("elemento4");
            // vetor2.adicionar2("elemento5");
            // vetor2.adicionar2("elemento6");
        } catch (Exception e) {
            //
            e.printStackTrace();
        }

        vetor3.adiciona3("elemento7");
        vetor3.adiciona3("elemento8");
        vetor3.adiciona3("elemento9");
    }

}
