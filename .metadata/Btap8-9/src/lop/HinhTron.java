/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop;

/**
 *
 * @author HP
 */
public class HinhTron {
    double r;

    public HinhTron(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double tinhChuVi(){
        return 2*r*3.14;
    }
    
    public double tinhDienTich(){
        return r*r*3.14;
    }
    
    public void xuatHT(){
        System.out.println("Chu vi hinh tron: "+tinhChuVi());
        System.out.println("dien tich hinh tron: "+tinhDienTich());
    }
}
