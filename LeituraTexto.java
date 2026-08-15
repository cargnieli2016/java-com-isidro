
import java.util.Scanner;

public class LeituraTexto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int codigo;
        double salario;

        System.out.println("Digite seu código: ");
        codigo = Integer.parseInt(teclado.nextLine());

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite seu salário: ");
        salario = Double.parseDouble(teclado.nextLine());

        System.out.println("Seu código é = " + codigo + " seu nome é = " + nome + " seu sálario é R$ " + salario);

        teclado.close();

    }

}
