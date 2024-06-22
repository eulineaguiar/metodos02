package exercicios;

public class Main06 {

    public static void main(String[] args) {
        int numero = 13; 
        boolean ehPrimo = Exercicio06.EhPrimo(numero);
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}