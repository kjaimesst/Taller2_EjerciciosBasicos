package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class CalcularRaiz {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese un numero: ");
    double numero = sc.nextDouble();

    double raizCuadrada = Math.sqrt(numero);
    double raizCubica = Math.cbrt(numero);

    System.out.println("La raiz cuadrada de " + numero + " es: " + raizCuadrada);
    System.out.println("La raiz cúbica de " + numero + " es: " + raizCubica);

    sc.close();
  }
}


