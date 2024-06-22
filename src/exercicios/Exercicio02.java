package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void CalcularFatorial() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um n�mero para calcular o fatorial: ");
            int numero = scanner.nextInt();

            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " �: " + fatorial);
        } finally {
            scanner.close();
        }
    }

    public static void ImprimirQuadrado(int numero) {
        int quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " �: " + quadrado);
    }
}