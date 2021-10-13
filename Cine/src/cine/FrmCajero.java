/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author EDUARD
 */
public class FrmCajero extends javax.swing.JFrame {

    /**
     * Creates new form FrmCajero
     */
    double regular = 11000;
    double confort = 25000;
    double presi = 68000;
    int valor,cantidadAsientos;
    String nombreCliente, pelicula;
    double total, tipoAsiento;
    ArrayList<RegistroVenta> registro;
    
    public FrmCajero() {
        initComponents();
        
        txtNombreCliente.setText("");
        lbTotalP.setText("0");
        btnRegistro.setEnabled(false);
        
        registro = new ArrayList();
    }
    
    public void guardarDatos(){
        nombreCliente = txtNombreCliente.getText();
        cantidadAsientos = (int)jspAsientos.getValue();
        total = total;
        if(rbRegular.isSelected()){
            tipoAsiento = regular;
        }else if(rbConfort.isSelected()){
            tipoAsiento = confort;
        }else if(rbPresidencial.isSelected()){
            tipoAsiento = presi;
        }
        if(rbJuanito.isSelected()){
            pelicula = "juanito";
        }else if(rbAlicia.isSelected()){
            pelicula = "Alicia";
        }else if(rbCuentos.isSelected()){
            pelicula = "12 cuentos";
        }
        JOptionPane.showMessageDialog(rootPane, "Datos Ingresados");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbConfort = new javax.swing.JRadioButton();
        rbPresidencial = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rbJuanito = new javax.swing.JRadioButton();
        jspAsientos = new javax.swing.JSpinner();
        rbAlicia = new javax.swing.JRadioButton();
        rbCuentos = new javax.swing.JRadioButton();
        btnFacturar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lbTotalP = new javax.swing.JLabel();
        rbRegular = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Caja 1");

        jLabel2.setText("Nombre Cliente");

        buttonGroup1.add(rbConfort);
        rbConfort.setText("Confort");
        rbConfort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConfortActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPresidencial);
        rbPresidencial.setText("Presidencial");
        rbPresidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPresidencialActionPerformed(evt);
            }
        });

        jLabel6.setText("Cartelera");

        buttonGroup2.add(rbJuanito);
        rbJuanito.setText("Juanito y los clonosaurios");

        buttonGroup2.add(rbAlicia);
        rbAlicia.setText("Alicia en calzones");

        buttonGroup2.add(rbCuentos);
        rbCuentos.setText("12 cuentos cortos");

        btnFacturar.setText("Facturar");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad de asientos");

        jLabel4.setText("Total Pagado");

        txtNombreCliente.setText("jTextField1");

        lbTotalP.setText("jLabel5");

        buttonGroup1.add(rbRegular);
        rbRegular.setText("Regular");
        rbRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRegularActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de asiento");

        btnRegistro.setText("Registros");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbCuentos)
                                    .addComponent(rbAlicia)
                                    .addComponent(rbJuanito))
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jspAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(113, 113, 113))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lbTotalP)
                                .addGap(340, 340, 340))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbRegular))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbConfort)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbPresidencial))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(btnFacturar)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistro)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRegular)
                    .addComponent(rbConfort)
                    .addComponent(rbPresidencial))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jspAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lbTotalP))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbJuanito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbAlicia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCuentos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFacturar)
                    .addComponent(btnRegistro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbConfortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConfortActionPerformed
        // TODO add your handling code here:
        valor = (int)jspAsientos.getValue();
        double tot = confort*valor;
        total = tot;
        lbTotalP.setText(""+tot);
    }//GEN-LAST:event_rbConfortActionPerformed

    private void rbPresidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPresidencialActionPerformed
        // TODO add your handling code here:
        valor = (int)jspAsientos.getValue();
        double tot = presi*valor;
        total = tot;
        lbTotalP.setText(""+tot);
    }//GEN-LAST:event_rbPresidencialActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        // TODO add your handling code here:
        guardarDatos();

        registro.add(new RegistroVenta(nombreCliente,pelicula,cantidadAsientos,tipoAsiento,total));
    }//GEN-LAST:event_btnFacturarActionPerformed

    private void rbRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRegularActionPerformed
        // TODO add your handling code here:
        valor = (int)jspAsientos.getValue();
        double tot = regular*valor;
        total = tot;
        lbTotalP.setText("" + tot);
    }//GEN-LAST:event_rbRegularActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        FrmRegistros formRegistro = new FrmRegistros(this.nombreCliente, this.pelicula , this.cantidadAsientos , this.tipoAsiento, this.total);
        formRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jspAsientos;
    private javax.swing.JLabel lbTotalP;
    private javax.swing.JRadioButton rbAlicia;
    private javax.swing.JRadioButton rbConfort;
    private javax.swing.JRadioButton rbCuentos;
    private javax.swing.JRadioButton rbJuanito;
    private javax.swing.JRadioButton rbPresidencial;
    private javax.swing.JRadioButton rbRegular;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
