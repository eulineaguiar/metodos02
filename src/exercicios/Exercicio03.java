package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void VerificarNumeroPrimo() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número para verificar se é primo: ");
            int numero = scanner.nextInt();

            boolean isPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        } finally {
            scanner.close();
        }
    }

    public static double CalcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }
}