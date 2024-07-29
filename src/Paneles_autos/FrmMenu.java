package Paneles_autos;

import javax.swing.JOptionPane;

public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
        super.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etConsulta = new javax.swing.JLabel();
        etReporte = new javax.swing.JLabel();
        etMenu = new javax.swing.JLabel();
        etAlta = new javax.swing.JLabel();
        etSalir = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOpc = new javax.swing.JTextField();
        etqBajas = new javax.swing.JLabel();
        etqMODIFICACION = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etConsulta.setText("2. CONSULTAR");

        etReporte.setText("5. REPORTES");

        etMenu.setText("MENU: Autos");

        etAlta.setText("1. ALTAS");

        etSalir.setText("6. SALIR");

        jLabel5.setText("Opción:");

        txtOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpcActionPerformed(evt);
            }
        });

        etqBajas.setText("3. BAJAS");

        etqMODIFICACION.setText("4. MODIFICACIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtOpc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqBajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etConsulta)
                                    .addComponent(etAlta)
                                    .addComponent(etMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqMODIFICACION, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etSalir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etAlta)
                .addGap(18, 18, 18)
                .addComponent(etConsulta)
                .addGap(18, 18, 18)
                .addComponent(etqBajas)
                .addGap(18, 18, 18)
                .addComponent(etqMODIFICACION)
                .addGap(18, 18, 18)
                .addComponent(etReporte)
                .addGap(18, 18, 18)
                .addComponent(etSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpcActionPerformed
        String opc;
        opc = txtOpc.getText();
        switch (opc) {
            case "1":
                DlgAltas v;
                v = new DlgAltas(this, true);
                v.setVisible(true);
                break;
                
            case "2":
                DlgConsultar l;
                l = new DlgConsultar(this, true);
                l.setVisible(true);
                break;
            case "3":
                DlgBajas r;
                r = new DlgBajas(this, true);
                r.setVisible(true);
                break;
            case "4":
                DlgModificaciones f;
                f= new DlgModificaciones(this, true);
                f.setVisible(true);
                break;
            case "5":
                DlgReportes s;
                s = new DlgReportes(this, true);
                s.setVisible(true);
                break;
                
            case "6":
                JOptionPane.showMessageDialog(this, "Adios.....");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Opción no válida");
        }
    }//GEN-LAST:event_txtOpcActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etAlta;
    private javax.swing.JLabel etConsulta;
    private javax.swing.JLabel etMenu;
    private javax.swing.JLabel etReporte;
    private javax.swing.JLabel etSalir;
    private javax.swing.JLabel etqBajas;
    private javax.swing.JLabel etqMODIFICACION;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtOpc;
    // End of variables declaration//GEN-END:variables
}
