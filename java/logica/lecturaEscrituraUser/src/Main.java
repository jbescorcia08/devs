import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";

        System.out.println("Ingresa tu nombre: ");
        nombre = br.readLine();

        System.out.printf("HOLA, %s",nombre);

    }
}