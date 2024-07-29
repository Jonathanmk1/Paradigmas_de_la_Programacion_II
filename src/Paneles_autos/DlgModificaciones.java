package Paneles_autos;

import Utilerias_II.Archivo;
import model.Auto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DlgModificaciones extends javax.swing.JDialog {

    public DlgModificaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        super.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtresp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("1. MARCA");

        jLabel6.setText("2. MODELO");

        jLabel7.setText("3. COLOR");

        jLabel3.setText("Escriba la opcion que desea: ");

        txtresp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrespActionPerformed(evt);
            }
        });

        jLabel1.setText("MODIFICACIONES");

        jLabel2.setText("¿Qué desea modificar?");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtresp, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 88, Short.MAX_VALUE)))
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtresp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrespActionPerformed
        String opc;
        opc = txtresp.getText();
        switch (opc) {
            case "1": {
                int po = -1, id;
                String nom;
                ArrayList<Auto> a;
                a = Archivo.leer("datosa.dat");
                id = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el id a modificar"));
                for (int i = 0; i < a.size(); i++) {
                    if (a.get(i).getId() == id) {
                        po = i;
                        break;
                    }
                }
                if (po != -1) {
                    nom = JOptionPane.showInputDialog(this, "Dame el nuevo modelo del carro: ");
                    ((Auto) a.get(po)).setModelo(nom);
                    Archivo.guardar(a, "datosa.dat");
                    JOptionPane.showMessageDialog(this, "El Modelo de = " + id + "se modifico satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(this, "El id: " + id + "no existe");
                }
            }
            break;

            case "2": {
                 int po = -1, id;
                String nom;
                ArrayList<Auto> a;
                a = Archivo.leer("datosa.dat");
                id = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el id a modificar"));
                for (int i = 0; i < a.size(); i++) {
                    if (a.get(i).getId() == id) {
                        po = i;
                        break;
                    }
                }
                if (po != -1) {
                    nom = JOptionPane.showInputDialog(this, "Dame la nueva marca del Auto: ");
                    ((Auto) a.get(po)).setMarca(nom);
                    Archivo.guardar(a, "datosa.dat");
                    JOptionPane.showMessageDialog(this, "La marca de = " + id + "se modifico satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(this, "El id: " + id + "no existe");
                }
            }
            break;

            case "3": {
                 int po = -1, id;
                String nom;
                ArrayList<Auto> a;
                a = Archivo.leer("datosa.dat");
                id = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el id a modificar"));
                for (int i = 0; i < a.size(); i++) {
                    if (a.get(i).getId() == id) {
                        po = i;
                        break;
                    }
                }
                if (po != -1) {
                    nom = JOptionPane.showInputDialog(this, "Dame el nuevo color del carro: ");
                    ((Auto) a.get(po)).setColor(nom);
                    Archivo.guardar(a, "datosa.dat");
                    JOptionPane.showMessageDialog(this, "El color de = " + id + "se modifico satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(this, "El id: " + id + "no existe");
                }
            }
            break;
        }
    }//GEN-LAST:event_txtrespActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtresp;
    // End of variables declaration//GEN-END:variables
}
