/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames_form;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Corine
 */
public class TestPane extends javax.swing.JPanel {

    // This is cheat for demonstration purposes, please don't do this
    // in production
//    private char[] password = "banana".toCharArray();

    public TestPane() {
        setLayout(new GridBagLayout());
        JButton btn = new JButton("Change password");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChangePasswordPane pane = new ChangePasswordPane();
                switch (JOptionPane.showConfirmDialog(TestPane.this, pane, "Change Password", JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_CANCEL_OPTION)) {
                    case JOptionPane.OK_OPTION:
                        char[] oldPassword = pane.getOldPassword();
                {
                    char[] password = null;
                    if (Arrays.equals(password, oldPassword)) {
                        password = pane.getNewPassword();
                        JOptionPane.showMessageDialog(TestPane.this, "Password was changed");
                    } else {
                        JOptionPane.showMessageDialog(TestPane.this, "Password mismatch, your old password does not match your current password");
                    }
                }
                        break;
                }
            }
        });

        add(btn);
    }
    
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
            java.util.logging.Logger.getLogger(InfoChangeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoChangeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoChangeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoChangeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestPane().setVisible(true);
            }
        });
    }
    
}
