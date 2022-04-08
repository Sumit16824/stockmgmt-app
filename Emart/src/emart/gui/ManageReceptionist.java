
package emart.gui;


public class ManageReceptionist extends javax.swing.JFrame {

    public ManageReceptionist() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnaddemp = new javax.swing.JButton();
        btnupdateemp = new javax.swing.JButton();
        btnremoveemp = new javax.swing.JButton();
        btnviewemp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btnlogout1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnlogout2 = new javax.swing.JButton();
        btnback1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnaddreceptionist = new javax.swing.JButton();
        btnupdatereceptionist1 = new javax.swing.JButton();
        btnremovereceptionist = new javax.swing.JButton();
        btnviewemp1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)), "Select Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        btnaddemp.setBackground(new java.awt.Color(0, 0, 0));
        btnaddemp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnaddemp.setForeground(new java.awt.Color(255, 255, 255));
        btnaddemp.setText("Add Employee");
        btnaddemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddempActionPerformed(evt);
            }
        });

        btnupdateemp.setBackground(new java.awt.Color(0, 0, 0));
        btnupdateemp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnupdateemp.setForeground(new java.awt.Color(255, 255, 255));
        btnupdateemp.setText("Update Employess");
        btnupdateemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateempActionPerformed(evt);
            }
        });

        btnremoveemp.setBackground(new java.awt.Color(0, 0, 0));
        btnremoveemp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnremoveemp.setForeground(new java.awt.Color(255, 255, 255));
        btnremoveemp.setText("Remove Employees");
        btnremoveemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveempActionPerformed(evt);
            }
        });

        btnviewemp.setBackground(new java.awt.Color(0, 0, 0));
        btnviewemp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnviewemp.setForeground(new java.awt.Color(255, 255, 255));
        btnviewemp.setText("View Employees");
        btnviewemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewempActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnremoveemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnaddemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnviewemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdateemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnaddemp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdateemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnviewemp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremoveemp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emartimages/Employees.jpg"))); // NOI18N

        btnback.setBackground(new java.awt.Color(0, 0, 0));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnlogout1.setBackground(new java.awt.Color(255, 0, 0));
        btnlogout1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout1.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout1.setText("LogOut");
        btnlogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogout1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));

        jPanel4.setBackground(new java.awt.Color(153, 102, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Receptionists Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        btnlogout2.setBackground(new java.awt.Color(255, 0, 0));
        btnlogout2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout2.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout2.setText("LogOut");
        btnlogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogout2ActionPerformed(evt);
            }
        });

        btnback1.setBackground(new java.awt.Color(0, 0, 0));
        btnback1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback1.setForeground(new java.awt.Color(255, 255, 255));
        btnback1.setText("Back");
        btnback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnback1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlogout2)
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback1)
                    .addComponent(btnlogout2))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emartimages/Employees.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)), "Select Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        btnaddreceptionist.setBackground(new java.awt.Color(0, 0, 0));
        btnaddreceptionist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnaddreceptionist.setForeground(new java.awt.Color(255, 255, 255));
        btnaddreceptionist.setText("Add Receptionist");
        btnaddreceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddreceptionistActionPerformed(evt);
            }
        });

        btnupdatereceptionist1.setBackground(new java.awt.Color(0, 0, 0));
        btnupdatereceptionist1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnupdatereceptionist1.setForeground(new java.awt.Color(255, 255, 255));
        btnupdatereceptionist1.setText("Update Receptionist");
        btnupdatereceptionist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatereceptionist1ActionPerformed(evt);
            }
        });

        btnremovereceptionist.setBackground(new java.awt.Color(0, 0, 0));
        btnremovereceptionist.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnremovereceptionist.setForeground(new java.awt.Color(255, 255, 255));
        btnremovereceptionist.setText("Remove Receptionist");
        btnremovereceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremovereceptionistActionPerformed(evt);
            }
        });

        btnviewemp1.setBackground(new java.awt.Color(0, 0, 0));
        btnviewemp1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnviewemp1.setForeground(new java.awt.Color(255, 255, 255));
        btnviewemp1.setText("View Receptionist");
        btnviewemp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewemp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnremovereceptionist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnaddreceptionist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnupdatereceptionist1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddreceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdatereceptionist1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnviewemp1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremovereceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        ManageEmployeesFrame vemp=new  ManageEmployeesFrame();
        vemp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnlogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogout1ActionPerformed
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogout1ActionPerformed

    private void btnaddempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddempActionPerformed
        AddReceptionistFrame addemp = new   AddReceptionistFrame();
        addemp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnaddempActionPerformed

    private void btnupdateempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateempActionPerformed
        UpdateReceptionistFrame uemp = new UpdateReceptionistFrame ();
        uemp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnupdateempActionPerformed

    private void btnremoveempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveempActionPerformed
        RemoveReceptionistFrame ms=new RemoveReceptionistFrame();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnremoveempActionPerformed

    private void btnviewempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewempActionPerformed
        ViewAllEmployeesFrame vemp=new ViewAllEmployeesFrame();
        vemp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnviewempActionPerformed

    private void btnlogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogout2ActionPerformed
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogout2ActionPerformed

    private void btnback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback1ActionPerformed
        ManagerFrame vemp=new ManagerFrame();
        vemp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnback1ActionPerformed

    private void btnaddreceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddreceptionistActionPerformed
        AddReceptionistFrame addrmp = new AddReceptionistFrame();
        addrmp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnaddreceptionistActionPerformed

    private void btnupdatereceptionist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatereceptionist1ActionPerformed
        UpdateReceptionistFrame uemp = new  UpdateReceptionistFrame();
        uemp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnupdatereceptionist1ActionPerformed

    private void btnremovereceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremovereceptionistActionPerformed
        RemoveReceptionistFrame ms=new  RemoveReceptionistFrame();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnremovereceptionistActionPerformed

    private void btnviewemp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewemp1ActionPerformed
        ViewAllReceptionistFrame vemp=new ViewAllReceptionistFrame();
        vemp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnviewemp1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReceptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddemp;
    private javax.swing.JButton btnaddreceptionist;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnback1;
    private javax.swing.JButton btnlogout1;
    private javax.swing.JButton btnlogout2;
    private javax.swing.JButton btnremoveemp;
    private javax.swing.JButton btnremovereceptionist;
    private javax.swing.JButton btnupdateemp;
    private javax.swing.JButton btnupdatereceptionist1;
    private javax.swing.JButton btnviewemp;
    private javax.swing.JButton btnviewemp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
