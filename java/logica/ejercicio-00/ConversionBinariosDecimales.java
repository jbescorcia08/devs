import javax.swing.*;

public class ConversionBinariosDecimales {

    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Conversion: " +
                "\n1. Binario a Decimal." +
                "\n2. Decimal a Binario."));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero: "));

        switch (opcion) {
            case 1:
                String decimalResult = binarioADecimal(numero);
                System.out.println(decimalResult);
                break;
            case 2:
                String binarioResult = decimalABinario(numero);
                System.out.println(binarioResult);
                break;
            default:
                System.out.println("Error :(");
        }
    }

    static String binarioADecimal(int numero) {
        String binario = String.valueOf(numero);
        int decimal = 0;

        for (int i = 0; i < binario.length(); i++) {
            int bit = Character.getNumericValue(binario.charAt(i));
            decimal += bit * Math.pow(2, binario.length() - 1 - i);
        }

        return String.valueOf(decimal);
    }

    static String decimalABinario(int numero) {
        if (numero > 0) {
            StringBuilder binario = new StringBuilder();

            while (numero != 0) {
                int modulo = numero % 2;
                numero = numero / 2;

                binario.insert(0, modulo);
            }

            return binario.toString();
        }
        return null;
    }
}
