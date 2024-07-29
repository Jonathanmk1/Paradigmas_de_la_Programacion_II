
package d8_gui;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;

public class Ventana extends javax.swing.JFrame {

    public Ventana() throws HeadlessException {
       initcomponents();
       super.setTitle("mi ventana Principal");
    }

    public Ventana(String title) throws HeadlessException {
        super(title);//accdede al constructor de la clase padre, en este caso el jframe
        initcomponents();
             
    }
    
    private void initcomponents(){
         super.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        super.setSize(280, 360);
        //super.setLayout(new java.awt.FlowLayout());
        super.setLayout(new java.awt.BorderLayout());
        btnCerrar = new javax.swing.JButton("Cerrar");
        btnGuardar = new javax.swing.JButton("Guardar");
        
        btnCerrar.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        
        super.getContentPane().add(btnCerrar, java.awt.BorderLayout.NORTH);
        super.getContentPane().add(btnGuardar, java.awt.BorderLayout.CENTER);
    }
    javax.swing.JButton btnCerrar;
    javax.swing.JButton btnGuardar;
}
