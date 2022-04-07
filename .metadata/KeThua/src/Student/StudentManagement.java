/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class StudentManagement {
    
    public void nhap(Scanner s, List<Student> student){
        s.nextLine();
        System.out.print("Name: ");
        String name=s.nextLine();
        System.out.print("Gender: ");
        char gender=s.next().charAt(0);
        System.out.print("birth_year: ");
        int birth_year=s.nextInt();
        s.nextLine();
        System.out.print("studentID: ");
        String studentID=s.nextLine();
        System.out.print("nam: ");
        int academic_year=s.nextInt();
        student.add(new Student(studentID, academic_year, name, gender, birth_year));
    }
    
    
    
    public void show(List<Student> student){
        for (Student a: student){
            System.out.println(a);
        }
        System.out.println("----------------------");
    }
    
    public void TimKiemName(List<Student> student, String name){
        for(Student t: student){
            if(name.equals(t.getName())){
                System.out.println(t);
            }
        }
        System.out.println("----------------------");
    }
    
    public void TimNam(List<Student> student, int ns){
        for(Student t: student){
            if(t.equals(t.getBirth_year())){
                System.out.println(t);
                System.out.println("----------------------");
            } 
        }
    }
    
    public static void main(String[] args){
        List<Student> student=new ArrayList();
        Scanner s=new Scanner(System.in);
        StudentManagement a=new StudentManagement();
        System.out.print("nhap so sinh vien: ");
        int n=s.nextInt();
        for(int i=0; i<n; i++){
            a.nhap(s,student);
        }
        System.out.println("Danh sach vua nhap");
        a.show(student);
        s.nextLine();
        System.out.print("Nhap ten can tim kiem: ");
        String name=s.nextLine();
        System.out.println("Danh sach tim kiem");
        a.TimKiemName(student, name);
        System.out.print("Nhap nam sinh: ");
        int ns=s.nextInt();
        System.out.println("Danh sach sinh vien cung nam sinh");
        a.TimNam(student, ns);
    }
}
