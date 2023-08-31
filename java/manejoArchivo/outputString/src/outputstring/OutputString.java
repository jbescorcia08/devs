
package outputstring;

//@author Sistemas

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OutputString {
    
    
    public static void escribir(){
        try(OutputStream file = new FileOutputStream("archivo.txt", true)){
            String saludo = "Hola mundo\r\n";
            
            byte[] byteSaludo = saludo.getBytes();
            for (int i = 0; i < byteSaludo.length; i++) {
                byte b = byteSaludo[i];
                System.out.println(b);
                
            }
            file.write(byteSaludo);
            
            file.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OutputString.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OutputString.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        escribir();
        try {
            FileInputStream file = new FileInputStream("archivo_2.txt");
            String saludo = "bien y tu?";
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OutputString.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
