package exercicio4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaAtendimento {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Adicionar pessoa à fila");
            System.out.println("2 - Chamar próxima pessoa");
            System.out.println("3 - Mostrar próxima pessoa");
            System.out.println("4 - Exibir todos na fila");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    fila.add(nome);
                    System.out.println(nome + " foi adicionado à fila.");
                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        System.out.println(fila.poll() + " foi chamado(a). ");
                    } else {
                        System.out.println("A fila está vazia!");
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Próxima pessoa: " + fila.peek());
                    } else {
                        System.out.println("A fila está vazia!");
                    }
                    break;
                case 4:
                    if (!fila.isEmpty()) {
                        System.out.println("Fila de atendimento: "+ fila );
                    } else {
                        System.out.println("A fila está vazia!");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
