
package Metodos_Ordenamiento;

import java.awt.*;

public class Burbuja extends javax.swing.JPanel implements Runnable {
    int x = 10;
    int y = 50;
    int[] array;

    public Burbuja() {
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
            g.setColor(Color.ORANGE);
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
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                        // Repaint the panel to show the updated array
                        repaint();

                        try {
                            
                            Thread.sleep(10); // Delay for visualization purposes
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
