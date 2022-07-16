import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota2: ");
        double nota2 = scanner.nextDouble();
//                                  media    >= 6 -> se sim aprovado, se não reprovado
        String resultadoMedia = ((nota1 + nota2)/2) >= 6 ? "Aprovado" : "Reprovado";
        System.out.println("O aluno está " + resultadoMedia);
    }
}
