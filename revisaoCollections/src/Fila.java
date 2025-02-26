import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Offer e add adicionam elementos a fila
        fila.add("Brasil");
        fila.add("Canada");
        fila.offer("Espanha");
        fila.offer("Portugal");

        //peek e element obtem o proximo elmento
        System.out.println(fila.peek());
        System.out.println(fila.element());

        //poll e remove obtem o proximo elemento e remove da fila
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        System.out.println("Fila restante");
        //peek e element obtem o proximo elmento
        System.out.println(fila.peek());
        System.out.println(fila.element());
    }
}
