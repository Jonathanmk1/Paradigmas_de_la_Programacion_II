package d2_Repaso;
import Utilerias_II.Utilerias;
import java.util.Scanner;

public class Metodos {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int edades[], n;
        float prom;
        System.out.println("Cuantas personas son?");
        n = s.nextInt();
        edades = new int[n];
        Utilerias.llenarvector(n, edades);
        prom= Utilerias.promedio(edades);
        System.out.println("EL promedio es: " + prom);
       
    }

}
