/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;//it manages colors in a portable, platform-independent fashion.Awt classes are contained in this package.
import java.awt.Graphics;//Encapsulates the graphics context. This context is used by the various output methods to display output in a window.
import java.awt.HeadlessException;
/*Thrown when code that is dependent on a keyboard, display,
or mouse is called in an environment that does not support a keyboard, display, or mouse.
*/
import java.sql.Connection;//This is used to establish a sql connection.
import java.sql.DriverManager;//This is used to manage the driver of the sql driver.
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;// this is used to accept the exception of the sql.
/*
 All the above sql components are used to establish connection with the SQLite and other Sql related information is provided
 in these package.
*/
import java.util.Random;
/*The java.util.Random class instance is used to generate a stream of pseudorandom numbers.
public class Random
   extends Object
   implements Serializable
*/
import javax.swing.JOptionPane;
/* The class JOptionPane is a component which provides standard methods to pop up
   a standard dialog box for a value or informs the user of something.
public class JOptionPane
   extends JComponent
      implements Accessible
*/


/**
 *
 * @author pro
 */
public class login extends javax.swing.JPanel {
    /**
     * Creates new form login
     */
    public static Connection conn = null; //earlier connection is set to null.
    ResultSet rs = null;//also the result set is also set to null
    PreparedStatement pst = null;//here, prepared statement is also null
    Color db_color=null;// database_color is also null.This is the value stored in the database.
    String db_password="";//Here, we have set the database_Password to null.
      boolean email_verified = false;//The emailvarified in the beginning is also null.
      Color [] color_set ={Color.BLUE,Color.YELLOW,Color.ORANGE,Color.LIGHT_GRAY,Color.RED,Color.PINK,Color.CYAN,Color.GREEN};
     //color_set is the color of the wheel of the graphical password. The first value is in blue, followed by other colors.
      
      public char[][] number_set={{'7','6'},{'5','4'},{'3','2'},{'g','h'},{'e','f'},{'c','d'},{'b','a'},{'1','8'},};
      //={{'7','6'},{'5','4'},{'3','2'},{'g','h'},{'e','f'},{'c','d'},{'b','a'},{'1','8'},};
      //this is value represented in the wheel. Blue color contains 7,6 followed by other color.
       

   public login() { //this is the method in which the user will use the graphical wheel to login the site.
        initComponents(); //this is the init component which will be described in the beginning.     
        btn_anti_clock_rotate.setVisible(false); //when we click the anti-clock wise button the dial will move anti-clockwise.
        btn_clock_rotate.setVisible(false);//when we click the clockwise button the dial will move clockwise.
        btn_outer_orbit.setVisible(false);//here outer orbit is set, And when we click outer orbit value from the outer orbit will be taken
        btn_inner_orbit.setVisible(false);//here inner orbit is set, And when we click inner orbit value from the inner orbit will be taken
        txt_password.setEditable(false);//here password is cannot be editable.
        txt_password.setEnabled(false);
        txt_password.setVisible(false);//Here password is not set to visible.
        lbl_password.setVisible(false);
        btn_confirm.setVisible(false);//this is the confirm button. It is used when the password is set and we have to confirm the button.
        btn_clear.setVisible(false);//this will help in clearing the password from the password box.
    }
   
     public void rotate_anti_clock()
/*this method is used when we have to rotate the wheel anti clockwise.Here, we are using the 
   circular queue.          
  */           
     {
        int i=0;      
        Color c = color_set[0];
        for(i=0;i<7;i++)
        {
           color_set[i] = color_set[i+1];
        }
        color_set[i]=c;
     }
     
     public void rotate_clock() 
          /*this method is used when we have to  rotate the wheel clockwise.Here, we are using the 
   circular queue.
             */
     {
        int i=7;
        Color c = color_set[7];
        for(i=7;i>0;i--)
        {
           color_set[i] = color_set[i-1];
        }
        color_set[i]=c;
     }
     
