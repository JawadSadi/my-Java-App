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
//                    JOptionPane.showMessageDialog(null, "dataBase successfully connected" );
                 createSignupTable(con);
                 createHomeTable(con);
               }
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "error in database loading" + e);
           }
       }
       private static void createSignupTable(Connection connection) {
        String createTable = "CREATE TABLE  IF NOT EXISTS signup (id int AUTO_INCREMENT,fullName varchar(255),email varchar(255),password varchar(255))";
 
        try (
                Statement statement = connection.createStatement()) {
            statement.execute(createTable);
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"An error occurred while creating the table: " + e.getMessage());
        }
    }
       private static void createHomeTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS home (id int PRIMARY KEY AUTO_INCREMENT ,firstName varchar(50),lastName varchar(50),gender varchar(50),city varchar(50),age varchar(50),address varchar(100))";
                

        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"An error occurred while creating the table: " + e.getMessage());
        }
    }
}

