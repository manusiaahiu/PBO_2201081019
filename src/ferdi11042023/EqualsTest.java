/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi11042023;

/**
 *
 * @author USER
 */
public class EqualsTest {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "free the bound periodicals";
        str2 = str1;
        
        System.out.println("String1: "+str1);
        System.out.println("String2 "+str2);
        System.out.println("Same Object? "+(str1 == str2));
        
        str2 = new String(str1);
        System.out.println("String1: "+str1);
        System.out.println("String2 "+str2);
        System.out.println("Same Object? "+(str1 == str2));
        System.out.println("Same Value? "+str1.equals(str2));
    }
}
