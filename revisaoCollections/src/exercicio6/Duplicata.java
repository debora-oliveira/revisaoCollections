package exercicio6;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicata {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        lista.add("Ana");
        lista.add("Bruno");
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Bruno");
        lista.add("Daniel");

        Set<String> listaSemDuplicados = new TreeSet<>();
        listaSemDuplicados.addAll(lista);
        for (String list: listaSemDuplicados){
            System.out.println(list);
        }
    }
}
