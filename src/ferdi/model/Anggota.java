/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi.model;

/**
 *
 * @author USER
 */
public class Anggota {
    private String kodeAnggota;
    private String namaAnggota;
    private String Alamat;
    private String jenisKelamin;
    
    
    public Anggota(){
        
    }
    
    public Anggota(String kodeAnggota, String namaAnggota, String Alamat, String jenisKelamain){
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.Alamat = Alamat;
        this.jenisKelamin = jenisKelamain;
    }
    
    public String getkodeAnggota(String kodeAnggota){
        return kodeAnggota;
    }
    
    public void setkodeAnggota(String kodeAnggota){
        this.kodeAnggota = kodeAnggota;
    }

     public String getnamaAnggota(String namaAnggota){
        return namaAnggota;
    }
    
    public void setnamaAnggota(String namaAnggota){
        this.namaAnggota = namaAnggota;
    }
    
     public String getAlamat(String Alamat){
        return Alamat;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
    public String getjenisKelamin(String jenisKelamin){
        return jenisKelamin;
    }
    
    public void setjenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
}
