
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class bai_9 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double a,b,BMI;
        System.out.print("nhap can nang: ");
        a=s.nextDouble();
        System.out.print("nhap chieu cao: ");
        b=s.nextDouble();
        BMI=a/Math.pow(b,2);
        if(BMI<18.5){
            System.out.println("Uderweight");
        }else if(BMI<25){
            System.out.println("Normal");
        }else if(BMI<30){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
