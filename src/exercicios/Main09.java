package exercicios;

import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String texto = scanner.nextLine();

        String textoInvertido = Exercicio09.InverterString(texto);

        System.out.println("String invertida: " + textoInvertido);

        scanner.close();
    }
}