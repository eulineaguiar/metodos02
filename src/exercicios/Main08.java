package exercicios;

import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = Exercicio08.ConverterCelsiusParaFahrenheit(temperaturaCelsius);

        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);

        scanner.close();
    }
}