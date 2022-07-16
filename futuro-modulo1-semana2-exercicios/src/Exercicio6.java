import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o lado1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o lado 3: ");
        double lado3 = scanner.nextDouble();

        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2+lado3 > lado1){
            if (lado1 == lado2 && lado3 == lado2)
                System.out.println("É um triângulo equilatero");
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
                System.out.println("É um triângulo isósceles");
            else
                System.out.println("É um triângulo escaleno");
        } else
            System.out.println("Não é um triângulo");
    }
}
