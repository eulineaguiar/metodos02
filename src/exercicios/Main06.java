package exercicios;

public class Main06 {

    public static void main(String[] args) {
        int numero = 13; 
        boolean ehPrimo = Exercicio06.EhPrimo(numero);
        if (ehPrimo) {
            System.out.println(numero + " � um n�mero primo.");
        } else {
            System.out.println(numero + " n�o � um n�mero primo.");
        }
    }
}