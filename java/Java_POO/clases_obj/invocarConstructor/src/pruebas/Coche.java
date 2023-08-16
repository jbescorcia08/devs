/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author jesus
 */
public class Coche {


    private String marca;
    private String modelo;
    private int capacidad;

    public Coche(String marca, String modelo) {
        this.marca = " ";
        this.modelo = " ";
    }

    public Coche(String marca, String modelo, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    

    @Override
    public String toString() {
        return "Coche: " + "marca: " + marca + ", modelo: " + modelo + ", capacidad: " + capacidad + ' ';
    }
    
    
    
    
    
}
