/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class msgBox {

    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message, "", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void alertError(Component parent, String message) {
        String er = "<html><font color='red'>" + message + "</font></html>";
        JOptionPane.showMessageDialog(parent, er, "", JOptionPane.ERROR_MESSAGE);
    }
}
