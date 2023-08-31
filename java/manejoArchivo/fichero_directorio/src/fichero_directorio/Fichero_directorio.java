
package fichero_directorio;

//@author Sistemas

import java.io.File;


public class Fichero_directorio {

    public static void main(String[] args) {
        // manejo de archivos
        
        File fichero = new File("bin");
        
        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.isDirectory());
        
    }

}
