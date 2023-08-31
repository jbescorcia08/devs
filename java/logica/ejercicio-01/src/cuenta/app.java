package cuenta;

// creando una variable por referencia, donde se guradara el objeto pasara a ser una variable

public class app {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta("Jesus","Barrios", 23);
        System.out.println(cuenta.getNombre());
    }
}
