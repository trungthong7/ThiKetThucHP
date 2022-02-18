/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_may_tinh;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Computer {
    private String ma;
    private String hang;
    private int namsx;
    private double gia;

    public Computer() {
    }

    public Computer(String ma, String hang, int namsx, double gia) {
        this.ma = ma;
        this.hang = hang;
        this.namsx = namsx;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public void nhap(){
        Scanner s= new Scanner(System.in);
        System.out.print("Nhap Ma May: ");
        ma=s.nextLine();
        System.out.print("Nhap Hang San Xuat: ");
        hang=s.nextLine();
        System.out.print("Nhap Nam San Xuat: ");
        namsx=Integer.parseInt(s.nextLine());
        System.out.print("Nhap Gia Ban: ");
        gia=Double.parseDouble(s.nextLine());
    }
    public void xuat(){
        System.out.print(" Ma May: "+ ma + "\n Hang San Xuat: "+ hang +"\n Nam san Xuat: "+ namsx + "\n Gia Ban: "+ gia);
    }
    
}
