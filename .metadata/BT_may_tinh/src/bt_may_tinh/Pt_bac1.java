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
public class Pt_bac1 {
   public static void main(String[] args){
       double a=0, b=0;
       double c;
       Scanner s=new Scanner(System.in);
       try{
           System.out.print("nhap a: ");
           a=s.nextDouble();
           System.out.print("nhap b: ");
           b=s.nextDouble();
       }catch(Exception e){
           System.out.println("sai du lieu");
       }
       if(a==0){
           if(b==0){
               System.out.println("phuong trinh vo so nghiem");
           }else{
               System.out.println("phuong trinh vo nghiem");
           }
       }else{
           c=(double)(-b/a);
           System.out.println("nghiem: "+ c);
       }
   }
}
