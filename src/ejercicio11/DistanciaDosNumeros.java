package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class DistanciaDosNumeros {
   
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();
        
        double distancia = Math.abs(numero1 - numero2);
        
        System.out.println("La distancia entre " + numero1 + " y " + numero2 + " es " + distancia);
        
    }
}


