package exercicios;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do c�rculo: ");
        double raio = scanner.nextDouble();

        double perimetro = Exercicio04.CalcularPerimetroCirculo(raio);
        System.out.println("O per�metro do c�rculo �: " + perimetro);

        scanner.close();
    }
}