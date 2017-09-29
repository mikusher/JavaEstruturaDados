




package cv.mikusher.estruturadados.vetor.teste;





import cv.mikusher.estruturadados.vetor.VetorObjectos;





public class Aula10 {

    public static void main(String[] args) {

        VetorObjectos vo = new VetorObjectos(3);
        Contato c1 = new Contato("Contato 1", "123423", "cont1@mail.com");
        Contato c2 = new Contato("Contato 2", "223423", "cont2@mail.com");
        Contato c3 = new Contato("Contato 3", "333423", "cont3@mail.com");
        Contato c4 = new Contato("Contato 4", "443423", "cont4@mail.com");
        Contato c5 = new Contato("Contato 4", "443423", "cont4@mail.com"); // repetindo o elemento anterior

        vo.adiciona3(c1);
        vo.adiciona3(c2);
        vo.adiciona3(c3);
        vo.adiciona3(c4);

        System.out.println("Tamanho: " + vo.tamanho());

        int pos = vo.buscaIDelemento(c5);
        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vo);

    }

}
