package datosUsuario;

import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println(String.format("Hola, %s", nombre));
    }

}
