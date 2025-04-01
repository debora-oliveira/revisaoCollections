package exercicio5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorCaracter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();
        scan.close();

        Map<Character, Integer> contagem = new HashMap<>();

        for (char c : palavra.toCharArray()) {
            contagem.put(c, contagem.getOrDefault(c, 0) + 1);
        }

        System.out.println("Frequência dos caracteres:");
        for (Map.Entry<Character, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
