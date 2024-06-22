package exercicios;

public class Exercicio09 {

    public static String InverterString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}