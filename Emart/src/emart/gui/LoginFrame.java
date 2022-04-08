
package emart.gui;

import emart.dao.UserDAO;
import emart.pojo.UserProfile;
import emart.pojo.Userpojo;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame {

    String userid,password;
    public LoginFrame() {
        initComponents();
    }
private boolean validateInputs(){
    
    userid=txtuser.getText().trim();
    char [] pwd=txtpass.getPassword();
    password=String.valueOf(pwd).trim();
    if(userid.isEmpty()||password.isEmpty())
    return false ;
    return true;
  
}
  private String getUsertype(){
        if(jrbmanager.isSelected())
      return jrbmanager.getText();
        else if(jrbReceptionist.isSelected())
            return jrbReceptionist.getText();
        else 
            return null;
        
        
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userpanel = new javax.swing.JPanel();
        jrbReceptionist = new javax.swing.JRadioButton();
        jrbmanager = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        logindetailspanel = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        lblpass = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnquit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(153, 0, 0));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login Panel");

        userpanel.setBackground(new java.awt.Color(255, 102, 102));
        userpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        jrbReceptionist.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(jrbReceptionist);
        jrbReceptionist.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jrbReceptionist.setForeground(new java.awt.Color(255, 255, 255));
        jrbReceptionist.setText("Receptionist");
        jrbReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbReceptionistActionPerformed(evt);
            }
        });

        jrbmanager.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(jrbmanager);
        jrbmanager.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jrbmanager.setForeground(new java.awt.Color(255, 255, 255));
        jrbmanager.setText("Manager");

        javax.swing.GroupLayout userpanelLayout = new javax.swing.GroupLayout(userpanel);
        userpanel.setLayout(userpanelLayout);
        userpanelLayout.setHorizontalGroup(
            userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userpanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jrbmanager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbReceptionist)
                .addGap(22, 22, 22))
        );
        userpanelLayout.setVerticalGroup(
            userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userpanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbReceptionist)
                    .addComponent(jrbmanager))
                .addGap(25, 25, 25))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emartimages/login.jpg.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");

        logindetailspanel.setBackground(new java.awt.Color(204, 51, 0));
        logindetailspanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        lbluser.setBackground(new java.awt.Color(255, 255, 255));
        lbluser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 255, 255));
        lbluser.setText("User ID");

        lblpass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 255, 255));
        lblpass.setText("Password");

        btnlogin.setBackground(new java.awt.Color(0, 51, 51));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnquit.setBackground(new java.awt.Color(255, 0, 0));
        btnquit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnquit.setForeground(new java.awt.Color(255, 255, 255));
        btnquit.setText("Quit");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logindetailspanelLayout = new javax.swing.GroupLayout(logindetailspanel);
        logindetailspanel.setLayout(logindetailspanelLayout);
        logindetailspanelLayout.setHorizontalGroup(
            logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logindetailspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logindetailspanelLayout.createSequentialGroup()
                        .addComponent(btnlogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnquit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(logindetailspanelLayout.createSequentialGroup()
                        .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbluser)
                            .addComponent(lblpass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(txtuser))))
                .addContainerGap())
        );
        logindetailspanelLayout.setVerticalGroup(
            logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logindetailspanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluser)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpass)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnquit)
                    .addComponent(btnlogin))
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(logindetailspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(207, 207, 207))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logindetailspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbReceptionistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbReceptionistActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
       if(!validateInputs()){
           JOptionPane.showMessageDialog(null,"Please fill all the fields","Incomplete Data ",JOptionPane.ERROR_MESSAGE);
       return;
       }
       String Usertype=getUsertype();
       if(Usertype==null)
       {
            JOptionPane.showMessageDialog(null,"Please select usertype","Incomplete Data ",JOptionPane.ERROR_MESSAGE);
       return;
           
       }
       Userpojo u = new Userpojo();
       u.setUserid(txtuser.getText().trim());
       u.setPassword(txtpass.getText().trim());
       u.setUsertype(Usertype);
       try{
           boolean result=UserDAO.validateUser(u);
                   if(result==false){
                        JOptionPane.showMessageDialog(null,"Invalid userid/password/usertype","Incomplete Data ",JOptionPane.ERROR_MESSAGE);
                        return;
                       
                   }
                   UserProfile.setUserid(userid);
                   UserProfile.setUsertype( Usertype);
                   if(Usertype.equalsIgnoreCase("Manager"))
                   {
                 ManagerFrame mframe=new ManagerFrame();
                 mframe.setVisible(true);
                 this.dispose();
                 
                   }
                   else {
                 ReceptionistOptionFrame rframe=new  ReceptionistOptionFrame();
                 rframe.setVisible(true);
                 this.dispose();
                   }
       
       }
         catch(SQLException e)
            
          {
             JOptionPane.showMessageDialog(null,"DataBase Error"," Error!",JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
             
             
          }
       
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
   System.exit(0);
    }//GEN-LAST:event_btnquitActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnquit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jrbReceptionist;
    private javax.swing.JRadioButton jrbmanager;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPanel logindetailspanel;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    private javax.swing.JPanel userpanel;
    // End of variables declaration//GEN-END:variables
}
