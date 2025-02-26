import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Roberto");
        users.put(20, "Ricardo");
        users.put(3, "Rafaela");
        users.put(4, "Rebeca");

        System.out.println(users.size());
        System.out.println(users.isEmpty());

        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(20));
        System.out.println(users.containsValue("Rebeca"));

        System.out.println(users.get(4));
        System.out.println(users.remove(1));
        System.out.println(users.remove(4, "Gui"));

        for(int chave: users.keySet()) {
            System.out.println(chave);
        }

        for(String valor: users.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: users.entrySet()) {
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
    }
}
