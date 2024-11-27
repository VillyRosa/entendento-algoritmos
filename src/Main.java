import capitulo4.Quicksort;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quicksort quicksort = new Quicksort();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(quicksort.soma(arr));
        List<Integer> lista = List.of(1, 2, 3, 4, 5);
        System.out.println(quicksort.tamanhoLista(lista));
    }
}