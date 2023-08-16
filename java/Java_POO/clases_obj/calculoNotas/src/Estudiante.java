public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;


    public Estudiante() {
        this.nombre = null;
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getNota(int nota) {
        if(nota > 0){
            switch (nota){
                case 1:
                    System.out.println(nota1);
                    break;
                case 2:
                    System.out.println(nota2);
                    break;
                default:
                    System.out.println("Nota no valida...");
            }
        }

    }


    public void calculaNota(){
        double totalNota = (nota1 + nota2) / 2;
        System.out.println(totalNota);
    }

    @Override
    public String toString() {
        return "Estudiante:\n" +
                "nombre: '" + nombre + '\'' +
                ", nota1: " + nota1 +
                ", nota2: " + nota2 +
                '}';
    }
}
