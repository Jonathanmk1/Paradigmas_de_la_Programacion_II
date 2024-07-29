
package d19052022;

import java.awt.Color;

public class Rectangulo extends javax.swing.JPanel {
private int x=20;
private int y=50;
    public Rectangulo() {
        Thread animacion = new Thread(()->{
            while(true){
                x+=30;
                if(x > getWidth()-20){
                    x=0;
                }
                repaint();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Error");
                }
            }
        });
        animacion.start();
    }
     @Override
    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(155, 110, 130));  
       
             g.fillRect(x, y, 20, 50);
             
         
       
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
