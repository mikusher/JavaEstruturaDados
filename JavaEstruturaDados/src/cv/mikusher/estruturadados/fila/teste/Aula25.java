




package cv.mikusher.estruturadados.fila.teste;





import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import cv.mikusher.estruturadados.fila.Paciente;





public class Aula25 {

    public static void main(String[] args) {

        // forma 1
        Queue<Integer> filaComPrioridade = new PriorityQueue<>();
        filaComPrioridade.add(5);
        filaComPrioridade.add(1);
        filaComPrioridade.add(3);
        filaComPrioridade.add(2);

        System.out.println(filaComPrioridade);

        // forma 2
        Queue<Paciente> filaComPrioridadePacientes = new PriorityQueue<>();
        filaComPrioridadePacientes.add(new Paciente("Luis", 5));
        filaComPrioridadePacientes.add(new Paciente("Helio", 1));
        filaComPrioridadePacientes.add(new Paciente("Miguel", 3));
        filaComPrioridadePacientes.add(new Paciente("João", 2));

        System.out.println(filaComPrioridadePacientes);

        // forma 3 - passando uma classe anonima do Java
        Queue<Paciente> filaComPrioridadePacientesWth = new PriorityQueue<>(new Comparator<Paciente>() {

            @Override
            public int compare(Paciente p1, Paciente p2) {

                return Integer.valueOf(p1.getPrioridade())
                              .compareTo(p2.getPrioridade());
            }

        });

        filaComPrioridadePacientesWth.add(new Paciente("Luis", 5));
        filaComPrioridadePacientesWth.add(new Paciente("Helio", 1));
        filaComPrioridadePacientesWth.add(new Paciente("Miguel", 3));
        filaComPrioridadePacientesWth.add(new Paciente("João", 2));

        System.out.println(filaComPrioridadePacientesWth);

    }

}
