




package cv.mikusher.estruturadados.vetor.teste;





import java.util.ArrayList;





public class Aula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        // poderia criar diretamente e não como objecto
        Object letraPesquisa, indx;
        final String PESQ = "B";

        // adicionado elementos em um array
        arrayList.add("A");
        arrayList.add(1, "B");
        arrayList.add("C");
        arrayList.add("D");

        System.out.println(arrayList);

        // validar a existencia do PESQ = C, em index de posição como o valor atribuido
        letraPesquisa = arrayList.contains(PESQ) ? true : false;
        indx = arrayList.indexOf(PESQ);

        if ((boolean) letraPesquisa && (int) indx > -1) {
            System.out.println("Contem, na posição " + indx);
        } else {
            System.out.println("Não Contem, na posição " + indx);
        }

        // removendo elentos do array
        arrayList.remove(0);
        arrayList.remove(PESQ);
        System.out.println(arrayList);

        // validando outra vez o conteudo do array
        int pos = arrayList.indexOf(PESQ);
        if (pos > -1) {
            System.out.println("Elemento " + PESQ + " existe " + pos);

        } else {
            System.out.println("Elemento " + PESQ + " não existe, vai ser adicionado na posição " + (pos + 1));
            arrayList.set((pos + 1), PESQ);
            System.out.println(arrayList);
        }
    }

}
