/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi11042023;

/**
 *
 * @author USER
 */
public class TestPassByValue {
    public static void main(String[] args) {
        int i = 10;
        
        //mencetak nilai i
        System.out.println(i);
        
        //memanggil method test
        //passing i pada method test
        test(i);
        
        //mencetak nilai i
        System.out.println(i);
    }
    public static void test ( int j ){
    //merubah nilai parameter j
    j = 33;
    }
}
