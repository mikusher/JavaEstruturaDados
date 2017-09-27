




package cv.mikusher.estruturadados.vetor;





public class Vetor {

    private String[] elementos;
    private int      tamanho;





    public Vetor(int capacidade) {

        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }





    public int tamanho() {

        return this.tamanho;
    }





    /**
     * Metodo pode ser melhorado, exemplo simples em baixo
     * 
     * @param elemento
     */
    public void adiciona(String elemento) {

        for (int i = 0; i < elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }

    }





    // metodo para adicionar elemento
    public boolean verificarSeDisponivel() {

        boolean resultado = this.tamanho < this.elementos.length ? true : false;
        return resultado;
    }





    // metodo para adicionar elemento
    public void adicionar2(String elemento) throws Exception {

        if (verificarSeDisponivel()) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vector Cheio");
        }
    }





    // metodo para adicionar elemento
    public boolean adiciona3(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
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





    // fazer uma busca de elemento em um vetor
    public String busca(int posicao) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }
        return this.elementos[posicao];
    }
}
