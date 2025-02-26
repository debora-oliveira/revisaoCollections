import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilhermina"));

        boolean resultado = usuarios.contains(new Usuario("Guilhermina"));
        System.out.println(resultado);
    }
}
