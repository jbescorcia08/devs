/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoFicheros;

import java.io.File;

/**
 *
 * @author Sistemas
 */
public class AccesoFicheros {
    
    public static void main(String[] args) {
        
        File ruta = new File("C:/Users/Sistemas/Downloads/prueba");
        
        System.out.println(ruta.getAbsolutePath());
        
        String[] ruta_archivos = ruta.list();
        
        for (int i = 0; i < ruta_archivos.length; i++) {
            System.out.println(ruta_archivos[i]);
            
            File f = new File(ruta.getAbsolutePath(), ruta_archivos[i]);
            
            if(f.isDirectory()){
                String[] archivo_sub = f.list();
                
                for (int j = 0; j < archivo_sub.length; j++) {
                    System.out.println(archivo_sub[j]);
                }
            }
        }
    }
    
    
    
}


