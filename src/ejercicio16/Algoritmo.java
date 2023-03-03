package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class Algoritmo {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia entre los vehículos (km): ");
        double distancia = sc.nextDouble();
        
        System.out.print("Ingrese la velocidad del vehículo más rápido (km/h): ");
        double velocidad1 = sc.nextDouble();
        
        System.out.print("Ingrese la velocidad del vehículo más lento (km/h): ");
        double velocidad2 = sc.nextDouble();
        
        double tiempo = distancia / (velocidad1 - velocidad2);
        tiempo *= 60; // Convertimos de horas a minutos
        
        System.out.println("El vehículo más rápido alcanzará al otro en " + tiempo + " minutos.");
    }
    
}


