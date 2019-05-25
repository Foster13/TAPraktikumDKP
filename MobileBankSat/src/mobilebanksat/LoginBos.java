package mobilebanksat;

import javax.swing.JOptionPane;

public class LoginBos extends javax.swing.JFrame {
    
        static String user(){
        return "Masukan Username";
        }
        static String passwd(){
        return "Masukan Username";
        }
            
    public LoginBos() {
        initComponents();
        kolomNama.setText(user());
        kolomPassword.setText(passwd());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kolomNama = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        kolomPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 320));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kolomNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomNamaActionPerformed(evt);
            }
        });
        getContentPane().add(kolomNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, 50));

        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 40));

        btnExit.setText("EXIT");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 90, 40));

        kolomPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(kolomPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nayla Lovita\\Desktop\\mind map.PNG")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 110, 40));

        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setText("<USER INI");
        getContentPane().add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 100, 40));

        labelPass.setForeground(new java.awt.Color(255, 255, 255));
        labelPass.setText("<PASSWORD");
        getContentPane().add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nayla Lovita\\Desktop\\TugasAkhirJaja.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -60, 630, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        if (kolomNama.getText(). equals ("Mfaza13")){
        if (kolomPassword.getText(). equals ("12345678")){
                    
        new MobileBankSatt().setVisible(true);
        this.dispose(); }
        else {
    
        JOptionPane.showMessageDialog(rootPane, "<error> Password Salah, Silahkan Coba Lagi");
        kolomPassword.setText("");
        kolomPassword.requestFocus(); }}
        else{
        JOptionPane.showMessageDialog(rootPane, "<error> Nama Salah, Silahkan Coba Lagi");
        kolomNama.setText("");
        kolomPassword.setText("");
        kolomNama.requestFocus(); 
        }  
        
        
        //String labelUser = "Jaja";
        //String labelPass = "123456";
        //if(labelUser.equalsIgnoreCase(kolomNama.getText()) && labelPass.equalsIgnoreCase(kolomPassword.getText())) {
            //this.setVisible(false);
            //new MobileBankSatt().setVisible(true);
        //} else{
            //JOptionPane.showMessageDialog(null, "Maaf user atau password anda salah");
           //kolomNama.setText("");
            //kolomPassword.setText("");
            //kolomNama.requestFocus();
            //}
         
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void kolomNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomNamaActionPerformed
        
    }//GEN-LAST:event_kolomNamaActionPerformed

    private void kolomPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomPasswordActionPerformed
        
    }//GEN-LAST:event_kolomPasswordActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(LoginBos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginBos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginBos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginBos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginBos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kolomNama;
    private javax.swing.JPasswordField kolomPassword;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUser;
    // End of variables declaration//GEN-END:variables

    private void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
