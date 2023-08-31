public class ContVocales {
    public static void main(String[] args) {
        int contVocal = contVocales("Jesus");
        System.out.println("Cantidad de vocales: "+contVocal);

    }



    static int contVocales(String cadena){
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if( cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e'||cadena.charAt(i) == 'i' || cadena.charAt(i) == '0'||cadena.charAt(i) == 'u')
            cont++;
        }
        return cont;
        
    }
}
