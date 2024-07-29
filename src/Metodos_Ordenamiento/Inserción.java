package Metodos_Ordenamiento;

import java.awt.*;

public class Inserción extends javax.swing.JPanel implements Runnable {

    int x = 10;
    int y = 50;
    int[] array;

    public Inserción() {
        array = datosRandom(x, y);
    }

    public int[] datosRandom(int tama, int max) {
        int[] arr = new int[tama];
        for (int i = 0; i < tama; i++) {
            arr[i] = (int) (Math.random() * max);
        }
        return arr;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 0;
        int Altura = getMaxHeight();
        for (int i = 0; i < array.length; i++) {
            int rectHeight = (int) ((array[i] / (float) Altura) * getHeight());
            g.setColor(Color.YELLOW);

            g.fillRect(x, getHeight() - rectHeight, 20, rectHeight);
            x += 30;
        }
    }

    public int getMaxHeight() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public void run() {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;

                // Repaint the panel to show the updated array
                repaint();

                try {
                    Thread.sleep(10); // Delay for visualization purposes
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            array[j + 1] = key;

            // Repaint the panel to show the updated array
            repaint();

            try {
                Thread.sleep(500); // Delay for visualization purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
