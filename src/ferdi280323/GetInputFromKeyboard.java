/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi280323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class GetInputFromKeyboard {
    public static void main(String[] args) {
        BufferedReader dataIn = 
                new BufferedReader(
                        new InputStreamReader( System.in) );
    
        String name = "";
        int umur = 0;
        
        try{ 
            System.out.print("Please Enter Your Name:");
            name = dataIn.readLine();
            System.out.print("Please Enter Your Age:");
            umur = Integer.parseInt(dataIn.readLine());
            
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        }
        System.out.println("Hello " + name + "!");
        System.out.println("your age is " + umur + "!");
    }
    
}
