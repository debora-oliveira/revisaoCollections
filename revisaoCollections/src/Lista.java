import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carla"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Leia"));
        lista.add(new Usuario("Leonor"));

        System.out.println(lista.get(3));

        System.out.println(lista.remove(1));
        for (Usuario u:lista){
            System.out.println(u.nome);
        }
    }
}
