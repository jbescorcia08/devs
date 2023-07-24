public class Palindroma {
    public static void main(String[] args) {

        boolean isPalindroma = cadena("anitalavalatina");
        if(isPalindroma == true){
            System.out.println("Es palidroma.");
        }else{
            System.out.println("No es palindroma");
        }
    }

    static Boolean cadena(String c){
        for (int i = 0, j = c.length() - 1; i < j ; i++, j--) {
            if(c.charAt(i) != c.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
