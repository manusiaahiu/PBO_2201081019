/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi16052023;

public class BukuAlamat {
    private String nama;
    private String alamat;
    private String notelp;
    private String email;
    
    /**
     * Konstruktor untuk kelas BukuAlamat.
     * @param nama Nama dari kontak buku alamat.
     * @param alamat Alamat dari kontak buku alamat.
     * @param notelp Nomor telepon dari kontak buku alamat.
     * @param email Alamat email dari kontak buku alamat.
     * @throws IllegalArgumentException Jika salah satu parameter diinisialisasi dengan nilai null.
     */
    public BukuAlamat(String nama, String alamat, String notelp, String email) {
        if (nama == null || alamat == null || notelp == null || email == null) {
            throw new IllegalArgumentException("Parameter tidak boleh null");
        }
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNotelp() {
        return notelp;
    }
    
    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
