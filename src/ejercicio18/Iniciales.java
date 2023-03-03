package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class Iniciales {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre y apellido: ");
        String nombreApellido = sc.nextLine();

        String[] nombres =  nombreApellido.split(" ");

        String iniciales = "";
        for (String nombre : nombres) {
            iniciales += nombre.charAt(0);
        }

        System.out.println("Las iniciales de tu nombre y apellido sons: " + iniciales.toUpperCase());
    }
}


