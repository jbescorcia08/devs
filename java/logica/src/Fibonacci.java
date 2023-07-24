public class Fibonacci {
   public static void main(String[] args) {
    int numero = 19;
    System.out.println("Serie FIbonacci: "+numero+" Secuencia.");
    int[] secuencia_fibonacci = serieFibonacci(numero);
    for (int n : secuencia_fibonacci) {
        System.out.print(" "+n+" ");
    }
    System.out.println("\n");
   }

   static int[] serieFibonacci(int n){
    if(n < 0){
        return new int[0];
    }
    int[] fibonacci = new int[n];
    fibonacci[0] = 0;

    if(n >= 2){
        fibonacci[1] = 1;
    }
    for (int i = 2; i < n; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i -2];
    }
    
    return fibonacci;
   }
}
