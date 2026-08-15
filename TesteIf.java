import java.util.Scanner;

public class TesteIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, media;

        System.out.println("Digite a Nota 1:");
        n1 = teclado.nextDouble();

        System.out.println("Digite a Nota 2:");
        n2 = teclado.nextDouble();

        media = (n1 + n2) / 2;

        System.out.println("Sua média vale: " + media);

        if (n1 >= 5 && media >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        teclado.close();

    }
}