/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.ButtonGroup;
import static ventanas.Vendedor.cboCliente;

/**
 *
 * @author f3r
 */
public class Encuesta extends javax.swing.JFrame {
    ButtonGroup clima= new ButtonGroup();
    ButtonGroup atraccion = new ButtonGroup();
    ButtonGroup disfrute = new ButtonGroup();
    
    /**
     * Creates new form Encuesta
     */
    public Encuesta() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        clima.add(rbtFiro);
        clima.add(rbtCalido);
        clima.add(rbtTemplado);
        atraccion.add(rbtAventura);
        atraccion.add(rbtFantasia);
        atraccion.add(rbtHistoria);
        disfrute.add(rbtComida);
        disfrute.add(rbtPaisaje);
        disfrute.add(rbtAmbos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rbtFiro = new javax.swing.JRadioButton();
        rbtTemplado = new javax.swing.JRadioButton();
        rbtCalido = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rbtAventura = new javax.swing.JRadioButton();
        rbtHistoria = new javax.swing.JRadioButton();
        rbtFantasia = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rbtComida = new javax.swing.JRadioButton();
        rbtPaisaje = new javax.swing.JRadioButton();
        rbtAmbos = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnIr = new javax.swing.JButton();
        btnNoGracias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENCUESTA");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("¿Qué clima te gusta?");

        rbtFiro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtFiro.setText("Frío");

        rbtTemplado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtTemplado.setText("Templado");

        rbtCalido.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtCalido.setText("Cálido");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("¿Qué te atrae más?");

        rbtAventura.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtAventura.setText("Aventura");

        rbtHistoria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtHistoria.setText("Historia");

        rbtFantasia.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtFantasia.setText("Fantasía");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("¿Qué disfrutas más en un viaje?");

        rbtComida.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtComida.setText("Comida");

        rbtPaisaje.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtPaisaje.setText("Paisaje");

        rbtAmbos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtAmbos.setText("Ambos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Recorre tu viaje imaginario y gana un cupón");

        btnIr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIr.setText("IR");
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });

        btnNoGracias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNoGracias.setText("NO,  GRACIAS");
        btnNoGracias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoGraciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rbtFiro)
                        .addGap(18, 18, 18)
                        .addComponent(rbtTemplado)
                        .addGap(18, 18, 18)
                        .addComponent(rbtCalido))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rbtAventura)
                                .addGap(18, 18, 18)
                                .addComponent(rbtHistoria)
                                .addGap(18, 18, 18)
                                .addComponent(rbtFantasia))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rbtComida)
                        .addGap(18, 18, 18)
                        .addComponent(rbtPaisaje)
                        .addGap(18, 18, 18)
                        .addComponent(rbtAmbos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnIr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNoGracias)
                                .addGap(20, 20, 20)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtFiro)
                    .addComponent(rbtTemplado)
                    .addComponent(rbtCalido))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtAventura)
                    .addComponent(rbtHistoria)
                    .addComponent(rbtFantasia))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtComida)
                    .addComponent(rbtPaisaje)
                    .addComponent(rbtAmbos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoGracias)
                    .addComponent(btnIr))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoGraciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoGraciasActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnNoGraciasActionPerformed

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIrActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIr;
    private javax.swing.JButton btnNoGracias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbtAmbos;
    private javax.swing.JRadioButton rbtAventura;
    private javax.swing.JRadioButton rbtCalido;
    private javax.swing.JRadioButton rbtComida;
    private javax.swing.JRadioButton rbtFantasia;
    private javax.swing.JRadioButton rbtFiro;
    private javax.swing.JRadioButton rbtHistoria;
    private javax.swing.JRadioButton rbtPaisaje;
    private javax.swing.JRadioButton rbtTemplado;
    // End of variables declaration//GEN-END:variables
}