/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop;

/**
 *
 * @author HP
 */
public class HinhChuNhat {
     double dai, rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    
    public double tinhChuVi(){
        return 2*(dai+rong);
    }
    
    public double tinhDienTich(){
        return dai*rong;
    }
    
    public void xuatHCN(){
        System.out.println("Chu vi HCN: "+tinhChuVi());
        System.out.println("dien tich HCN: "+tinhDienTich());
    }
}
