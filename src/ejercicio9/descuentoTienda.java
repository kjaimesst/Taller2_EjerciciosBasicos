
package ejercicio9;

import java.util.Scanner;

public class descuentoTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ofertas");
        System.out.println("Precio: ");
        double k;
        k = sc.nextDouble();
        double d;
        d = k*0.15;
        k = k-d;
        System.out.println("Total con descuento es:  " + k);
     
    }
    
}
