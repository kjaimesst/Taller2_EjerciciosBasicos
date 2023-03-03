package ejercicio20;
import java.util.Scanner;
/**
 *
 * @author Oriana
 */
public class Monedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de monedas de 2 euros: ");
        int dosEuros = sc.nextInt();
        System.out.print("Cantidad de monedas de 1 euro: ");
        int unEuro = sc.nextInt();
        System.out.print("Cantidad de monedas de 50 centimos: ");
        int cincuentaCentimos = sc.nextInt();
        System.out.print("Cantidad de monedas de 20 centimos: ");
        int veinteCentimos = sc.nextInt();
        System.out.print("Cantidad de monedas de 10 centimos: ");
        int diezCentimos = sc.nextInt();
        double totalEuros = dosEuros * 2 + unEuro * 1 + cincuentaCentimos * 0.5 + veinteCentimos * 0.2 + diezCentimos * 0.1;
        System.out.printf("Tienes %.2f euros.%n", totalEuros);
    }

}

    



