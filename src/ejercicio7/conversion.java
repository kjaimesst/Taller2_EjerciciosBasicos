
package ejercicio7;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de minutos:");
    int minutos = sc.nextInt();
    int horas = minutos/60;
    int minutosRestantes =  minutos %60;
        System.out.println(minutos + " minutos equivalente: " + horas + " horas y " + minutosRestantes + " minutos ");
    }
    
}

