/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataBase;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hi
 */
public class DB {
    public static Connection con = null;
       public static void loadConnection(){
       
       String url = "jdbc:mysql://localhost:3306/crudapp";
       String root = "root";
       String pass = "";
       
           try {
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,root,pass);
               
               if(con != null){
                    JOptionPane.showMessageDialog(null, "dataBase successfully connected" );
               }
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "error in database loading" + e);
           }
       }
}
