package javaapplication1;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu extends javax.swing.JPanel {

    
    public MainMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lbl_head = new javax.swing.JLabel();
        btn_register = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 255));

        lbl_head.setBackground(new java.awt.Color(0, 153, 153));
        lbl_head.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        lbl_head.setForeground(new java.awt.Color(0, 0, 153));
        lbl_head.setText("Graphical User Password");

        btn_register.setBackground(new java.awt.Color(0, 204, 204));
        btn_register.setForeground(new java.awt.Color(102, 102, 255));
        btn_register.setText("Register New User");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(0, 204, 204));
        btn_login.setForeground(new java.awt.Color(102, 102, 255));
        btn_login.setText("User Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btn_register))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btn_login))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lbl_head, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbl_head)
                .addGap(71, 71, 71)
                .addComponent(btn_register)
                .addGap(39, 39, 39)
                .addComponent(btn_login)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }

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
