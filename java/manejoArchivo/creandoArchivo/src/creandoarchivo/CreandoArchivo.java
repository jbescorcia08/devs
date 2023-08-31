package creandoarchivo;

//@author Sistemas
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreandoArchivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        File ruta = new File("C:/Users/Sistemas/Downloads/prueba/frase.txt");
        String archivo_ruta = ruta.getAbsolutePath();
        try {
            ruta.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(CreandoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        escribiendo(archivo_ruta);
        
        System.out.println("Eliminar -> 1. Salir -> 2.");
        if(sc.nextInt() == 1){
            eliminar(ruta);
            System.out.println("Eliminado...");
        }else{
            System.out.println("Saliendo.");
        }
    }

    public static void escribiendo(String ruta_arcivo) {
        String frase = "Hola, como estas ??";

        try {
            FileWriter escritura = new FileWriter(ruta_arcivo);
            
            
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }

            escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(CreandoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void eliminar(File ruta){
        ruta.delete();
    }
}
