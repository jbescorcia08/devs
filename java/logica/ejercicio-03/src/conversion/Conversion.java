package conversion;

public class Conversion {
    public static void main(String[] args) {
        int numero = 42;

        // obtenemos una cadena mediante el uso de valueOf o cambir el tipo de dato
        String cadena = String.valueOf(numero);

        System.out.println(String.valueOf(cadena));
        System.out.println(String.valueOf(numero));
    }
}
