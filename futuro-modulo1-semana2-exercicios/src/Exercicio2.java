import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite outro número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operacao (1-soma, 2-subtracao, 3-multiplicacao, 4-divisao): ");
        int operacao = scanner.nextInt();

        double resultado;
        switch (operacao){
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operacao inválida");
                return;
        }
        // após o break

        // 10 % 2 --> 23 / 2 => 11, resto 1
        boolean par = resultado % 2 == 0;
        boolean positivo = resultado >= 0;

        if(par && positivo) // if c/ 1 linha não precisa de {}
            System.out.println("O resultado     "+ resultado + " é par e positivo");
        else if (par)
            System.out.println("O resultado "+ resultado + " é par e negativo");
        else if (positivo)
            System.out.println("O resultado "+ resultado + " é impar e positivo");
        else
            System.out.println("O resultado "+ resultado + " é impar e negativo");

    }
}
