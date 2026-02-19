/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales_system;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
    
    public static Connection mycon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales_systemdb", "root", "16534237");
        } catch (Exception e) {
            System.out.println("Connection Error: " + e);
        }
        return con;
    }
}