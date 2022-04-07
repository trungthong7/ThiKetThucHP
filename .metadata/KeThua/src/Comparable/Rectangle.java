/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparable;

/**
 *
 * @author HP
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return width*height;
    }
    
    @Override
    public double getPerimeter(){
        return 2*(width+height);
    }
    
    @Override
    public int compareTo(Rectangle c){
        if(getPerimeter()==c.getPerimeter()){
            return 0;
        }else if(getPerimeter()>c.getPerimeter()){
            return 1;
        }else{
            return -1;
        }
    }
}
