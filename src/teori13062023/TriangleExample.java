/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teori13062023;

/**
 *
 * @author USER
 */
public class TriangleExample {
    public static void main(String[] args) {
        Triangle segitiga = new Triangle();
        segitiga.setA(4);
        segitiga.setT(3);
        System.err.println("Alas dari segitiga = "+ segitiga.getA());
        System.err.println("Tinggi dari segitiga = "+ segitiga.getT());
        System.err.println("Luas Dari segitiga = "+ segitiga.getArea());       
    }
}
