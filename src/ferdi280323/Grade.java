/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi280323;

/**
 *
 * @author ferdi
 */
public class Grade {
    public static void main(String[] args) {
        int grade = 92;
        switch(grade){
            case 100:
                System.out.println("Exelent!");
            case 90:
                System.out.println("Good job!");
            case 80:
                System.out.println("Study harder!");
            default:
                System.out.println("Sorry you failed");
        }
    }
}
