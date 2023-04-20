/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi04042023;
import javax.swing.JOptionPane;
/**
 *
 * @author ferdi
 */
public class latihan72 {
    public static void main(String[] args) {
        int[] number = new int[10];
        number[0] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1"));
        number[1] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2"));
        number[2] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 3"));
        number[3] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 4"));
        number[4] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 5"));
        number[5] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 6"));
        number[6] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 7"));
        number[7] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 8"));
        number[8] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 9"));
        number[9] = Integer.parseInt(JOptionPane.showInputDialog("Enter number 10"));
        
        int terbesar = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > terbesar) {
                terbesar = number[i];
             }
        }
        String msg ="angka terbesar = " + terbesar;     
        JOptionPane.showMessageDialog(null, msg);
           
 
    }
}
