
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Bai_10 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a;
        do{
            System.out.println("nhap phim lua chon");
            System.out.println("nhan 0 de biet thue single filers");
            System.out.println("nhan 1 de biet thue married filing jointly");
            System.out.println("nhan 2 de biet thue married filing separately");
            System.out.println("nhan 3 de biet thue head of household");
            System.out.print("chon: ");
            a=s.nextInt();
        if(a==0){
            System.out.println("thue single filers");
            System.out.println("10%    "+"$0-$8,350");
            System.out.println("15%    "+"$8,351-$33,950");
            System.out.println("25%    "+"$33,951-$82,250");
            System.out.println("28%    "+"$82,251-$171,550");
            System.out.println("33%    "+"$171,551-$372,950");
            System.out.println("35%    "+"$372,951+");
        }else if(a==1){
            System.out.println("thue married filing jointly");
            System.out.println("10%    "+"$0-$16,700");
            System.out.println("15%    "+"$16,701-$67,900");
            System.out.println("25%    "+"$67,901-$137,050");
            System.out.println("28%    "+"$137,051-$208,850");
            System.out.println("33%    "+"$208,851-$372,950");
            System.out.println("35%    "+"$372,951+");
        }else if(a==2){
            System.out.println("thue married filing separately");
            System.out.println("10%    "+"$0-$8,350");
            System.out.println("15%    "+"$8,351-$33,950");
            System.out.println("25%    "+"$33,951-$68,525");
            System.out.println("28%    "+"$68,526-$104,425");
            System.out.println("33%    "+"$104,426-$186,475");
            System.out.println("35%    "+"$186,476+");
        }else if(a==3){
            System.out.println("thue head of household");
            System.out.println("10%    "+"$0-$11,950");
            System.out.println("15%    "+"$11,951-$45,500");
            System.out.println("25%    "+"$45,501-$117,450");
            System.out.println("28%    "+"$117,451-$190,200");
            System.out.println("33%    "+"$190,201-$372,950");
            System.out.println("35%    "+"$372,951+");
        }else{
            System.out.println("khong co vui long nhap lai!!");
        }
        }while(a<0 || a>3);
    }
}
