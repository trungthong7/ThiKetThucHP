/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CongDon2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=s.nextInt();
        int S=0;
        for(int i=1; i<=n; i++){
            if(i%2==1){
                S+=i;
            } 
        }
        System.out.println("Sum= "+S);
    }
}
