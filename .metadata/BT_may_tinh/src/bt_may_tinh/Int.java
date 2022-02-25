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
public class Int {
    public static void main(String[] args){
        int a, b;
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=s.nextInt();
        System.out.print("Nhap b: ");
        b=s.nextInt();
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));
        System.out.println("a^b = "+ Math.pow(a,b));
    }
}
