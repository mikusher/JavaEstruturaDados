




package cv.mikusher.estruturadados.fila;





import java.util.LinkedList;
import java.util.Queue;





// conceitos de Fila usando o Queue - FIFO
public class FilaQueue {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        System.out.println(fila.isEmpty());
        System.out.println(fila.size());
        fila.add(1);
        fila.add(2);
        fila.add(3);
        System.out.println(fila.isEmpty());
        System.out.println(fila.size());
        System.out.println(fila.toString());
        System.out.println(fila.peek()); // espiar
        fila.remove();
        System.out.println(fila.peek());
        System.out.println(fila.toString());
    }

}
