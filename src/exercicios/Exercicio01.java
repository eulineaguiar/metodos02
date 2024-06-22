package exercicios;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio01 {

    public static void ExibirHoraAtual() {
    	
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormatada = horaAtual.format(formatter);

        System.out.println("Hora atual: " + horaFormatada);
    }
}