/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi04042023;

/**
 *
 * @author ferdi
 */
public class Aritmatika {
    //fungsi tambah
    public int tambah(int a, int b){
        return(a+b);
    }
    //fungsi cek ganjil
    public boolean cekganjil(int a){
        return(a%2==1);
    }
    public void getganjil(int g){
        
    }
    //fungsi main
    public static void main(String[] args) {
        Aritmatika aritmatika = new Aritmatika();
        int c = aritmatika.tambah(12, 7);
        System.out.println("Nilai C = "+c);
        System.out.println("Ganjil ?"+aritmatika.cekganjil(c));
    }
}
