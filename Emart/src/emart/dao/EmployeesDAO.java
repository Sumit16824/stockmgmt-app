/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.dao;

import emart.dbutiil.DBConnection;
import emart.pojo.EmployeesPojo;
import emart.pojo.ReceptionistPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import  java.util.List;
import oracle.net.aso.e;
import static oracle.sql.NUMBER.e;

/**
 *
 * @author satishmishra
 */
public class EmployeesDAO {

    public static String getNextEmpId() throws SQLException
    {
      Connection conn = DBConnection.getConnection();
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("select max(empid) from Employees");
      rs.next();
      String empid=rs.getString(1);
      int empno=Integer.parseInt(empid.substring(1));
      empno=empno+1;
      return "E"+empno;
    }
    public static boolean addemployee(EmployeesPojo emp) throws SQLException
    {
         Connection conn = DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("Insert into employees values(?,?,?,?)");
         ps.setString(1,emp.getEmpid());
           ps.setString(2,emp.getEmpname());
             ps.setString(3,emp.getJob());
             ps.setDouble(4,emp.getSalary());
             int result=ps.executeUpdate();
             return result==1;
             
    }
  

    public static List<EmployeesPojo> getAllemployee() throws SQLException
    {
       Connection conn = DBConnection.getConnection();
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("select * from Employees order by empid");
      ArrayList<EmployeesPojo> empList= new ArrayList<>();
      while(rs.next()){
          EmployeesPojo e=new EmployeesPojo();
          e.setEmpid(rs.getString(1));
          e.setEmpname(rs.getString(2));
          e.setJob(rs.getString(3));
          e.setSalary(rs.getDouble(4));
          empList.add(e);

      }
      return empList; 
    }
    public static List<String> getAllEmpId() throws SQLException {
         Connection conn = DBConnection.getConnection();
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("select empid from Employees order by empid");
      ArrayList <String> allId=new ArrayList<String>();
      while(rs.next()){
          allId.add(rs.getString(1));
      }
      return allId;
    }
    public static EmployeesPojo findEmpById (String empid) throws SQLException 
    {
           Connection conn = DBConnection.getConnection();
           PreparedStatement ps=conn.prepareStatement("Select * from Employees where empid =?");
           ps.setString(1, empid);
           ResultSet rs=ps.executeQuery();
           rs.next();
           EmployeesPojo emp=new EmployeesPojo();
           emp.setEmpid(rs.getString(1));
           emp.setEmpname(rs.getString(2));
           emp.setJob(rs.getString(3));
           emp.setSalary(rs.getDouble(4));
           System.out.println(rs.getString(1));
           return emp;
           
    }
    public static boolean UpdateEmployee(EmployeesPojo e) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Update Employees set empname=?,job=?,salary=? where empid=? ");
        ps.setString(1, e.getEmpname());
        ps.setString(2,e.getJob());
        ps.setDouble(3, e.getSalary());
        ps.setString(4,e.getEmpid());
        int x=ps.executeUpdate();
        if( x==0)
            return false ;
        else 
        {
            boolean result=UserDAO.isUserPresent(e.getEmpid());
            if(result==false)
                return true ;
            
       
        ps=conn.prepareStatement("Update users set username=?,usertype=? where empid=? ");
           ps.setString(1, e.getEmpname());
          ps.setString(2, e.getJob());
          ps.setString(3,e.getEmpid());
          int y=ps.executeUpdate();
          return y==1;
           }
 
    }
      public static boolean UpdateEmployee(String empid) throws SQLException{
            Connection conn = DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from employees where empid=? ");
        ps.setString(1, empid);
         int x=ps.executeUpdate();
          return x==1;
      }
      
      
     public static boolean DeleteEmployees(EmployeesPojo e) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Delete Employees where empid=? and empname=? and job=? and salary=? ");
        ps.setString(1, e.getEmpid());
        ps.setString(2,e.getEmpname());
        ps.setString(3, e.getJob());
        ps.setDouble(4,e.getSalary());
        int x=ps.executeUpdate();
        if( x==0)
            return false ;
        else 
        {
            boolean result=UserDAO.isUserPresent(e.getEmpid());
            if(result==false)
                return true ;
            
       
//        ps=conn.prepareStatement("Delete users where userid =? and  username=? and  usertype=? ");
//           ps.setString(1, e.getuserid());
//          ps.setString(2, e.getusername());
//          ps.setString(3,e.getEmpid());
//          int y=ps.executeUpdate();
//          return y==1;
//           }
        }
        return true;
        
    
    }
       public static boolean DeleteEmployees(String empid) throws SQLException{
            Connection conn = DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from employees where empid=? ");
        ps.setString(1, empid);
         int x=ps.executeUpdate();
          return x==1;
      }
  
}
