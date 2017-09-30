




package cv.mikusher.estruturadados.pilha;





import cv.mikusher.estruturadados.base.EstruturaEstatica;





public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {

        super();
    }





    public Pilha(int capacidade) {

        super(capacidade);
    }





    public void empilha(T elemento) {

        super.adiciona3(elemento);
    }





    public T desimpilha() {

        if (this.estaVazia()) {
            return null;
        }

        /*
         * T elemento = this.elementos[tamanho-1];
         * tamanho--;
         */
        return this.elementos[--tamanho];
    }





    public T topo() {

        if (this.estaVazia()) {
            return null;
        }
        return elementos[tamanho - 1];
    }

}
