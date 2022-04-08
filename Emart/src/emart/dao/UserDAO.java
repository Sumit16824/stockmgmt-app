/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.dao;

import emart.dbutiil.DBConnection;
import emart.pojo.UserProfile;
import emart.pojo.Userpojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO {
    public static boolean validateUser(Userpojo u)throws SQLException
    {
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
       ps.setString(1, u.getUserid());
       ps.setString(2, u.getPassword());
       ps.setString(3, u.getUsertype());
        System.out.println(u.getUserid()+":"+u.getPassword()+":"+u.getUsertype());
      ResultSet rs=ps.executeQuery();
      if(rs.next())
      {
          String Username=rs.getString(5);
          UserProfile.setUsername(Username);
           System.out.println(u.getUserid()+":"+u.getPassword()+":"+u.getUsertype());
          return true;
      }
      return false;
    }
    public static boolean isUserPresent(String empid)throws SQLException{
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select 1 from users where empid =?");
       ps.setString(1, empid);
        ResultSet rs=ps.executeQuery();
       return rs.next();
    }
    
}
