import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas você quer inserir?");
        int num = entrada.nextInt();
        double media=0;
        double[] notas = new double[num];

        for (int i = 0; i < num; i++ ){
            System.out.println("informar nota:");
            notas[i] = entrada.nextDouble();
        }
        media = calculaMedia(notas);
        System.out.println("a média é: "+media);
    }
    private static double calculaMedia(double[] notas){
        double media = 0;
        for (int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        media = media / notas.length;
        return  media;
    }
}