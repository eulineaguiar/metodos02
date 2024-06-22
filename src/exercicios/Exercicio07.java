package exercicios;

import java.util.Random;

public class Exercicio07 {

    public static int GerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}