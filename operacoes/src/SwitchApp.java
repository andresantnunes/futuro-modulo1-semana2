package src;

import java.util.Scanner;

public class SwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        // numero = 1
        switch(numero){
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break; // parou aqui
            case 2:
            case 3:
            case 4:  System.out.println("2, 3, 4");
                break;
            case 21: break;
            case 23: System.out.println("23");
            default:
                System.out.println("default");
        }

        //continua aqui
        System.out.println("Após o Switch");

        System.out.println();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = scanner1.nextLine();
        switch (nome){
            default:
                System.out.println("Usuario negado");
                break;
            case "andre" :
            case "gustavo" :
            case "sophiye" :
            case "gabriel" :
            case "filipe" :
                System.out.println("Usuario aceito");
                break;
        }
    }
}
