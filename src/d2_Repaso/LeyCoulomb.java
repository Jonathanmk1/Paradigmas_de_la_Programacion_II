
package d2_Repaso;

import Utilerias_II.FormulaCoulomb;
import java.util.Scanner;

public class LeyCoulomb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float q1, q2, r;
        float F;
        
        System.out.println("Ingrese el valor de q1: ");
        q1 = s.nextFloat();
        System.out.println("Ingrese el valor de q2: ");
        q2 = s.nextFloat();
        System.out.println("Ingrese la distancia");
        r = s.nextInt();
        F = FormulaCoulomb.form(q1, q2, r);
        System.out.println("El resultado es  " + F);
    }
}
