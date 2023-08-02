import java.util.ArrayList;

public class NumereosPrimosNaN {
    public static void main(String[] args) {
        numerosPrimos(2, 54);
    }

    static Boolean esPrimo(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void numerosPrimos(int ni, int nf) {

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = ni; i <= nf; i++) {
            if (esPrimo(i)) {
                numeros.add(i);
            }
        }
        System.out.println(numeros);
    }
}
