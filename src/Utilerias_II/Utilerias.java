
package Utilerias_II;

import java.util.Scanner;

public class Utilerias {
    static Scanner s = new Scanner(System.in);
        public static void llenarvector(int n, int edades[]) {
        for (int i = 0; i < n; i++) {
            System.out.println("Dame la edad " + (i + 1) + ":");
            edades[i] = s.nextInt();
        }
    }
    public static float promedio(int edades[]){
        int suma=0;
        float prom;
          for (int i = 0; i < edades.length; i++) {
            suma += edades[i];
        }
        prom = (float) suma / edades.length;
        return prom;

    }
}
