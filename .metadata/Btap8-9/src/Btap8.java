
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Btap8 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.print("Number1: ");
        a=s.nextInt();
        do{
            System.out.print("Number2: ");
            b=s.nextInt();
        }while(a<b);
        System.out.println("what is "+a+" - "+b);
        c=s.nextInt();
        if(c==(a-b)){
            System.out.println("correct");
        }else{
            System.out.println("wrong");
        }
    }
}
