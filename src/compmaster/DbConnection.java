/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compmaster;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author peter
 */
public class DbConnection {
    Connection conn =null;
    public static Connection ConnectrDb(){
    try{
       
        Class.forName("org.sqlite.JDBC");   
       Connection  conn = DriverManager.getConnection("jdbc:sqlite:temp.db");
      //  Connection conn = DriverManager.getConnection("jdbc:sqlite:Users.sqlite");
       // JOptionPane.showMessageDialog(null, "Connected");
        return conn;
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
  //  return null;
    }
    
}
