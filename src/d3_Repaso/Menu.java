package d3_Repaso;

import model.Auto;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op, id, n;
        String marca, modelo, color;
        Auto a[]= null;
        do {
            System.out.println("Ingrese la opcion que desea:");
            System.out.println("1. Altas");
            System.out.println("2. Reportes");
            System.out.println("3. Salir");
            op = s.nextInt();

            switch (op) {
                case 1:
                    System.out.println("cuantos autos desea ingresar? ");
                    n = s.nextInt();
                    a= new Auto[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Ingrese el id: ");
                        id = s.nextInt();
                        System.out.println("Ingrese la marca: ");
                        marca = s.nextLine();
                        marca = s.nextLine();
                        System.out.println("Ingrese el modelo: ");
                        modelo = s.nextLine();
                        System.out.println("Ingrese el color: ");
                        color = s.nextLine();
                        a[i] = new Auto(id, marca, modelo, color);
                    }

                    break;
                case 2:
                    for (Auto lo : a) {
                        System.out.println(lo.toString());
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        } while (op != 3);

    }
}
