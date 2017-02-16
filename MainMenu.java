package javaapplication1;

import java.awt.BorderLayout;
/**A border layout lays out a container, arranging and resizing its components to fit in five regions: 
    North, South, East, West, and Center.
    * Declaration-public class BorderLayout
                   extends Object
                      implements LayoutManager2, Serializable

*/
import javax.swing.JFrame;    
/**Adds support for the swing component architecture.
  *declaration--public class JFrame
                        extends Frame
                          implements WindowConstants,Accessible, RootPaneContainer
*/
import javax.swing.JPanel;   
  /*JPanel is a generic lightweight container(java servelet).
   *declaration--public class JPanel
                        extends Panel
                          implements Accessible
    
*/


public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form login
     */
    public MainMenu() {            //MainMenu is a constructor.
        initComponents();          //initComponents is a method which is inside  @SuppressWarnings("unchecked") generated code.
    }

   
   @SuppressWarnings("unchecked") 
   /** This method is called from within the constructor to initialize the form.
    * This will be generated while creating JFrame Form for the application.As this code is 
   automatically generated while creating JFrame Form so, code will change when we change 
   the design of .
   
   * Inside this code we have used 1-Label i.e. Graphical User Password and two buttons
   i.e. one for register and another for login.
   
   * If the user is new so he will click on register from where he will go to register page.
   and if the user is already registered then he will click login from where he will move to login page.
    */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lbl_head = new javax.swing.JLabel();//label heading is generated with lbl_head.
        btn_register = new javax.swing.JButton();//register button is created with btn_register.
        btn_login = new javax.swing.JButton();//login button is created with btn_login.

        setBackground(new java.awt.Color(51, 255, 255));//with this we will set the background color.
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));//to set border we use this.

        lbl_head.setBackground(new java.awt.Color(0, 153, 153));//to set the background for the lbl_head.
        lbl_head.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N TO set the font of the lbl_head.
        lbl_head.setForeground(new java.awt.Color(0, 0, 153));//to set the forground of the setforeground.
        lbl_head.setText("Graphical User Password");//name of lbl_head is updated to "Graphical User Password"

        btn_register.setBackground(new java.awt.Color(0, 204, 204));//to set background color of the register button.
        btn_register.setForeground(new java.awt.Color(102, 102, 255));//to set the foreground color of the register button
        btn_register.setText("Register New User");//here we are writing the register button as Register New User.
        btn_register.setToolTipText("");
        btn_register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));//here we are setting border.
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(0, 204, 204));//to set the background color of the login button.
        btn_login.setForeground(new java.awt.Color(102, 102, 255));//to set the foreground of the 
        btn_login.setText("User Login");//to change the name of the "User Login".
        btn_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));//to set the border of the UserLogin
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            /*
            here, we are using the layout of the buttons and label and the horizontal spacing between buttons and label.
            */
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btn_register))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btn_login)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(lbl_head, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            /*
            here we are doing vertical layout of the buttons and the label and the spacing between the buttons and labels.
            */
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbl_head)
                .addGap(66, 66, 66)
                .addComponent(btn_register)
                .addGap(18, 18, 18)
                .addComponent(btn_login)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>                        
   /*
    lbl_head is label-which will be used for heading.
   btn_register is a button -which will be used for moving to register page.
   btn_login is a button -which will be used for moving to login page.
   */
    
    
    
   
    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code 
        /*
          This method will be used for the register button as what is the action performed while clicking the register.
          The user will move to register page.
        */
        
        JPanel reg = new register(); //Adding a register.java component to the panel (which will be made by other group member).
        JFrame frame = new JFrame();//we are creating a window frame just like other java objects.
        frame.setBounds(0, 0, 600, 450);
        /*setBounds is used to define the bounding rectangle of a register button. This includes it's position and size.
         *setBounds(x, y, width, height) is use to specify the position and size of a GUI component.
        */
        frame.add(reg);
        /*
          We can use the method add(component) to add a component to the frame's content pane.
        eg-frame.add(child);
        And the child will be added to the contentPane. The content pane will always be non-null.
        */
        frame.setVisible(true); 
        /*
        * if frame.setVisible is set false then the confirm will confirm it but it wont move to register page.
        *if frame.setVisible is set to true it will move to register page.
        */
    }                                            

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
        /*
          This method will be used for the login button as what is the action performed while clicking the login.
          The user will move to login page.
        */
        JPanel log = new login();//Adding a register.java component to the panel (which will be made by other group member).
        JFrame frame = new JFrame();//we are creating a window frame just like other java objects.
        frame.setBounds(0, 0, 600, 600);
        /*setBounds is used to define the+ bounding rectangle of a register button. This includes it's position and size.
         *setBounds(x, y, width, height) is use to specify the position and size of a GUI component.
        */
       
        frame.add(log);
        /*
          We can use the method add(component) to add a component to the frame's content pane.
        eg-frame.add(child);
        And the child will be added to the contentPane. The content pane will always be non-null.
        */
        frame.setVisible(false);
       /*
        * if frame.setVisible is set false then the confirm will confirm it but it won't move to login page.
        *if frame.setVisible is set to true it will move to login page.
        */
    }                                         


    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel lbl_head;
    // End of variables declaration                   
}
