/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author HP
 */
public class SuDungHinhHoc {
    public static void main(String[] args){
        List<Circle> l=new ArrayList();
        for(int i=1; i<=10; i++){
            double d=(Math.random()*((25-5)+1))+5;
            l.add(new Circle(d));
        }
        Collections.sort(l);
        for(Circle a: l){
            System.out.println("Dien tich hinh tron: "+a.getArea());
            System.out.println("Chu vi hinh tron: "+a.getPerimeter());
            System.out.println("----------------------------");
        }
        List<Rectangle> t=new ArrayList();
        for(int i=1; i<=10; i++){
            double width=(Math.random()*((15-1)+1))+1;
            double height=(Math.random()*((35-20)+1))+20;
            t.add(new Rectangle(width, height));
        }
        Collections.sort(t);
        for(Rectangle a: t){
            System.out.println("Dien tich hinh chu nhat: "+a.getArea());
            System.out.println("Chu vi hinh chu nhat: "+a.getPerimeter());
            System.out.println("----------------------------");
        }
    }
}
