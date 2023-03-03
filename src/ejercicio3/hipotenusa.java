package ejercicio3;
import java.util.Scanner;
public class hipotenusa {
    public static void main(String[] args) {
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer cateto");
        double a= sc.nextDouble();
         System.out.println("Ingresa el segundo cateto");
        double b= sc.nextDouble();
        c = Math.sqrt((a*a+b*b));
        System.out.println(c);
    }
}
