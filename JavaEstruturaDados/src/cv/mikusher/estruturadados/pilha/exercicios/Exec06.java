




package cv.mikusher.estruturadados.pilha.exercicios;





import java.util.Stack;





/**
 * 
 * @author Luis Tavares
 *         Validar a expressão matematica se é valida
 */
public class Exec06 {

    public static void main(String[] args) {

        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("{[()])[]()(}{[()]}");
        imprimeResultado("{[()]}[](){}{[()]}");
        imprimeResultado("{[(2 + 1)])[2 + 2]()(}{[2 * (1 + 5)]}");
    }





    public static void imprimeResultado(String expressao) {

        System.out.println(expressao + " esta balanceada? " + verificarBalanceado(expressao));
    }





    static final String ABRE  = "([{«";
    static final String FECHA = ")]}»";





    public static boolean verificarBalanceado(String expressao) {

        boolean balanceado = true;
        Stack<Character> pilha = new Stack<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.add(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.isEmpty()) {
                    return false;
                }
                topo = pilha.pop();

                if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                    return false;
                }
            }

            index++;
        }
        return true;
    }
}
