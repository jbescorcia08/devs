/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichero_directorio;

import java.io.File;

/**
 *
 * @author Sistemas
 */
public class archivos_directorio {
    public static void main(String[] args) {
       File ruta = new File("\\wsl$\\Ubuntu-18.04\\home\\jesus\\archivos");
       
       
        System.out.println(ruta.getAbsolutePath());
        
        if(ruta.isDirectory()){
            System.out.println("Existe un archivo");
        }
    }
}
