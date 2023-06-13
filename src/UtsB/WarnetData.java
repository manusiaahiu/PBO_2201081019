/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtsB;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class WarnetData {
    private Warnet data[] = new Warnet [100];
    private int index;
    
    
    public void insert ( Warnet warnet){
       data [index] = warnet;
       index++;       
    }    
    public void update (int index,Warnet warnet){
       data [index] = warnet;        
    }
    public void delete (int index){
       data [index] = null;
    }
    public Warnet[] getData(){
       return data;
    }
    
    public static void main(String[] args) {
        WarnetData data = new WarnetData();
            
        Warnet data1 = new Warnet();
        data1.setKodePlgn("555");
        data1.setNamaPlgn("ferdi syamdri");
        data1.setJenis("UMUM");
        data1.setJamMasuk(13.00);
        data1.setKeluar(15.00);
        data.insert(data1);
        
        
        Warnet[] temp = data.getData();
        for (int i=0 ;i<temp.length;i++){
            if(temp[i]!= null){
                
                System.out.println("Data ke           : "+(i+1));
                System.out.println("Kode Pelanggan    : "+temp[i].getKodePlgn());
                System.out.println("Nama Pelanggan    : "+temp[i].getNamaPlgn());
                System.out.println("Jenis             : "+temp[i].getJenis());
                System.out.println("Tarif             : "+temp[i].getTarif());
                System.out.println("Jam Masuk         : "+temp[i].getJamMasuk());
                System.out.println("Jam Keluar        : "+temp[i].getJamKeluar());
                System.out.println("Total Bayar       : "+temp[i].getTotal());           
            }
        
        
        }
    }
}
