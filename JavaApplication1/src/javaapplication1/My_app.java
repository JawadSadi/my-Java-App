/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import dataBase.DB;
import login.loginFrame;
import home.HomeFrame;



/**
 *
 * @author hi
 */
public class My_app {
    
    public static void main(String[]args){
 
        loginFrame loginObj = new loginFrame();
        loginObj.setVisible(true);

        DB.loadConnection();
}
    
}
