package compmaster;


import java.sql.*;
import javax.swing.*;
public class mysqlconnect {
    Connection conn = null;
    public static Connection ConnectDb(){
    try{
        //jdbc:mysql://192.168.15.25:3306/yourdatabase
        Class.forName("com.mysql.jdbc.Driver");
       // Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.11:3306/istanbul", "istanbul", "your888999000");
       Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/compmaster", "root", "");
        
        return conn;
    }catch (Exception e){
         System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "Ops!! Check your mysql server");
       // System.out.println("No network connection");
        return null;
    }
    
    }   
}