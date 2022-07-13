package src;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Seu nome é " + nome);

        System.out.print("Digite seu peso: ");
        double numero = scanner.nextDouble();

        System.out.println("Seu peso é " + numero);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.println("Seu peso é " + numero);

    }
}
