




package cv.mikusher.estruturadados.fila.teste;





import cv.mikusher.estruturadados.fila.Fila;





public class Aula19 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();
        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
        System.out.println(fila.toString());
        System.out.println(fila.espiar());
        fila.desenfileirar();
        System.out.println(fila.espiar());
        System.out.println(fila.toString());
    }

}
