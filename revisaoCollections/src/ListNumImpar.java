import java.util.ArrayList;
import java.util.List;

public class ListNumImpar {
    public static void main(String[] args) {

        List<Integer> listaImpar = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            listaImpar.add(i + 1);
        }

        listaImpar.removeIf(l -> l % 2 == 0);
        System.out.println(listaImpar);
    }
}
