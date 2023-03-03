package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class NumeroInvertido {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero de dos cifras: ");
        int num = sc.nextInt();
        
        int unidades = num % 10; 
        int decenas = num / 10; 
        
        System.out.println("El numero invertido es: " + (unidades * 10 + decenas));
    }
}


