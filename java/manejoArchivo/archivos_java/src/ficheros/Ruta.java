package ficheros;

import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sistemas
 */
public class Ruta {
    public static void main(String[] args) {
        
        File ruta = new File("fichero");
        
        System.out.println(ruta.getAbsolutePath());
        System.out.println(ruta.exists());
        
    }
}
