package Metodos_Ordenamiento;

import java.awt.*;

public class HeapSort extends javax.swing.JPanel implements Runnable {

    int x = 10;
    int y = 50;
    int[] array;

    public HeapSort() {
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
            g.setColor(Color.RED);

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

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(i, 0);

            // Repaint the panel to show the updated array
            repaint();

            try {
                Thread.sleep(10); // Delay for visualization purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void heapify(int size, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && array[left] > array[largest]) {
            largest = left;
        }

        if (right < size && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != root) {
            int temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;

            heapify(size, largest);
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
            .addGap(0, 200, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
