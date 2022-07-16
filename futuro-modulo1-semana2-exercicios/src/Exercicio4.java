import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o numero2: ");
        double numero2 = scanner.nextDouble();

        double temporaria = numero1;
        numero1 = numero2;
        numero2 = temporaria;

        System.out.println(
                "Valor numero 1: "+ numero1 +
                ", valor numero 2: " + numero2);
    }
}
