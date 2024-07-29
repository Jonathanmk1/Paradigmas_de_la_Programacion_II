package d22022023Polim;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class MenuFiguras {

    public static void main(String[] args) {

        ArrayList<FiguraGeometrica1> fgs = new ArrayList();
       

        byte op;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("Menu:  \n1.Altas  \n2.Bajas \nSalir \nDigite una opcion: "));

            switch (op) {
                case 1://Altas
                    byte alta;

                    do {
                        alta = Byte.parseByte(JOptionPane.showInputDialog("Altas: \n1.Cuadrado  \n2.Triangulo  \n3.Circulo  \n4.Salir  \nDigite una opcion:"));

                        switch (alta) {
                            case 1://Cuadrado

                                float lado;
                                lado = Float.parseFloat(JOptionPane.showInputDialog("Lado:"));
                                fgs.add(new Cuadrado(lado));
      
                                break;

                            case 2://Triangulo

                                float a,b;
                                a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese a: "));
                                b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese b: "));
                                fgs.add(new Triangulo(b, a));
                                break;

                            case 3://Circulo

                                float r;
                                r = Float.parseFloat(JOptionPane.showInputDialog("Radio: "));
                                fgs.add(new Circulo(r));
                                break;

                            case 4:

                                JOptionPane.showMessageDialog(null, "Sliendo.....");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                        }

                    } while (alta != 3);
                    break;

                case 2://Bajas

                    byte bajas = Byte.parseByte(JOptionPane.showInputDialog("Bajas: \n1.Cuadrado  \n2.Triangulo  \n3.Circulo  \n4.Salir  \nDigite una opcion:"));

                    switch (bajas) {
                        case 1://Cuadrado

                            boolean existe = false;

                            int posC = Integer.parseInt(JOptionPane.showInputDialog(""));

                            for (int i = 0; i < fgs.size(); i++) {

                                if (fgs.get(posC) instanceof Cuadrado) {
                                    fgs.remove(posC);
                                    existe = true;
                                    JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                                    break;
                                }
                            }

                            if (existe) {
                                JOptionPane.showMessageDialog(null, "No existe");
                            }

                            break;

                        case 2://Triangulo

                            boolean existeT = false;

                            int posT = Integer.parseInt(JOptionPane.showInputDialog(""));

                            for (int i = 0; i < fgs.size(); i++) {

                                if (fgs.get(posT) instanceof Triangulo) {
                                    fgs.remove(posT);
                                    existe = true;
                                    JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                                    break;
                                }
                            }

                            if (existeT) {
                                JOptionPane.showMessageDialog(null, "No existe");
                            }
                            break;

                        case 3://Circulo
                            boolean existeCi = false;

                            int posCi = Integer.parseInt(JOptionPane.showInputDialog(""));

                            for (int i = 0; i < fgs.size(); i++) {

                                if (fgs.get(posCi) instanceof Circulo) {
                                    fgs.remove(posCi);
                                    existe = true;
                                    JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                                    break;
                                }
                            }

                            if (existeCi) {
                                JOptionPane.showMessageDialog(null, "No existe");
                            }
                            break;

                        case 4:

                            JOptionPane.showMessageDialog(null, "Sliendo.....");
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }

                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo.....");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (op != 3);
    }
}
