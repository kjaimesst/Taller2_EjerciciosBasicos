
package ejercicio6;
import java.util.Scanner;

public class promedio {
    public static void main(String[] args){
      int sum = 0, inputNum;
      int counter;
      float mean;
      Scanner NumScanner = new Scanner(System.in);
      Scanner charScanner = new Scanner(System.in);
      
      System.out.println("Ingresa tres numeros:");

      counter = NumScanner.nextInt();
      
      System.out.println("Por favor ingresa" + counter + " números:");
      
      for(int x = 1; x<=counter ;x++){          
          inputNum = NumScanner.nextInt();
          sum = sum + inputNum;
          System.out.println();
      }
      
      mean = sum / counter;
      System.out.println("La media de " + counter + " los números que ingresaste es " + mean);
    }
}
