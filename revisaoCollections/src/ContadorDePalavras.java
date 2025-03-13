import java.util.*;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");

        String frase = scanner.nextLine();

        // Remove pontuações e transforma tudo para minúsculas
        frase = frase.replaceAll("[^a-zA-Zà-úÀ-Ú0-9 ]", "").toLowerCase();

        String[] palavras = frase.split("\\s+");

        Map<String, Integer> contagemPalavras = new HashMap<>();

        for (String palavra : palavras) {
            contagemPalavras.put(palavra, contagemPalavras.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("\nContagem de palavras:");
        for (Map.Entry<String, Integer> entrada : contagemPalavras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close();
    }

}
