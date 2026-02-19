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
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Database URL using your specific DB name: sales_systemdb
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales_systemdb", "root", "16534237");
            
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
        return con;
    }
}