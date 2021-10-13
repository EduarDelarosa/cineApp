/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author EDUARD
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    ArrayList<Usuarios> usuario;
    String usu,passw;
    String user = "EDUARD009";
    String pass = "CONTRA123";
    String user2 = "CAJERO1";
    String pass2 = "CAJERO123";
    
    public FrmLogin() {
        initComponents();
        txtUsuario.setText("");
        txtPass.setText("");
        
        usuario = new ArrayList();
        
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnEnviar = new javax.swing.JButton();
        rbSupervisor = new javax.swing.JRadioButton();
        rbCajero = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresar al sistema");

        txtPass.setText("jPasswordField1");

        btnEnviar.setText("Ingresar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSupervisor);
        rbSupervisor.setText("Supervisor");

        buttonGroup1.add(rbCajero);
        rbCajero.setText("Cajero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnEnviar)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(rbSupervisor)
                .addGap(18, 18, 18)
                .addComponent(rbCajero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSupervisor)
                    .addComponent(rbCajero))
                .addGap(8, 8, 8)
                .addComponent(btnEnviar)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
            usu = txtUsuario.getText().toUpperCase();
            passw = txtPass.getText().toUpperCase();
//        for (int i = 0; i < usuario.size(); i++) {
            if(user.equals(usu) && pass.equals(passw) &&  rbSupervisor.isSelected()){
                FrmSupervisor formS = new FrmSupervisor();
                formS.setVisible(true);
            }else if(user2.equals(usu) && pass2.equals(passw) && rbCajero.isSelected()){
                FrmCajero formC = new FrmCajero();
                formC.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Datos incorrectos");
            }
    }//GEN-LAST:event_btnEnviarActionPerformed

        
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbCajero;
    private javax.swing.JRadioButton rbSupervisor;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
