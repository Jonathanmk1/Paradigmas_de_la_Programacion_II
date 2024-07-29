package BubbleShort_Animado;

import java.awt.Color;
import java.awt.Graphics;

public class Pnl_caja extends javax.swing.JPanel {

    private int[] vect;

    public Pnl_caja() {
        initComponents();
        int x[] = {5, 8, 20, 2, 21, 30, 18};
        vect = x;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.setColor(new Color(92, 23, 0));
        g.setColor(Color.red);

        int x = 0;
        int Altura = getMaxHeight();
        for (int i = 0; i < vect.length; i++) {
            int rectHeight = (int) ((vect[i] / (float) Altura) * getHeight());
            g.setColor(Color.GREEN);
            g.fillRect(x, getHeight() - rectHeight, 10, rectHeight);
            x += 50;
        }
    }

    private int getMaxHeight() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > max) {
                max = vect[i];
            }
        }
        return max;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
