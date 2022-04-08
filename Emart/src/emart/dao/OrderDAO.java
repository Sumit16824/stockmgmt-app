
package emart.dao;

import emart.dbutiil.DBConnection;
import emart.pojo.ProductsPojo;
import emart.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderDAO {
            public static String getNextOrderId() throws SQLException
    {
      Connection conn = DBConnection.getConnection();
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("select max(order_id) from orders");
      rs.next();
      String orderid=rs.getString(1);
      if(orderid==null){
          return "O-101";
      }
        System.out.println(orderid);
        
      int productno=Integer.parseInt(orderid.substring(2));
        System.out.println(orderid.substring(2));
      productno=productno+1;
      return "O-"+productno;
    }
    public static boolean addOrder(ArrayList<ProductsPojo>al,String orderid) throws SQLException{
            Connection conn = DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("Insert into orders values(?,?,?,?)");
         int count=0;
         for(ProductsPojo p : al){
             ps.setString(1,orderid);
             ps.setString(2,p.getProductId());
             ps.setInt(3,p.getQuantity());
             ps.setString(4,UserProfile.getUserid());
             count=count+ps.executeUpdate();

         }
         return count==al.size();
      
            
    }
    public static ArrayList<ProductsPojo> viewOrder(String orderid) throws SQLException{
       
          Connection conn = DBConnection.getConnection();
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("Select * from orders where ORDER_ID='"+orderid+"'");
      ArrayList <ProductsPojo> al=new ArrayList();
      while(rs.next())
      {
         ProductsPojo p= ProductsDAO.getProductDetails(rs.getString(2)) ;
         p.setQuantity(rs.getInt(3));
         al.add(p);  
      }
       return al;  
    }
    
     public static ArrayList<String> selectOrder() throws SQLException
     {
       
          Connection conn = DBConnection.getConnection();
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("select distinct order_id from orders");
      ArrayList <String> al=new ArrayList();
      while(rs.next()){
        al.add(rs.getString(1));
       
        
         
      }
       return al;  
    }
    
    
}
