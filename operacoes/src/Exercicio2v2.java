package src;

import java.util.Scanner;

public class Exercicio2v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o numero2: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (1-soma; 2-subtracao; 3-multiplicacao; 4-divisao): ");
        int operacao = scanner.nextInt();

        double resultado = 0;

//        if(operacao==1){
//            resultado = numero1 + numero2;
//        }else if(operacao==2){
//            resultado = numero1 - numero2;
//        }else if(operacao==3){
//            resultado = numero1 * numero2;
//        }else if(operacao==4){
//            resultado = numero1 / numero2;
//        }else{
//            System.out.println("Operação inválida");
//            return;
//        }

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
