package src;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o numero2: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (1-soma; 2-subtracao; 3-multiplicacao; 4-divisao): ");
        double opercao = scanner.nextDouble();

        double resultado = 0;

        if(opercao==1){
            resultado = numero1 + numero2;
        }else if(opercao==2){
            resultado = numero1 - numero2;
        }else if(opercao==3){
            resultado = numero1 * numero2;
        }else if(opercao==4){
            resultado = numero1 / numero2;
        }else{
            System.out.println("Operação inválida");
            return;
        }
//        boolean positivo = false;
//        if(resultado>=0){
//            positivo = true;
//        }
//        boolean par = false;
//        if(resultado % 2 == 0){
//            par = true;
//        }
        boolean positivo = resultado>=0;
        boolean par = resultado % 2 == 0;

        // true       false
        if(positivo && par){ //false
            System.out.println("O número "+resultado+" é par e positivo");
        } else if(par){ // false
            System.out.println("O número "+resultado+" é par e negativo");
        } else if (positivo) { // true
            System.out.println("O número "+resultado+" é impar e positivo");
        } else {
            System.out.println("O número "+resultado+" é impar e negativo");
        }
    }
}
