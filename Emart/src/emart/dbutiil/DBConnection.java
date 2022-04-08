
package emart.dbutiil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection {
    private static Connection conn;
    static
    {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-C5DE9KKV:1521/xe", "grocery","123");
            JOptionPane.showMessageDialog(null,"Connection opened sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException e){
             JOptionPane.showMessageDialog(null,"Error in loading the driver","DriverError !",JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
             System.exit(1);
             
        }
        catch(SQLException e)
            
          {
             JOptionPane.showMessageDialog(null,"Error in opening Connection","Database Error!",JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
             System.exit(1);
             
          }
    }
    public static Connection getConnection(){
     
        return conn;
        
    }
    public static void closeConnection()
    {
        try
        {
            conn.close();
             JOptionPane.showMessageDialog(null," Connection closed sucessfully","Sucess!",JOptionPane.INFORMATION_MESSAGE);
            
        }
         catch(SQLException e)
            
          {
             JOptionPane.showMessageDialog(null,"Error in opening Connection","Database Error!",JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
             System.exit(1);
             
          }
        
        
       
        
    }
}
