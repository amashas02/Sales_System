/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package sales_system;
package sales_system; // If this file is also in that folder
//package sales_system;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import sales_system.Sales_System;

/**
 *
 * @author USER
 */
public class Sales_System extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try {
        // Step 1: Initialize the theme
        com.formdev.flatlaf.FlatDarkLaf.setup();
        
        // Step 2: Global UI styling
        javax.swing.UIManager.put( "Button.arc", 20 );
        javax.swing.UIManager.put( "Component.arc", 20 );
        
    } catch (Exception ex) {
        System.err.println("Failed to initialize FlatLaf");
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // "this" doesn't work in static main, use the class name
            new Sales_System().setVisible(true); 
        }
    });
    }
    
}

