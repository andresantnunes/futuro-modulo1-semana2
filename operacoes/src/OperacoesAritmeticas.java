package src;

public class OperacoesAritmeticas {
    public static void main(String[] args){

        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        System.out.println("O valor da soma é:" + resultado);

        int resultado2 = numero1 - numero2;
        System.out.println("O valor da subtração é:" + resultado2);


        double numero3 = 10.0;
        double numero4 = 20;
        double resultado3 = numero3/numero4;
        System.out.println("O valor da divisão é:" + resultado3);

        int resultado4 = numero1 * numero2;
        System.out.println("O valor da multiplicação é:" + resultado4);

        int resultado5 = numero1 % numero2;
        System.out.println("O resto da divisão é:" + resultado5);

        System.out.println();
        System.out.println("O menor numero é:" + Math.min(numero1,numero2));
        System.out.println("O maior numero é:" + Math.max(10,numero2));
        System.out.println("O a fatoração é:"  + Math.pow(numero3,numero4));
        System.out.println("O arredondando o numero fica:" + Math.round(21.0123123));
        System.out.println("O arredondando para cima é:" + Math.ceil(21.0123123));
        System.out.println("O arredondando para baixo é:" + Math.floor(21.0123123));
        System.out.println("A raiz quadrada é:" + Math.sqrt(numero2));

    }
}
