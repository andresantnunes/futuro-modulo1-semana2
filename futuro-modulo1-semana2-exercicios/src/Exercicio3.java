import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite outro numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("O maior número é o :" +
                Math.max(numero1,numero2));
    }
}
