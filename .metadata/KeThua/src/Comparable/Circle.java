/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparable;

/**
 *
 * @author HP
 */
public class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    @Override
    public int compareTo(Circle c){
        if(getArea()==c.getArea()){
            return 0;
        }else if(getArea()>c.getArea()){
            return 1;
        }else{
            return -1;
        }
    }
    
}
