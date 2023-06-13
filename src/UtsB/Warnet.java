/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtsB;

/**
 *
 * @author USER
 */
public class Warnet {
    private String KodePlgn;
    private String NamaPlgn;
    private String Jenis;
    private double Tarif;
    private double JamMasuk;
    private double JamKeluar;
    private double Total;
    
    public String getKodePlgn(){
        return KodePlgn;
    }
    public void setKodePlgn(String KodePlgn) {
        this.KodePlgn = KodePlgn;
    }
    public String getNamaPlgn(){
        return NamaPlgn;
    }
    public void setNamaPlgn(String NamaPlgn) {
        this.NamaPlgn = NamaPlgn;
    }
    public String getJenis(){
        switch(Jenis){
            case ("VIP"):
                Tarif = 10000;
            case ("UMUM"):
                Tarif = 15000;
            default:
                System.out.println("Jenis Tidak Tersedia");
        }
        return Jenis;
    }
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    public double getJamKeluar(){
        return JamKeluar;
    }
    public void setKeluar(double JamKeluar) {
        this.JamKeluar = JamKeluar;
    }
    public double getJamMasuk(){
        return JamMasuk;
    }
    public void setJamMasuk(double JamMasuk){
        this.JamMasuk = JamMasuk;
    }
    public double getTarif(){
        return Tarif;
    }
    public void setTarif(double Tarif) {
        this.Tarif = Tarif;
    }
    
    public double getTotal(){
        Total = (JamKeluar - JamMasuk)*Tarif;
        return Total;
    }
    
       
    
}
