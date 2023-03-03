package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class NotaFinal {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el número de respuestas correctas: ");
        int respuestasCorrectas = sc.nextInt();
        
        System.out.print("Ingrese el número de respuestas incorrectas: ");
        int respuestasIncorrectas = sc.nextInt();
        
        int notaFinal = respuestasCorrectas * 5 - respuestasIncorrectas;
        System.out.println("La nota final del estudiante es: " + notaFinal);
    }
}

