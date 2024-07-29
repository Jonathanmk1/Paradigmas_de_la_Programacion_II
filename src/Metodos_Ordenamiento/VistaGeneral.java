
package Metodos_Ordenamiento;
import javax.swing.*;
import java.awt.*;

public class VistaGeneral extends JFrame {
    public VistaGeneral() {
        setTitle("prueba de los 4 paneles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new GridLayout(2, 2));

        Burbuja panel1 = new Burbuja();
        Inserción panel2 = new Inserción();
        Seleccion panel3 = new Seleccion();
        HeapSort panel4 = new HeapSort();

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
    }

    public static void main(String[] args) {
        VistaGeneral frame = new VistaGeneral();
        frame.setVisible(true);
    }
}