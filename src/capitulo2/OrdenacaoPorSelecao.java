package capitulo2;

public class OrdenacaoPorSelecao {

    public int buscaMenor(int[] arr) {
        int menor = arr[0];
        int menor_indice = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
                menor_indice = i;
            }
        }
        return menor_indice;
    }

    public int[] ordenacaoPorSelecao(int[] arr) {
        int[] novoArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int menorIndice = buscaMenor(arr);
            novoArr[i] = arr[menorIndice];
            arr[menorIndice] = Integer.MAX_VALUE;
        }
        return novoArr;
    }

}
