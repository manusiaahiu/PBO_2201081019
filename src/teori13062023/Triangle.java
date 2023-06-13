/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teori13062023;

/**
 *
 * @author USER
 */
public class Triangle extends Shape{
    private int a;
    private int t;
    private double area;
    
    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public int getT() {
        return t;
    }
    
    public void setT(int t) {
        this.t = t;
    }
    
    public String getName(){
        return "Segitiga";
    }
    
    public double getArea(){
        area = 0.5 * a * t;
        return area;
    }
    
}
