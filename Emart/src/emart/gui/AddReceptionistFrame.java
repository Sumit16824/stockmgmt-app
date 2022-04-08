/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.gui;

import emart.dao.ReceptionistDAO;
import emart.pojo.Userpojo;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;


public class AddReceptionistFrame extends javax.swing.JFrame {

    Map <String,String> receptionists;
    public AddReceptionistFrame() {
        initComponents();
        loadReceptionistsDetils();
      
    }
      private int validateInputs(){
          if(txtpswd.getPassword().length < 4 || txtrepswd.getPassword().length < 4)
          {
              return 0;
          }
          else if(txtuserid.getText().trim().isEmpty()){
            return -1 ;  
          }
              
          return 1;
          
      }
      private boolean isPasswordMatching(String a , String b){
          return a.equals(b);
      }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnlogout2 = new javax.swing.JButton();
        btnback2 = new javax.swing.JButton();
        logindetailspanel = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemployeename = new javax.swing.JTextField();
        jcempid = new javax.swing.JComboBox<>();
        txtpswd = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtrepswd = new javax.swing.JPasswordField();
        txtuserid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.setEnabled(false);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Receptionist Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        btnlogout2.setBackground(new java.awt.Color(255, 0, 0));
        btnlogout2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout2.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout2.setText("LogOut");
        btnlogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogout2ActionPerformed(evt);
            }
        });

        btnback2.setBackground(new java.awt.Color(0, 0, 0));
        btnback2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback2.setForeground(new java.awt.Color(255, 255, 255));
        btnback2.setText("Back");
        btnback2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnback2)
                .addGap(25, 25, 25)
                .addComponent(btnlogout2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback2)
                    .addComponent(btnlogout2))
                .addContainerGap())
        );

        logindetailspanel.setBackground(new java.awt.Color(255, 204, 204));
        logindetailspanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receptionist Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        lbluser.setBackground(new java.awt.Color(255, 204, 204));
        lbluser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbluser.setText("Employee ID");

        lblpass.setBackground(new java.awt.Color(255, 204, 204));
        lblpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblpass.setText("Employee name");

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("UserId");

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password");

        txtemployeename.setEditable(false);

        jcempid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcempidActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Re-password");

        javax.swing.GroupLayout logindetailspanelLayout = new javax.swing.GroupLayout(logindetailspanel);
        logindetailspanel.setLayout(logindetailspanelLayout);
        logindetailspanelLayout.setHorizontalGroup(
            logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logindetailspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logindetailspanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblpass))
                    .addGroup(logindetailspanelLayout.createSequentialGroup()
                        .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbluser)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcempid, 0, 125, Short.MAX_VALUE)
                    .addComponent(txtpswd)
                    .addComponent(txtrepswd)
                    .addComponent(txtemployeename)
                    .addComponent(txtuserid))
                .addContainerGap())
        );
        logindetailspanelLayout.setVerticalGroup(
            logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logindetailspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluser)
                    .addComponent(jcempid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpass)
                    .addComponent(txtemployeename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logindetailspanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logindetailspanelLayout.createSequentialGroup()
                        .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtpswd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logindetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrepswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emartimages/Employees.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logindetailspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(btnadd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logindetailspanel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       int result =validateInputs();
       if(result==0){
             JOptionPane.showMessageDialog(null,"Password must be  atleast 4 characters long ");
             return ;        
       }
       if(result==-1){
            JOptionPane.showMessageDialog(null,"UserId cannot be left blank");
             return ; 
       }
       char [] pwd =txtpswd.getPassword();
       char [] repwd=txtrepswd.getPassword();
       String pswd=String.valueOf(pwd);
       String repswd=String.valueOf(repwd);
       if(isPasswordMatching(pswd,repswd)==false){
             JOptionPane.showMessageDialog(null,"Passwords do not Match ");
             return ;  
       }
       try{
           String empid=jcempid.getSelectedItem().toString();
           String userid=txtuserid.getText().toString();
           String username=txtemployeename.getText();
           Userpojo u=new Userpojo();
           u.setEmpid(empid);
           u.setUserid(userid);
           u.setUsername(username);
           u.setPassword(repswd);
           u.setUsertype("Receptionist");
           boolean status = ReceptionistDAO.addReceptionist(u);
           if(status){
                 JOptionPane.showMessageDialog(null,"Receotionist added successfully","Success !",JOptionPane.INFORMATION_MESSAGE);
                  clearText();
                 loadReceptionistsDetils();
                 return ;
           }
             JOptionPane.showMessageDialog(null,"Receotionist not added successfully","Errror!",JOptionPane.ERROR_MESSAGE);
       }
        catch(SQLException e){
             JOptionPane.showMessageDialog(null,"DB Error","Error !",JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
             System.exit(1);
             
        }
       
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnlogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogout2ActionPerformed
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogout2ActionPerformed

    private void btnback2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback2ActionPerformed
        ManageReceptionist vemp=new   ManageReceptionist ();
        vemp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnback2ActionPerformed

    private void jcempidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcempidActionPerformed
      if(jcempid.getItemCount()==0)
          return;
        txtemployeename.setText(receptionists.get(jcempid.getSelectedItem().toString()));
    }//GEN-LAST:event_jcempidActionPerformed

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
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback2;
    private javax.swing.JButton btnlogout2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcempid;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluser;
    private javax.swing.JPanel logindetailspanel;
    private javax.swing.JTextField txtemployeename;
    private javax.swing.JPasswordField txtpswd;
    private javax.swing.JPasswordField txtrepswd;
    private javax.swing.JTextField txtuserid;
    // End of variables declaration//GEN-END:variables

    private void loadReceptionistsDetils() {
      
        try{
            receptionists =ReceptionistDAO.getNonRegisteredReceptionist();
            if(receptionists.isEmpty()){
                  JOptionPane.showMessageDialog(null,"No unregistered receptionists present");
                  btnadd.setEnabled(false);
                  return;
            }
            btnadd.setEnabled(true);
            Set keys=receptionists.keySet();
            Iterator <String> it=keys.iterator();
            jcempid.removeAllItems();
            while(it.hasNext()){
                jcempid.addItem(it.next());
                
            }
        }
         catch(SQLException e){
             JOptionPane.showMessageDialog(null,"DB Error","Error !",JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
             System.exit(1);
             
        }
    
    }

    private void clearText() {
      txtpswd.setText("");
      txtrepswd.setText("");
      txtuserid.setText("");
      
    }
}
