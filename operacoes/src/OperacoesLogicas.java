package src;

public class OperacoesLogicas {
    public static void main(String[] args) {

        boolean resultado = true && true; // true
        if(resultado){
            System.out.println("Executa");
        }

        resultado = true && false; // false
        if(resultado)
            System.out.println("Não Executa");
        else
            System.out.println("Executa");


        if(true && false)
            System.out.println("Não Executa");

    }
}
