package capitulo4;

import java.util.Arrays;
import java.util.List;

public class Quicksort {

    public int soma(int[] arr) {
        return soma(arr, 0);
    }

    public int soma(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        } else {
            return arr[index] + soma(arr, index + 1);
        }
    }

    public int tamanhoLista(List<Integer> lista) {
        return tamanhoLista(lista, 0);
    }

    private int tamanhoLista(List<Integer> lista, int index) {
        if (index == lista.size()) {
            return 0;
        } else {
            return 1 + tamanhoLista(lista, index + 1);
        }
    }

    public int[] quicksort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int pivo = array[0];
        int[] menores = Arrays.stream(array).filter(i -> i < pivo).toArray();
        int[] maiores = Arrays.stream(array).filter(i -> i > pivo).toArray();

        int[] sortedMenores = quicksort(menores);
        int[] sortedMaiores = quicksort(maiores);

        int[] result = new int[sortedMenores.length + 1 + sortedMaiores.length];
        System.arraycopy(sortedMenores, 0, result, 0, sortedMenores.length);
        result[sortedMenores.length] = pivo;
        System.arraycopy(sortedMaiores, 0, result, sortedMenores.length + 1, sortedMaiores.length);

        return result;
    }

}
