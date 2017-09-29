




package cv.mikusher.estruturadados.vetor.teste;





import cv.mikusher.estruturadados.vetor.Lista;





public class Aula11 {

    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<Contato>(2);

        Contato c1 = new Contato("Contato 1", "123423", "cont1@mail.com");
        Contato c2 = new Contato("Contato 2", "223423", "cont2@mail.com");
        Contato c3 = new Contato("Contato 3", "333423", "cont3@mail.com");

        vetor.adiciona3(c1);
        vetor.adiciona3(c2);
        vetor.adiciona3(c3);

        System.out.println(vetor);
    }

}
