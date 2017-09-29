




package cv.mikusher.estruturadados.vetor;





public class VetorObjectos {

    private Object[] elementos;
    private int      tamanho;





    public VetorObjectos(int capacidade) {

        this.elementos = new Object[capacidade];
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
    public void adiciona(Object elemento) {

        this.aumentaCapacidade();

        for (int i = 0; i < elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }

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
    public void adicionar2(Object elemento) throws Exception {

        if (verificarSeDisponivel()) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vector Cheio, não foi possivel aumentar ");
        }
    }





    // metodo para adicionar elemento
    public boolean adiciona3(Object elemento) {

        if (verificarSeDisponivel()) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }





    // inserir um elemento em qualquer posição do Vetor
    public boolean adiciona3(int posicao, Object elemento) {

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
    public Object busca(int posicao) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }
        return this.elementos[posicao];
    }





    // returna um true ou false na busca - busca sequencial
    public boolean buscaElemento(Object elemento) {

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }





    // retorna a posição na busca - busca sequencial
    public int buscaIDelemento(Object elemento) {

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }





    // adicionar capacidade ao meu vetor
    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {
            int tamanhoAumentado = (this.elementos.length * 2);
            Object[] elementosNovos = new Object[tamanhoAumentado];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }





    // remover um elemento do vetor
    public void remove(int posicao) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }





    public void buscarRevomerElemento(Object elemento) {

        int _posicao = buscaIDelemento(elemento);

        if (_posicao > -1) {
            remove(_posicao);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }

}
