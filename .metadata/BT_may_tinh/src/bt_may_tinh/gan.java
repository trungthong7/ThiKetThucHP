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
public class gan {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        double radius = 0;
        double area;
        try{
            System.out.print("radius= ");
            radius= a.nextDouble();
        }catch(Exception e){
            System.out.println("sai du lieu");
        }
        area= radius*radius*3.14159;
        System.out.println("chu vi="+area);
        
    }
    
}

