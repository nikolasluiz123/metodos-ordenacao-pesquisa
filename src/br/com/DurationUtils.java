package br.com;

import java.time.Duration;
import java.time.LocalDateTime;

public final class DurationUtils {

	public static String getDurationOf(LocalDateTime date1, LocalDateTime date2) {
        Duration duracao = Duration.between(date1, date2);

        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;
        long segundos = duracao.getSeconds() % 60;
        long milissegundos = duracao.toMillis() % 1000;
        
        return "Tempo: %s horas, %s minutos, %s segundos, %s milissegundos.".formatted(horas, minutos, segundos, milissegundos);
	}
}
