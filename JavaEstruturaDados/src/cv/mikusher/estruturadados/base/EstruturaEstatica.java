




package cv.mikusher.estruturadados.base;





public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;





    // solução de acordo com o livro - Efective Java 2º Edition
    // solução para instanciar a propria classe
    public EstruturaEstatica(int capacidade) {

        // criar um vetor do tipo objeto e fazer o cast para o tipo que foi declarado
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }





    public EstruturaEstatica() {

        this(10);
    }





    // metodo para adicionar elemento
    public boolean verificarSeDisponivel() {

        boolean resultado = this.tamanho <= this.elementos.length ? true : false;

        if (resultado) {
            this.aumentaCapacidade();
        }
        return resultado;
    }





    // metodo para adicionar elemento
    protected boolean adiciona3(T elemento) {

        if (verificarSeDisponivel()) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }





    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {
            int tamanhoAumentado = (this.elementos.length * 2);
            T[] elementosNovos = (T[]) new Object[tamanhoAumentado];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }





    // inserir um elemento em qualquer posição do Vetor
    protected boolean adiciona3(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }

        this.aumentaCapacidade();
        // mover os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }





    public boolean estaVazia() {

        return this.tamanho == 0;
    }





    public int tamanho() {

        return this.tamanho;
    }





    // para apresentar os elementos de um vetor
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }

}
