package exercicio7;

import java.util.*;

public class RankingPontuacao {
    public static void main(String[] args) {
        Map<String, Integer> jogadores = new HashMap<>();;
        jogadores.put("Ana",250);
        jogadores.put("Carla",100);
        jogadores.put("Bruna",470);
        jogadores.put("Maria",350);
        jogadores.put("Helena",222);

        exibirRanking(jogadores);

    }
    public static void exibirRanking(Map<String, Integer> jogadores) {
        List<Map.Entry<String, Integer>> ranking = new ArrayList<>(jogadores.entrySet());

        ranking.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nRanking dos jogadores:");
        for (int i = 0; i < ranking.size(); i++) {
            System.out.println((i + 1) + ". " + ranking.get(i).getKey() + " - " + ranking.get(i).getValue() + " pontos");
        }
    }
}
