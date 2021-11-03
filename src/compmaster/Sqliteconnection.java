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
public class Sqliteconnection{
     Connection conn =null;
    static Connection ConnectDb() {
        try{
       
        Class.forName("org.sqlite.JDBC");   
       Connection  conn = DriverManager.getConnection("jdbc:sqlite:temp.db");
      //  Connection conn = DriverManager.getConnection("jdbc:sqlite:Users.sqlite");
        //JOptionPane.showMessageDialog(null, "Connected");
        return conn;
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
   
    
}
