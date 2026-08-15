import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        float b;
        double c;

        System.out.println("Digite um valor inteiro: ");
        a = teclado.nextInt();
        System.out.println("Você digitou o valor: " + a);

        System.out.println("Digite um valor float: ");
        b = teclado.nextFloat();
        System.out.println("Você digitou o valor: " + b);

        System.out.println("Digite um valor double: ");
        c = teclado.nextDouble();
        System.out.printf("Você digitou o valor: %.3f\n", c);

        teclado.close();
    }
}