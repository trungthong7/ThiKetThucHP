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
public class Double {
    public static void main(String[] args){
        double a, b;
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=s.nextDouble();
        System.out.print("Nhap b: ");
        b=s.nextDouble();    
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));
        System.out.println("a^b = "+ Math.pow(a,b));
    }

    static double parseDouble(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
