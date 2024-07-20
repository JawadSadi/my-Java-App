/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import dataBase.DB;
import java.sql.PreparedStatement;

/**
 *
 * @author hi
 */
public class Bal {
    
    public void insertDataSignup(Bean beanObj){
    // null for primary key;
        try {
            String query = "insert into signup values(null,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, beanObj.getFirstName());
            ps.setString(2, beanObj.getUserName());
            ps.setString(3, beanObj.getPass());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "now you Signup you can go and login");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    // method  which will cheack the signup table
    
    public boolean cheackLogin(String un,String passw){
        boolean b = false;
        try {
            //create query
            String  query = "select email,password From signup where email = '"+un+"' AND password = '"+passw+"'";
            Statement st = DB.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                b = true;
            }else{
                  JOptionPane.showMessageDialog(null, "invalid email or password try again");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return b;
    }
    
}
