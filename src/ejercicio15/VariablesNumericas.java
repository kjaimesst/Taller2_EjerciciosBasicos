package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class VariablesNumericas {

public class IntercambioVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Ingrese primera variable: ");
        a = sc.nextInt();
        System.out.print("Ingrese segunda variable: ");
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("El valor de la primera variable después del intercambio es: " + a);
        System.out.println("El valor de la segunda variable del intercambio es: " + b);
    }
}

}
