/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi280323;

/**
 *
 * @author ferdi
 */
public class latihan43 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int tertinggi;
        
        tertinggi = (number1 > number2)?number1: number2;
        tertinggi = (tertinggi > number3)?tertinggi: number3;
        
        System.out.println("number1 = "+number1);
        System.out.println("number2 = "+number2);
        System.out.println("number3 = "+number3);
        
        System.out.println("angka tertinggi = "+ tertinggi);
    }
}
