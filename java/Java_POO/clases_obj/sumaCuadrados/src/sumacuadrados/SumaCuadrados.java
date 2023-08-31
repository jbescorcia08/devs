
package sumacuadrados;

//@author jesus

public class SumaCuadrados {
    
    double numero1;
    double numero2;
    double numero3;
    
    
    public SumaCuadrados(double numero1, double numero2,double numero3){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }
    
    public SumaCuadrados(){
        
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SumaCuadrados: ");
        sb.append("numero1: ").append(numero1);
        sb.append(", numero2: ").append(numero2);
        sb.append(", numero3: ").append(numero3);
        sb.append(' ');
        return sb.toString();
    }
    
    
    
    public void operacionCuadrados(){
        int suma;
        
        suma =(int) (Math.pow(numero1, 2) + Math.pow(numero2, 2) + Math.pow(numero3, 2));
        
        System.out.println("Suma de Cuadrados: "  + suma);
    }
    
    
    
    

}
