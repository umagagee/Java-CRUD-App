/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author BIGUY
 */
public class connection {
    
    public static Connection conn(){
        
        Connection con;
        
        String user = "root";
        String pass = "";
        String database ="crud";
        String host = "jdbc:mysql://localhost:3306/"+database+"";
        
        try{
            con = DriverManager.getConnection(host, user, pass);
             // JOptionPane.showMessageDialog(null, "Connected");
        return con;
      
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    return null;
    }
    
}
