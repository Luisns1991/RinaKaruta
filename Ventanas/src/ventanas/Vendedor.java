//Grupo
package ventanas;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

/*
 * @author f3r
 */
public class Vendedor extends javax.swing.JFrame {

    // se crea una variable de tipo entero cli
    int cli;
    
    //se crean contenedores para almacenar los datos ingresados en la ventana de registro
    String []nom=new String[50];
    String []ape= new String[50];
    String []dni = new String[50];
    String []tlf = new String[50];
    String []mail = new String[50];
    
    
    ButtonGroup Descuentos=new ButtonGroup();
    public Vendedor() {
        initComponents();
        Descuentos.add(rbt5);
        Descuentos.add(rbt7);
        Descuentos.add(rbt6);
        
        cboViajes.addItem("Seleccionar Viaje...");
        cboViajes.addItem("Lima-Ica");
        cboViajes.addItem("Lima-Nazca");
        cboViajes.addItem("Lima-Arequipa");
        cboViajes.addItem("Lima-Chachapoyas");
        cboViajes.addItem("Lima-Iquitos");
        cboViajes.addItem("Lima-Cuzco");
        
        setIconImage(new ImageIcon(getClass().getResource("../Imagen/icono.png")).getImage());
        //con este código la ventana aparece en el centro de la pantalla al ser inicializada
        this.setLocationRelativeTo(this);
        
        //se escribe como primer item en el combobox la palabra seleccionar
        cboCliente.addItem("Seleccionar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkSi = new javax.swing.JCheckBox();
        chkNo = new javax.swing.JCheckBox();
        lblMonto_Total = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbt7 = new javax.swing.JRadioButton();
        rbt6 = new javax.swing.JRadioButton();
        rbt5 = new javax.swing.JRadioButton();
        chkIgv = new javax.swing.JCheckBox();
        lblP_real = new javax.swing.JLabel();
        chk10_Puntos = new javax.swing.JCheckBox();
        chk5_Puntos = new javax.swing.JCheckBox();
        chk15_Puntos = new javax.swing.JCheckBox();
        cboViajes = new javax.swing.JComboBox();
        cboCliente = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        lblNomApe = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDatos = new javax.swing.JTextArea();
        btnMT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENDEDOR");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkSi.setText("Si");
        chkSi.setOpaque(false);
        getContentPane().add(chkSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 259, -1, -1));

        chkNo.setText("No");
        chkNo.setOpaque(false);
        getContentPane().add(chkNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 259, -1, -1));

