/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferdi.model.controller;

/**
 *
 * @author USER
 */
import ferdi.model.view.*;
import ferdi.model.*;

public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDao();
    }
    
    public void clearForm(){
        formAnggota.gettxtkodeAnggota().setText("");
        formAnggota.gettxtnamaAnggota().setText("");
        formAnggota.gettxtAlamat().setText("");      
        formAnggota.getcbojenisKelamin().removeAllItems();
        formAnggota.getcbojenisKelamin().addItem("L");
        formAnggota.getcbojenisKelamin().addItem("P");
               
    }
    
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setkodeAnggota(formAnggota.gettxtKodeAnggota().getText());
        
    }
    
    public void getAnggota(){
        int index = formAnggota.gettabelAnggota(). getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota!=null){
            formAnggota.gettxtKodeAnggota().
                    setText(anggota.getkodeAnggota());
            formAnggota.gettxtnamaAnggota().
                    setTxt(anggota.getnamaAnggota());           
       }
        
    }   
}
