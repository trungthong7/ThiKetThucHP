/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a,b,c, delta, x1, x2;
        System.out.print("nhap a: ");
        a=s.nextDouble();
        System.out.print("nhap b: ");
        b=s.nextDouble();
        System.out.print("nhap c: ");
        c=s.nextDouble();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("pt co vo so nghiem");
                }else{
                    System.out.println("pt vo nghiem");
                }
            }else{
                System.out.println("pt co nghiem duy nhat: "+ (-c/b));
            }
        }else{
            delta = b*b - 4*a*c;
            if(delta > 0) {
            x1 = (-b+Math.sqrt(delta))/(2*a);
            x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("nghiem 1: "+x1+"\n"+"nghiem 2: "+x2);
            }else if(delta==0){
                System.out.println("pt co nghiem kep: "+(-b/(2*a)));
            }else{
                System.out.println("pt vo nghiem");
            }
         }
    }
}