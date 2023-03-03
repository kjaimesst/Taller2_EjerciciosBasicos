package ejercicio10;

import java.util.Scanner;

public class CalificacionFinal {
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] examenFinal = new int [3];
        int eFinal, tFinal, suma=0;
        
        for(int i=0;i<3;i++){    
            System.out.println("Nota de examen: "+(i+1));
            examenFinal[i] = sc.nextInt();
            suma += examenFinal[i];
        }
        suma = suma/3;
        
        System.out.println("Nota de su examen final: ");
        eFinal = sc.nextInt();
        System.out.println("Nota trabajo final: ");
        tFinal = sc.nextInt();
        
        float total = (float) 
        ((suma*0.55)+(eFinal*0.30)+(tFinal*0.15));
        
        System.out.println("Su nota final es "+total);
    }
}