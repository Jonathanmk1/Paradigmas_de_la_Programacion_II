
package d12052023;

import java.awt.Color;

public class PnlDibujo extends javax.swing.JPanel {

    public PnlDibujo() {
        initComponents();
    }
    @Override
    public void paint(java.awt.Graphics g){
        super.paint(g);
        g.setColor(new Color(255, 0, 0));  
        
        int x= 0;
        for (int i = 0; i < 10; i++) {
        g.fillRect(x, 50, 20, 50);
        x+=30;
        
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
