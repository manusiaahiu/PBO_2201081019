/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi16052023;

/**
 *
 * @author kali
 */
public class BukuAlamatData {
    
    private BukuAlamat data[] = new BukuAlamat[100];
    private int index;
    
    
    public void insert (BukuAlamat bukuAlamat){
       data [index] = bukuAlamat;
       index++;
        
    }
    
    public void update (int index,BukuAlamat bukuAlamat){
       data [index] = bukuAlamat;
        
    }
    
   public void delete (int index){
       data [index] = null;
    }
   
   public BukuAlamat[] getData(){
       return data;
    }
   
    public static void main(String[] args) {
        BukuAlamatData data = new BukuAlamatData();
        BukuAlamat data1 = new BukuAlamat("ali", "padang", "08973231", "ali@gmail.com");
        data.insert(data1);
        
        BukuAlamat[] temp = data.getData();
        for (int i=0 ;i<temp.length;i++){
            if(temp[i]!= null){
                
                System.out.println("Data ke-->"+(i+1));
                System.out.println("Nama         "+temp[i].getNama());
                System.out.println("alamat       "+temp[i].getAlamat());
                System.out.println("nomor telpon "+temp[i].getNotelp());
                System.out.println("Email        "+temp[i].getEmail());
            
            }
        
        
        }
    }
}
