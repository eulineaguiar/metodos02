package exercicios;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Exercicio10.CalcularHipotenusa(cateto1, cateto2);

        System.out.println("Comprimento da hipotenusa: " + hipotenusa);

        scanner.close();
    }
}