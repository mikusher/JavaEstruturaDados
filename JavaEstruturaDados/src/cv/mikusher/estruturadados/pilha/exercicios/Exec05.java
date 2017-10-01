




package cv.mikusher.estruturadados.pilha.exercicios;





import java.util.Stack;





/**
 * 
 * @author Luis Tavares
 *         indicar se uma palavra é palindromo
 */
public class Exec05 {

    public static void main(String[] args) {

        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCcba");
        imprimeResultado("Luis");

    }





    public static void imprimeResultado(String palavra) {

        System.out.println(palavra + " é palindromo? - " + testaPalindromo(palavra));
    }





    public static boolean testaPalindromo(String palavra) {
        // ADA
        // [A]
        // [D]
        // [A]

        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < palavra.length(); i++) {
            pilha.add(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }
        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }
}
