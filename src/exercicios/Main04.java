package exercicios;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double perimetro = Exercicio04.CalcularPerimetroCirculo(raio);
        System.out.println("O perímetro do círculo é: " + perimetro);

        scanner.close();
    }
}