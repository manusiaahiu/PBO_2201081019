/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi04042023;

/**
 *
 * @author USER
 */
public class latihan7_3 {
    public static void main(String[] args) {
        String [][] entry = {{"Florence", "735-1234", "Manila"},{"Joyce", "983-3333", "Quezon City"},
                             {"Becca", "456-3322", "Manila"}};
        
        for (int i = 0; i < entry.length; i++) {
            System.out.println("Name     : " + entry[i][0]);
            System.out.println("Telp#    : " + entry[i][1]);
            System.out.println("Adress   : " + entry[i][2]);
            System.out.println("\n");
        }        
    }
}
