package src;

public class TernarioApp {
    public static void main(String[] args) {
        String resultado = true ? "verdadeiro":"falso";
        System.out.println(resultado);

        resultado = true && false ? "verdadeiro":"falso";
        System.out.println(resultado);

        resultado = true || false ? "verdadeiro":"falso";
        System.out.println(resultado);

        int numero = 11;
        System.out.println(numero%2);
        int resultado2 = numero%2 == 0 ? 1 : 2;
        System.out.println(resultado2);

    }
}
