/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teori13062023;

/**
 *
 * @author USER
 */
public class Squer extends Shape{
    private int s;
    private int area;
    
    public int getS() {
        return s;
    }
    
    public void setS(int s) {
        this.s = s;
    }
    
    public String getName(){
        return "Persegi";
    }
    
    public double getArea(){
        area = s * s;
        return area;
    }
}
