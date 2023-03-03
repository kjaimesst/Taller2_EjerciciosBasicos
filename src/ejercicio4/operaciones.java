
package ejercicio4;

import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double numero1;
        double numero2;
        System.out.println("Escribe dos numeros para obtener 4 operaciones");
        System.out.println("Escribe el primer numero");
        numero1 = scanner.nextDouble();
        System.out.println("Escribe el segundo numero");
        numero2 = scanner.nextDouble();
        
        System.out.println("La suma de estos números es " + (numero1 + numero2));   
        System.out.println("La suma de estos números es " + (numero1 - numero2));   
        System.out.println("La suma de estos números es " + (numero1 * numero2));
        System.out.println("La suma de estos números es " + (numero1 / numero2));
        if(numero2 !=0){
            System.out.println("La division de estos numeros es" + (numero1/numero2));
        }
    }
    
}
