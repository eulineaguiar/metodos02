package exercicios;

public class Exercicio05 {

    public static int ObterMenorNumero(int num1, int num2, int num3) {
        int menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        return menor;
    }
}