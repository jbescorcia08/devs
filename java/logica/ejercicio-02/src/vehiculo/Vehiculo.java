package vehiculo;

public class Vehiculo {
    private String marca;
    private String placa;
    private int anio;

    public Vehiculo(String marca, String placa, int anio) {
        this.marca = marca;
        this.placa = placa;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", anio=" + anio +
                '}';
    }
}
