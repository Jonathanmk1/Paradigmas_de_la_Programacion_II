
package d24022023;
   
import Utilerias_II.Archivo;
import d22022023Polim.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuFiguras {

    public static void main(String[] args) {

        ArrayList<FiguraGeometrica1> fgs = new ArrayList();
        byte op;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("Menu:  \n1.Altas  \n2.Imprimir \n3.Salir \nDigite una opcion: "));
          
            switch (op) {
                case 1://Altas
                    byte alta;
                    fgs = Archivo.leer("Fifuras.dat");
                    do {
                        alta = Byte.parseByte(JOptionPane.showInputDialog("Altas: \n1.Cuadrado  \n2.Triangulo  \n3.Circulo  \n4.Salir  \nDigite una opcion:"));

                        switch (alta) {
                            case 1://Cuadrado

                                float lado;
                                lado = Float.parseFloat(JOptionPane.showInputDialog("Lado:"));
                                fgs.add(new Cuadrado(lado));
                                Archivo.guardar(fgs, "Fifuras.dat");
                                break;

                            case 2://Triangulo

                                float a,
                                 b;
                                a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese a: "));
                                b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese b: "));
                                fgs.add(new Triangulo(b, a));
                                Archivo.guardar(fgs, "Fifuras.dat");
                                break;

                            case 3://Circulo

                                float r;
                                r = Float.parseFloat(JOptionPane.showInputDialog("Radio: "));
                                fgs.add(new Circulo(r));
                                Archivo.guardar(fgs, "Fifuras.dat");
                                break;

                            case 4:

                                JOptionPane.showMessageDialog(null, "Sliendo.....");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                        }

                    } while (alta != 4);
                    break;

                case 2://Imprimir

                    for (int i = 0; i < fgs.size(); i++) {
                        System.out.println(fgs.get(i).toString());
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo.....");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (op != 5);
    }
}