        lblMonto_Total.setText(" ");
        lblMonto_Total.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lblMonto_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 464, 78, 23));

        jLabel9.setText("Precio Real");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 304, -1, -1));

        lblTelefono.setForeground(new java.awt.Color(153, 255, 255));
        lblTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 145, 214, 26));

        lblEmail.setForeground(new java.awt.Color(153, 255, 255));
        lblEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 177, 214, 26));

        jLabel6.setText("Dsct");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 341, -1, -1));

        rbt7.setText("7%");
        rbt7.setOpaque(false);
        getContentPane().add(rbt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 411, -1, -1));

        rbt6.setText("6%");
        rbt6.setOpaque(false);
        rbt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt6ActionPerformed(evt);
            }
        });
        getContentPane().add(rbt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 388, -1, -1));

        rbt5.setText("5%");
        rbt5.setOpaque(false);
        rbt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt5ActionPerformed(evt);
            }
        });
        getContentPane().add(rbt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 362, -1, -1));

        chkIgv.setText("18 %");
        chkIgv.setOpaque(false);
        getContentPane().add(chkIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        lblP_real.setText(" ");
        lblP_real.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lblP_real, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 78, 23));

        chk10_Puntos.setText("10%");
        chk10_Puntos.setOpaque(false);
        getContentPane().add(chk10_Puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 388, -1, -1));

        chk5_Puntos.setText("5%");
        chk5_Puntos.setOpaque(false);
        chk5_Puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk5_PuntosActionPerformed(evt);
            }
        });
        getContentPane().add(chk5_Puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 362, -1, -1));

        chk15_Puntos.setText("15%");
        chk15_Puntos.setOpaque(false);
        getContentPane().add(chk15_Puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 411, -1, -1));

        cboViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboViajesActionPerformed(evt);
            }
        });
        getContentPane().add(cboViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 221, 214, -1));

        cboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClienteActionPerformed(evt);
            }
        });
        getContentPane().add(cboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 31, 116, 26));

        jLabel2.setText("Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 31, 45, 26));

        lblNomApe.setForeground(new java.awt.Color(153, 255, 255));
        lblNomApe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblNomApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 214, 30));

        lblDNI.setForeground(new java.awt.Color(153, 255, 255));
        lblDNI.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 104, 214, 30));

        jLabel1.setText("Hospedaje");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 263, -1, -1));

        jLabel3.setText("IGV");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 20));

        jLabel4.setText("Monto Total");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 468, -1, -1));

        jLabel5.setText("Dsct por puntos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 341, -1, -1));

        taDatos.setColumns(20);
        taDatos.setRows(5);
        jScrollPane1.setViewportView(taDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 31, 239, 210));

        btnMT.setText("MT");
        btnMT.setBorderPainted(false);
        btnMT.setContentAreaFilled(false);
        btnMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTActionPerformed(evt);
            }
        });
        getContentPane().add(btnMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 464, -1, -1));

        jButton1.setText("Generar Ficha");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 100, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 530, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt6ActionPerformed

    private void rbt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt5ActionPerformed

    private void chk5_PuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk5_PuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk5_PuntosActionPerformed

    private void cboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClienteActionPerformed
        // se le asigna a la varible cli la posición que se seleccione en el combobox
        cli=cboCliente.getSelectedIndex();

        /*se crea un bucle que verifique en que posición se encuentra el combo box,
        y dependiendo de eso muestre los datos que ya han sido ingresados por cada cliente*/
        for (int i = 1; i < nom.length; i++) {
            if(cli==0){
                lblNomApe.setText("");
                lblDNI.setText("");
                lblTelefono.setText("");
                lblEmail.setText("");
            }else if(cli==i) {
                lblNomApe.setText(nom[i-1]);
                lblDNI.setText(dni[i-1]);
                lblTelefono.setText(tlf[i-1]);
                lblEmail.setText(mail[i-1]);
            }
        }

    }//GEN-LAST:event_cboClienteActionPerformed

    private void cboViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboViajesActionPerformed
        int pos=cboViajes.getSelectedIndex();
        
        switch(pos){
            case 1 : lblP_real.setText(""+350); break;
            case 2 : lblP_real.setText(""+500); break;
            case 3 : lblP_real.setText(""+700); break;
            case 4 : lblP_real.setText(""+900); break;
            case 5 : lblP_real.setText(""+1200); break;
            case 6 : lblP_real.setText(""+1500); break;
            default: lblP_real.setText("");
        }
    }//GEN-LAST:event_cboViajesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMTActionPerformed
    
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
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMT;
    public static javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox cboViajes;
    private javax.swing.JCheckBox chk10_Puntos;
    private javax.swing.JCheckBox chk15_Puntos;
    private javax.swing.JCheckBox chk5_Puntos;
    private javax.swing.JCheckBox chkIgv;
    private javax.swing.JCheckBox chkNo;
    private javax.swing.JCheckBox chkSi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMonto_Total;
    public static javax.swing.JLabel lblNomApe;
    private javax.swing.JLabel lblP_real;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JRadioButton rbt5;
    private javax.swing.JRadioButton rbt6;
    private javax.swing.JRadioButton rbt7;
    private javax.swing.JTextArea taDatos;
    // End of variables declaration//GEN-END:variables
}
