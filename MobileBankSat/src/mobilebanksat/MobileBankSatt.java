package mobilebanksat;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class MobileBankSatt extends javax.swing.JFrame {

    double saldo;
    double hasil;
    String jawaban;
    int masukan;
    
    public MobileBankSatt() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSaldo = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        kolomOutput = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 320));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSaldo.setText("Cek Saldo");
        btnSaldo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 140, 40));

        btnTransfer.setText("Transfer");
        btnTransfer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 140, 40));

        btnDeposit.setText("Deposit");
        btnDeposit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 140, 40));

        kolomOutput.setEditable(false);
        kolomOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomOutputActionPerformed(evt);
            }
        });
        getContentPane().add(kolomOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 240, 80));

        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, 40));

        btnKeluar.setText("Keluar");
        btnKeluar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nayla Lovita\\Desktop\\mind map.PNG")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nayla Lovita\\Desktop\\TugasJaja.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
       
        try {
          saldo = hasil;
          jawaban = String.format(" %,.2f ",saldo);
        kolomOutput.setText("Saldo Anda : Rp. "+jawaban);  
        }
        catch (Exception e){}
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        kolomOutput.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    
    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
      String nama = JOptionPane.showInputDialog(rootPane, "Masukkan Nama");
      
      Mobank objek = new Mobank();
      objek.setTulis("Saldo Anda : Rp. ");
      try {
         masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
         if (saldo <= masukan){
         JOptionPane.showMessageDialog(rootPane, "Maaf Saldo Kurang!");
         }
         else if (saldo >= masukan){
         hasil = saldo - masukan;
         saldo = hasil;
         jawaban = String.format(" %,.2f ", hasil);
         kolomOutput.setText(objek.getTulis()+jawaban);
        JOptionPane.showMessageDialog(rootPane,"Saldo Anda Sekarang :"+ saldo+ "\n"+ "Berhasil transfer kepada "+nama+"sebesar :"+ masukan);
         }
      }
      catch (HeadlessException | NumberFormatException e){
      JOptionPane.showMessageDialog(rootPane, "Masukan input dengan benar!!");
      masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
      }
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
      Mobank objek = new Mobank();
      objek.setTulis("Saldo Anda :\nRp. ");
        
        try {  
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka max 10 digit : "));
        
        JOptionPane.showMessageDialog(rootPane, "Saldo Sekarang :" + (saldo+masukan));
        hasil = saldo + masukan;
        saldo = hasil;
        jawaban = String.format(" %,.2f ",saldo);
        kolomOutput.setText(objek.getTulis()+jawaban);
      }
      catch (Exception e) {
      JOptionPane.showMessageDialog(rootPane, "Masukan Inputan dengan benar!! :");
      }
    }//GEN-LAST:event_btnDepositActionPerformed

    private void kolomOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomOutputActionPerformed

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
            java.util.logging.Logger.getLogger(MobileBankSatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MobileBankSatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MobileBankSatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MobileBankSatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MobileBankSatt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kolomOutput;
    // End of variables declaration//GEN-END:variables
}
