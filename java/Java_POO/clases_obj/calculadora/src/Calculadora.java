public class Calculadora {
    private int numero1;
    private int numero2;


    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }


    public int suma(){
        return numero1 + numero2;
    }
    public int resta(){
        return numero1 - numero2;
    }

    public int multplicacion(){
        return numero1 * numero2;
    }

    public int divicion(){
        return numero1 / numero2;
    }
}
