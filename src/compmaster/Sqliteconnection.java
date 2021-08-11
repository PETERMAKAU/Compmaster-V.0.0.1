/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compmaster;



import java.io.File;
import java.sql.*;
import javax.swing.*;
public class Sqliteconnection {
    //Connection conn = null;
    private static Statement st;
    public static Connection conn;
    
    public static Connection ConnectDb(){
    try{
        
        File file = new File ("temp.db");

  if(file.exists()) //here's how to check
     {
       conn = DriverManager.getConnection("jdbc:sqlite:temp.db");
         System.out.print("This database name already exists");
     }
     else{
           Class.forName("org.sqlite.JDBC");   
           conn = DriverManager.getConnection("jdbc:sqlite:temp.db");
            st = conn.createStatement(); 
           JOptionPane.showMessageDialog(null, "Successful !!");        
           
         
     }
        //jdbc:mysql://192.168.15.25:3306/yourdatabase
        
        return conn;
    }catch (Exception e){
         System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "Ops!! failed to connect.");
       // System.out.println("No network connection");
        return null;
    }
    
    }   
    
    
}