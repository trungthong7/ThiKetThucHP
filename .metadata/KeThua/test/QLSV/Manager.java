/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSV;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Manager {
    public static Scanner s=new Scanner(System.in);
    private List<Student> student;
    private final StudentFile sf;

    public Manager() {
        sf=new StudentFile();
        student=sf.read();
    }
    
    private String InputName(){
        System.out.print("Name: ");
        return s.nextLine();
    }
    
    private double InputAge(){
        System.out.print("Age: ");
        return s.nextDouble();
    }
    
    private double InputGpa(){
        System.out.print("Gpa: ");
        return s.nextDouble();
    }
    
    private String InputAddress(){
        System.out.print("Name: ");
        return s.nextLine();
    }
    
    public int InputID(){
        System.out.print("ID Student: ");
        while(true){
            try{
                int id=s.nextInt();
                return id;
            }catch(NumberFormatException e){
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
    public void add(){
        int id = (!student.isEmpty()) ? (student.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = InputName();
        double age = InputAge();
        String address = InputAddress();
        double gpa = InputGpa();
        Student a = new Student(id, name, age, address, gpa);
        student.add(a);
        try {
            sf.write(student);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void edit(int id){
        boolean e=false;
        int size=student.size();
        for(int i=0; i<size; i++){
            if(student.get(i).getId()==id){
                e=true;
                student.get(i).setName(InputName());
                student.get(i).setAge(InputAge());
                student.get(i).setAddress(InputAddress());
                student.get(i).setGpa(InputGpa());
                break;
            }
        }
        if(!e){
            System.out.println("id= not existed."+ id);
        }else{
            try {
                sf.write(student);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void delete(int id) {
        Student a=null;
        int size=student.size();
        for (int i = 0; i < size; i++) {
            if (student.get(i).getId() == id) {
                a = student.get(i);
                break;
            }
        }
        if (a != null) {
            try {
                student.remove(a);
                sf.write(student);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("id = not existed."+ id);
        }
    }
    
    public void SortName(){
        Collections.sort(student,new SortName());
    }
    
    public void SortGPA(){
        Collections.sort(student, new SortGPA());
    }
    
    public void show() {
        for (Student a : student) {
            System.out.format("%5d | ", a.getId());
            System.out.format("%20s | ", a.getName());
            System.out.format("%10.1f | ", a.getAge());
            System.out.format("%20s | ", a.getAddress());
            System.out.format("%10.1f%n", a.getGpa());
        }
    }
    
    public List<Student> getStudentList() {
        return student;
    }
 
    public void setStudentList(List<Student> student) {
        this.student = student;
    }
}
