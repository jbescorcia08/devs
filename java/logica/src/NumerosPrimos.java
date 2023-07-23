public class NumerosPrimos {
    public static void main(String[] args) {

        String result = numeroPrimo(5);
        System.out.println(result);
    }

    static String numeroPrimo(int n){
        int cont = 0;
        for (int i = 1; i <= n; i++) {
          if(n % i == 0){
              cont++;
          }
        }
        if(cont <= 2){
            return "El numero es primo";
        }else{
            return "El numero no es primo";
        }
    }
}
