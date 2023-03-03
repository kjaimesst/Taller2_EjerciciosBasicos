
package ejercicio8;

import java.util.Scanner;

public class extraComision {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);        
     System.out.println("Ingresa el sueldo del vendedor:");
     double sueldoBase = input.nextDouble();
     System.out.println("Ingresa el total de la primera venta: ");
     double venta1 = input.nextDouble();
     System.out.println("Ingresa el total de la segunda venta: ");
     double venta2 = input.nextDouble();
     System.out.println("Ingresa el total de la tercera venta: ");
     double venta3 = input.nextDouble();
     
     double comisionTotal=(venta1+venta2+venta3)*0.1;
     double total = sueldoBase+comisionTotal;
     
     System.out.println("El vendedor recibira de comision: " + comisionTotal);
        System.out.println("El vendedor recibira en total: " + total + "e n el mes.");
       
     
     
    }
}
