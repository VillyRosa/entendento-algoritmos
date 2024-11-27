package capitulo3;

public class Recursividade {

    public void regressiva(int i) {
        System.out.println(i);
        if (i <= 1) {
            return;
        } else {
            regressiva(i - 1);
        }
    }

    public int fat(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fat(n - 1);
        }
    }

}
