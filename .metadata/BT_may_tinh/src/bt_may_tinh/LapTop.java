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
public class LapTop extends Computer{
    private double can;
    private double dd;
    private String hdh;

    public LapTop() {
    }

    public LapTop(double can, double dd, String hdh, String ma, String hang, int namsx, double gia) {
        super(ma, hang, namsx, gia);
        this.can = can;
        this.dd = dd;
        this.hdh = hdh;
    }

    public double getCan() {
        return can;
    }

    public void setCan(double can) {
        this.can = can;
    }

    public double getDd() {
        return dd;
    }

    public void setDd(double dd) {
        this.dd = dd;
    }

    public String getHdh() {
        return hdh;
    }

    public void setHdh(String hdh) {
        this.hdh = hdh;
    }
    public void nhapLap(){
        Scanner s= new Scanner(System.in);
        System.out.print("Nhap Can Nang: ");
        can=Double.parseDouble(s.nextLine());
        System.out.print("Nhap Do day: ");
        dd=Double.parseDouble(s.nextLine());
        System.out.print("Nhap He Dieu Hanh: ");
        hdh=s.nextLine();
    }
    public void xuatLap(){
        System.out.print("\n Can Nang: "+ can + "\n Do Day: "+ dd +"\n He Dieu Hanh: "+ hdh + "\n");
    }
    
}
