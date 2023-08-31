import java.util.ArrayList;

public class EliminarDuplicado {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);
        lista.add(3);
        lista.add(5);
        lista.add(6);
        lista.add(5);

        eliminarDuplicados(lista);
        System.out.println(lista);
    }

    static void eliminarDuplicados(ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 1; j < lista.size(); j++) {
                if(i != j){
                    if(lista.get(i) == lista.get(j)){
                        lista.remove(j);
                    }
                }
            }
        }
    }

}
