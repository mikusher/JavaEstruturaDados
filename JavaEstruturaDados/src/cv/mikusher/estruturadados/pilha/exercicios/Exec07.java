




package cv.mikusher.estruturadados.pilha.exercicios;





import java.util.Stack;





/**
 * 
 * @author Luis Tavares
 *         converter para binario
 */
public class Exec07 {

    public static void main(String[] args) {

        imprimirResultado(25);
        imprimirResultado(52421);
        imprimirResultado(12012);
        imprimirResultadoQualquerBase(25, 2);
        imprimirResultadoQualquerBase(25, 8);
        imprimirResultadoQualquerBase(25, 16);
        imprimirResultadoQualquerBase(52421, 8);
        imprimirResultadoQualquerBase(12012, 16);
    }





    public static void imprimirResultado(int numero) {

        System.out.println(numero + " em hexadecimal é " + decimalBinario(numero));
    }





    public static void imprimirResultadoQualquerBase(int numero, int base) {

        System.out.println(numero + " na base " + base + " é: " + decimalQualquerBase(numero, base));
    }





    public static String decimalBinario(int numero) {

        Stack<Integer> pilha = new Stack<>();
        String numeroBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero = numero / 2;
        }

        while (!pilha.isEmpty()) {
            numeroBinario += pilha.pop();
        }

        return numeroBinario;
    }





    public static String decimalQualquerBase(int numero, int base) {

        
        if (base>16) {
            throw new IllegalArgumentException();
        } else {

            Stack<Integer> pilha = new Stack<>();
            String numeroBase = "";
            int resto;
            String bases = "0123456789ABCDEF";

            while (numero > 0) {
                resto = numero % base;
                pilha.push(resto);
                numero = numero / base;
            }

            while (!pilha.isEmpty()) {
                numeroBase += bases.charAt(pilha.pop());
            }

            return numeroBase;
        }

    }
}
