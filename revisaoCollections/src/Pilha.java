import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("2001 odisseia espacial");
        livros.add("a cabana");
        livros.add("o pequeno principe");
        livros.add("santo guerreiro");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for(String livro: livros) {
            System.out.println(livro);
        }

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop());
    }
}
