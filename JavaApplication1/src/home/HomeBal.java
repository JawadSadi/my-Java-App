/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home;
import dataBase.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hi
 */
public class HomeBal {
    
    
    
    // method for load readdata from home table
    
    public List<HomeBean> loadData(){
    
        List<HomeBean> list = new ArrayList<HomeBean>();
        try {
            // query for select all data
            String query = "select * from home";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            int id = rs.getInt("id");//get element by column name
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String gender = rs.getString("gender");
            String city = rs.getString("city");
            String age= rs.getString("age");
            String address= rs.getString("address");
                 
                 //HomeBean object
                 
                 HomeBean homeBeanObj = new HomeBean(id,firstName, lastName, gender, city, age, address);
                 list.add(homeBeanObj);//add our obj to the list
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
    // method for inserting
    
    public void insert (HomeBean hBean){
    
        
        try {
            // query insert
            String query = "insert into home values(null,?,?,?,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, hBean.getFirstName());
            ps.setString(2, hBean.getLastName());
            ps.setString(3, hBean.getGender());
            ps.setString(4, hBean.getCity());
            ps.setString(5, hBean.getAge());
            ps.setString(6, hBean.getAddress());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "a record inserted into database");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    
    }
    
    //method for getting data when click on table row
    
    public HomeBean returnDatTOTextField(int iD){
    HomeBean HomeBeanObj = null;
    
        try {
            String query = "select * from home where id = "+iD;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            int id = rs.getInt("id");//get element by column name
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String gender = rs.getString("gender");
            String city = rs.getString("city");
            String age= rs.getString("age");
            String address= rs.getString("address");
            HomeBeanObj = new HomeBean(id, firstName, lastName, gender, city, age, address);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
      return HomeBeanObj;
    }
    
    // method for ubdate
    
    public void ubdate(HomeBean hBean){
    
        try {
            String query = "update home set firstName = ?,lastName = ?,gender = ?,city = ?, age = ?, address = ? where id = ? ";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, hBean.getFirstName());
            ps.setString(2, hBean.getLastName());
            ps.setString(3, hBean.getGender());
            ps.setString(4, hBean.getCity());
            ps.setString(5, hBean.getAge());
            ps.setString(6, hBean.getAddress());
            ps.setInt(7, hBean.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been ubdate successfully");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    // method for delete
    
    public void deleteItem(int iD){
        try {
    String query = "delete from home where id = ? ";
    PreparedStatement ps = DB.con.prepareStatement(query);
    ps.setInt(1, iD);
    ps.executeUpdate();
    JOptionPane.showMessageDialog(null, "one row deleted successfully");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    // method for search
    
   public HomeBean searchTextField(String name){
    HomeBean HomeBeanObj = null;
    
        try {
            String query = "select * from home where firstName = "+name;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            int id = rs.getInt("id");//get element by column name
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String gender = rs.getString("gender");
            String city = rs.getString("city");
            String age= rs.getString("age");
            String address= rs.getString("address");
            HomeBeanObj = new HomeBean(id, firstName, lastName, gender, city, age, address);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
      return HomeBeanObj;
    } 
    
}
