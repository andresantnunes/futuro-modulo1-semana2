package src;

import java.util.Scanner;

public class IfApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite true ou false: ");
        int numero = scanner.nextInt();

        //se
        if(numero >= 10){
            System.out.println("Executa se for true/verdadeiro");
            if(numero > 15){
                System.out.println("if no if");
            }
        }
        //se não
        else{
            System.out.println("Executa se for false/falso");
            if(numero < 0){
                System.out.println("Numero negativo");
            }
        }


        if(1 == 1){
            System.out.println("Numero iguais");
        }

        if(1 <= 1){
            System.out.println("Menor ou igual");
        }

        if(3 >= 1){
            System.out.println("Maior ou igual");
        }

        if(3 > 1){
            System.out.println("Maior");
        }

        if(3 < 1){
            System.out.println("Maior");
        }


        if(!true){
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }

        String nome = "Pedro";
        if(nome != "Andre" ){
            System.out.println("Nome diferente de Andre");
        }
        else {
            System.out.println("Nome igual a Andre");
        }

    }
}
