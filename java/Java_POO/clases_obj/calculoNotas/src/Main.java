public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Jesus", 3.4, 4);
        System.out.println(estudiante1);
        estudiante1.getNota(1);
        estudiante1.getNota(2);
        estudiante1.calculaNota();

    }
}