     public void paintComponent(Graphics g) 
     /*
             this method is used to set the wheel with color and value in outer orbit and inner orbit.
             */
     {
        int i=0; 
        if(email_verified == false)
            /*if email is not varified. The user wont be able to see the wheel. When the user will varify the 
              correct email from the database. Then only user will able to see the graphical wheel.
            */
            return;
        for(i=0;i<8;i++)//This loop is used when we have to set the color.
        {
            g.setColor(color_set[i]); // for every i color will be different and the 
            g.fillArc(170, 100, 200,200, i*45,45);//here we are filling the arc
        }
        g.setColor(Color.BLACK);//the current value is set to black(null).
        /*
        At the bottom we are setting the value in every arc of the wheel in inner orbit and outer orbit.
        */
        g.drawString("4", 285, 130);
        g.drawString("5", 285, 160);
        g.drawString("2", 245, 130);
        g.drawString("3", 245, 160);
        g.drawString("6", 335, 160);
        g.drawString("7", 315, 190);
        g.drawString("1", 325, 220);
        g.drawString("8", 345, 250);
        g.drawString("b", 295, 250);
        g.drawString("a", 305, 270);
        g.drawString("c", 255, 250);
        g.drawString("d", 235, 270);
        g.drawString("e", 225, 220);
        g.drawString("f", 195, 220);
        g.drawString("g", 225, 190);
        g.drawString("h", 195, 190);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btn_anti_clock_rotate = new javax.swing.JButton();
        btn_clock_rotate = new javax.swing.JButton();
        btn_outer_orbit = new javax.swing.JButton();
        btn_inner_orbit = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        btn_email_verify = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 255));
        setForeground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Login");

        jLabel2.setText("Email");

        btn_anti_clock_rotate.setText("Anti-Clockwise Rotation");
        btn_anti_clock_rotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anti_clock_rotateActionPerformed(evt);
            }
        });

        btn_clock_rotate.setText("Clockwise Rotation");
        btn_clock_rotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clock_rotateActionPerformed(evt);
            }
        });

        btn_outer_orbit.setText("Outer Orbit");
        btn_outer_orbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_outer_orbitActionPerformed(evt);
            }
        });

        btn_inner_orbit.setText("Inner Orbit");
        btn_inner_orbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inner_orbitActionPerformed(evt);
            }
        });

        btn_confirm.setText("Confirm");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        lbl_password.setText("Password:");

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        btn_email_verify.setBackground(new java.awt.Color(0, 204, 204));
        btn_email_verify.setText("Verify");
        btn_email_verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_email_verifyActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btn_anti_clock_rotate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btn_outer_orbit)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_inner_orbit))
                    .addComponent(btn_clock_rotate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lbl_password)
                .addGap(18, 18, 18)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_confirm)
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_clear)
                            .addComponent(btn_email_verify))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_email_verify))
                .addGap(247, 247, 247)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_anti_clock_rotate)
                    .addComponent(btn_clock_rotate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_outer_orbit)
                    .addComponent(btn_inner_orbit)
                    .addComponent(btn_clear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_confirm)
                    .addComponent(lbl_password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void btn_anti_clock_rotateActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
        /*
        here, in this method we are using the anti-clockwise button to move the wheel in anticlockwise direction.
        every time we move the button to anticlockwise we shift one color in anti-clockwise direction.
        */
        rotate_clock();
        this.repaint();
    }                                                     

    private void btn_outer_orbitActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        /*
        In this method, if the color is same as the datbase color then the value taken from that color sent to the password box.
        */
        for(int i=0;i<8;i++)
        {
            if(color_set[i] == db_color)//when color is same as database color, then..
            {
                char ff=number_set[i][1];
                txt_password.setText(txt_password.getText()+ff);//here, after adding every time password is entered, it will concatinate in the password box.
            }
        }
    }                                               

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        /*
        In this method the action performed when we enter the password and then enter the confirm button.
        then this method will confirm the password from the database and allow user to move to the main page.
        */
        String pass = txt_password.getText();
        if(pass.equals(db_password))  //Here, If password is same as the database_password.
        {
            JOptionPane.showMessageDialog(null, "Password OK");//password is ok
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Incorrect Password");//password is incorrect.
        }
    }                                           

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        //in this method we are using the password text box to enter the password in the text box.
    }                                            

    private void btn_clock_rotateActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        /*
        here, in this method we are using the anti-clockwise button to move the wheel in anticlockwise direction.
        every time we move the button to anticlockwise we shift one color in anti-clockwise direction.
        */
        
        rotate_anti_clock();
        this.repaint();
        //every time we move the color we repaint the wheel to the next color.
    }                                                

    
    private void btn_inner_orbitActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        /*
        In this method, if the color is same as the datbase color then the value taken from that color sent to the password box.
        */
        for(int i=0;i<8;i++)
        {
            if(color_set[i] == db_color)//when color is same as database color, then..
            {
                char ff=number_set[i][0];
                txt_password.setText(txt_password.getText()+ff);//here, after adding every time password is entered, it will concatinate in the password box.
            }
        }
    }                                               

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        /*
        In this method, we have to perfrom an action on the password text box when we click the clear button. 
        This will clear the complete password box in case we have entered the wrong password.
        */
        txt_password.setText("");
    }                                         


    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_anti_clock_rotate;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_clock_rotate;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_email_verify;
    private javax.swing.JButton btn_inner_orbit;
    private javax.swing.JButton btn_outer_orbit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_password;
    // End of variables declaration                   
}
