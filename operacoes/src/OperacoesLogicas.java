package src;

/*
* O nome do autor: André Santana Nunes
* Data de criação do programa: 13/07/22
* Última data de modificação: 13/07/22
* Objetivo da classe/programa: Explicar operações lógicas
* */

public class OperacoesLogicas {
    public static void main(String[] args) {

        boolean resultado = true && true; // true
        if(resultado){
            System.out.println("Executa AND");
        }

        resultado = true && false; // false
        if(resultado)
            System.out.println("Não Executa");


        if(false && false)
            System.out.println("Não Executa");

        resultado = true || true;
        if (resultado){
            System.out.println("Executa OR");
        }

        resultado = true || false;
        if (resultado){
            System.out.println("Executa OR");
        }

        resultado = false || false;
        if (resultado){
            System.out.println("Não Executa OR");
        }

        int x = 10;
        if (10 <= x || x < -10 ){ //ou maior ou igual a 10, ou menor do que -10
            System.out.println("ou maior ou igual a 10, ou menor do que -10 ");
        }
//   or     x                           x
//        ---------(-10) -------- (10) ---------
//   and                     x
        if (10 >= x && x > -10){ //intervalo entre -9 e 10
            System.out.println("intervalo entre -9 e 10");
        }

        if (10 >= x && x > -10 && x%2==0){ //intervalo entre -9 e 10
            System.out.println("intervalo entre -9 e 10");
        }

        //              false       ||   true=> true
        resultado = (true || false) && true;
        if (resultado){
            System.out.println("Executa?");
        }

        //   or     x                                   x
//        -----(-13)--(-11)--(-10) -------- (10) --(11)--(13)--(15)---
        x = -9;
        if ((10 <= x || x <= -10) && x%2!=0){ //ou maior ou igual a 10, ou menor ou igual a -10
            System.out.println("O número é: ou maior ou igual a 10, ou menor ou igual a -10, e é impar");
        }
    }
}
