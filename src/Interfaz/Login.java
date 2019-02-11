
package Interfaz;
import com.sun.glass.events.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(this);
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/logg.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        btniniciar = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 140, 40));

        txtuser.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, 30));

        btniniciar.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btniniciar.setText("INICIAR");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 200, 50));

        txtpassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
       
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
         String user, contra;
        user = txtuser.getText();
        contra = txtpassword.getText();
        if (user.equals("admin") && contra.equals("123")) {
            Menu_principal menu = new Menu_principal();
            menu.setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTO");
        }

    }//GEN-LAST:event_btniniciarActionPerformed

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
       char enter =evt.getKeyChar();
        if(enter==KeyEvent.VK_ENTER){
        this.setVisible(true);
        
        btniniciar.doClick();
        }
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
