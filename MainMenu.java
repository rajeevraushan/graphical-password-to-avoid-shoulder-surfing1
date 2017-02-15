package javaapplication1;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu extends javax.swing.JPanel {

    
    public MainMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
   /*Sarthak Tyagi is doing the coding of this block.He will
   update the code on his github id */

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
        JPanel reg = new register();
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 600, 450);
        frame.add(reg);
        frame.setVisible(true);
    }                                            

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
        JPanel log = new login();
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 600, 600);
        frame.add(log);
        frame.setVisible(true);
    
    }                                         


    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel lbl_head;
    // End of variables declaration                   
}
