package d4_Repaso;

/*
Al menu le agregamos baja
 */
import model.Auto;
import java.util.Scanner;

public class Menu1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte op, n;
        int id = 0;
        String marca, modelo, color;
        Auto a;
        Auto autos[] = new Auto[10];
        n = 0;
        do {
            System.out.println("Ingrese la opcion que desea:");
            System.out.println("1. Altas");
            System.out.println("2. Reportes");
            System.out.println("3. Bajas");
            System.out.println("4. Salir");
            System.out.println("Dame una opcion");
            op = s.nextByte();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el id: ");
                    id = s.nextInt();
                    byte i = 0,
                     pos = -1;
                    while (i < n) {
                        if (id == autos[i].getId()) {
                            pos = i;
                            break;
                        }
                        i++;
                    }
                    if (pos == -1) {
                        System.out.println("Ingrese la marca: ");
                        marca = s.nextLine();
                        marca = s.nextLine();
                        System.out.println("Ingrese el modelo: ");
                        modelo = s.nextLine();
                        System.out.println("Ingrese el color: ");
                        color = s.nextLine();
                        a = new Auto(id, marca, modelo, color);
                        autos[n] = a;
                        n++;
                    } else {
                        System.out.println("El id existe");
                    }
                    break;
                case 2:
                    for (i = 0; i < n; i++) {
                        System.out.println(autos[i]);
                    }
                    break;
                case 3:
                    int var;
                    int po = -1;
                    System.out.println("Dame el id a borrar: ");
                    var = s.nextInt();
                    for (i = 0; i < n; i++) {
                        if (autos[i].getId() == var) {
                            po = i;
                            break;
                        }
                        if (po != -1) {
                            for (i = 0; i < n; i++) {
                                autos[i] = autos[i + 1];
                            }
                            n--;
                            System.out.println("El id se borro satisfactoriamente");
                        } else {
                            System.out.println("El id no existe");
                        }
                    }
                        break;
                    
            
            case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        } while (op != 4);

        }
    }
