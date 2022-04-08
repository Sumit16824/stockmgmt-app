
package emart.gui;

import emart.dao.OrderDAO;
import emart.dao.ProductsDAO;
import emart.pojo.ProductsPojo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BillingFrame extends javax.swing.JFrame {

    ArrayList<ProductsPojo>al=new ArrayList<>();
    DefaultTableModel tm;
    double grtotal=0.0;
    
    public BillingFrame() {
        initComponents();
        tm=(DefaultTableModel)jtProducts.getModel();
        txtProductId.requestFocus();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtProducts = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnbill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Billing Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 28))); // NOI18N

        jtProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product name", "Product Comapny", "Product Price", "Our Price", "Quantity", "Tax", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtProducts);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Product Id");

        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 0, 0));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnlogout.setBackground(new java.awt.Color(0, 0, 0));
        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnback)
                        .addGap(40, 40, 40)
                        .addComponent(btnlogout)
                        .addGap(69, 69, 69))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlogout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnback)
                        .addGap(16, 16, 16)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        btnbill.setBackground(new java.awt.Color(0, 0, 0));
        btnbill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnbill.setForeground(new java.awt.Color(255, 255, 255));
        btnbill.setText("Generate Bill");
        btnbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(btnbill)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbill)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductsMouseClicked
    

    }//GEN-LAST:event_jtProductsMouseClicked

    private void btnbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbillActionPerformed
        
        System.out.println("Enter in generate button");
        try{
         String ordid=OrderDAO.getNextOrderId();
            System.out.println(ordid);
         if(OrderDAO.addOrder(al, ordid)&& ProductsDAO.updateStocks(al))
         {
             JOptionPane.showMessageDialog(null,"Order of Rs "+grtotal+"/- created sucessfully");
             ViewOrderFrame vr=new ViewOrderFrame();
             vr.setVisible(true);
             this.dispose();
         }
         else {
               JOptionPane.showMessageDialog(null,"Order id not created ");
           }
     }
           catch(SQLException e){
             JOptionPane.showMessageDialog(null,"DB Error","Error !",JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
             
             
        }
             
         
          
    }//GEN-LAST:event_btnbillActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        System.out.println("Enter in actionperforemed of pid");
        if(txtProductId.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter Product id ","Error",JOptionPane.ERROR_MESSAGE);
            return ;
      
        }
        for(int i=0;i<jtProducts.getRowCount();i++){
            if(txtProductId.getText().equals((String)jtProducts.getValueAt(i,0))){
//               int item=(int)jtProducts.getValueAt(i,5);
//               double ourprice=(double)jtProducts.getValueAt(i,4);
//               item+=1;
////             String val=String.valueOf(item);
//               jtProducts.setValueAt(item,i, 5);
//               jtProducts.setValueAt(item*ourprice,i, 7);
               int index=i;
              
               ProductsPojo prd=al.get(index);
             int oldq=(int)tm.getValueAt(index, 5);
             double amount =prd.getOurPrice();
             int tax=prd.getTax();
             amount=amount+amount*tax/100;
             double total=(double)tm.getValueAt(index, 7);
             tm.setValueAt(++oldq,index,5);
             tm.setValueAt(total+amount, index, 7);
             grtotal+=amount;
             prd.setQuantity(oldq);
             prd.setTotal(total+amount);
             al.set(index,prd);
               return ;

            }
               
        }
        loadItemList(txtProductId.getText().trim());
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
      ReceptionistOptionFrame ro= new ReceptionistOptionFrame();
          ro.setVisible(true);
        this.dispose();
      
      
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
            LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbill;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtProducts;
    private javax.swing.JTextField txtProductId;
    // End of variables declaration//GEN-END:variables

    private void loadItemList(String pid) {
        try
        {
         ProductsPojo p=ProductsDAO.getProductDetails(pid) ; 
         if(p.getProductId()==null){
               JOptionPane.showMessageDialog(null,"Please enter a valid Product id ","Error",JOptionPane.ERROR_MESSAGE);
               return;
         }
//         int index=getProductId(pid);
//            System.out.println(pid);
//         if(index==-1)
//         {
             Object[] rows= new Object[8];
             int quan=1;
             double amt=quan*p.getOurPrice();
             p.setQuantity(quan);
             p.setTotal(amt+(amt*p.getTax()/100));
             rows[0]=p.getProductId();
             rows[1]=p.getProductName();
             rows[2]=p.getProductCompany();
             rows[3]=p.getProductPrice();
             rows[4]=p.getOurPrice();
             rows[5]=p.getQuantity();
             rows[6]=p.getTax();
             rows[7]=p.getTotal();
             tm.addRow(rows);
             al.add(p);
             grtotal+=p.getTotal();
//             
////         }
////         else {
          
//             
////         }
        
         }
            catch(SQLException e)
            
          {
             JOptionPane.showMessageDialog(null,"DataBase Error"," Error!",JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
             
             
          }
    }
    private int getProductId(String pid){
        int index =-1;
        for(int i=1;i<=al.size();i++){
            
            ProductsPojo p=al.get(i);
            if(p.getProductId().equals(pid)){
                index=i;
                break;
            }
        }
        return index;
    }
}
