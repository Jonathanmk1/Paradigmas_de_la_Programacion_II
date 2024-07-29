package examendiagnostico;

import java.security.SecureRandom;
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SecureRandom nA = new SecureRandom();
        int m[][], f, fm;
        byte r, c;
        System.out.println("Ingrese el numero de filas:");
        r = s.nextByte();
        System.out.println("Ingrese el numero de columnas:");
        c = s.nextByte();
        m = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = nA.nextInt(255);
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
            System.out.println("Ingrese el número de la fila que desea mover:");
            f = s.nextInt() - 1; 
            System.out.println("Ingrese el número de la fila a la que desea mover:");
            fm = s.nextInt() - 1; 

                int[] m2 = m[f];
                m[f] = m[fm];
                m[fm] = m2;

                // Imprimir la matriz actualizada
                System.out.println("Matriz después del intercambio:");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        System.out.print(m[i][j] + " ");
                    }
                    System.out.println();
                }
            
            System.out.println("Realizar ahora en vector: ");
            for (int i = 0; i < r; i++) {
                         System.out.println(m[1]);
                    System.out.println();
                }
    }
}
