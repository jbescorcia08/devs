import javax.swing.*;
/*
* Ejercicio 1 - Suma de números pares
Escribe una función que reciba un número entero positivo n como argumento y devuelva la suma de los primeros n números pares.
* */
public class SumaNumerosPares {
    public static void main(String[] args) {
        sumaNumerosPares();

    }

    static void sumaNumerosPares(){
        boolean seguir = true;
        int suma = 0;

        while (seguir != false){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            if(numero % 2 == 0){
                suma += numero;
            }else{
                JOptionPane.showMessageDialog(null, "Error !");
            }

            String Dseguir = JOptionPane.showInputDialog("Desea seguir? : ");

            if(Dseguir.equalsIgnoreCase("no")){
                seguir = false;
            }
        }

        JOptionPane.showMessageDialog(null, suma);
    }
}
