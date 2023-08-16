package vehiculo;

public class Automoviles {
    public static void main(String[] args){
        Vehiculo nissan = new Vehiculo("Nissan","A324",2019);
        System.out.println(nissan);
        nissan.setAnio(2023);
        System.out.println(nissan);
    }
}
