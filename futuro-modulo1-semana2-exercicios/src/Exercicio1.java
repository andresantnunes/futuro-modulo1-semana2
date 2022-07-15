import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de um salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o valor do salário: ");
        double salario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salario/salarioMinimo;
        System.out.println(quantidadeSalariosMinimos);
    }
}
