package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class ciclista {

public class HoraDeLlegada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la hora de partida: ");
        String horaPartida = sc.nextLine();
        String[] partesHora = horaPartida.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);
        int segundos = Integer.parseInt(partesHora[2]);
        
        System.out.print("Introduce el tiempo de viaje (en segs): ");
        int tiempoViaje = sc.nextInt();
       
        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos + tiempoViaje;
        int horasLlegada = totalSegundos / 3600;
        int minutosLlegada = (totalSegundos % 3600) / 60;
        int segundosLlegada = totalSegundos % 60;
       
        System.out.println("La hora de llegada será: " + horasLlegada + ":" + minutosLlegada + ":" + segundosLlegada);
    }

}

}
