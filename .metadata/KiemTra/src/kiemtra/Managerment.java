/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Managerment {
    public static Scanner s=new Scanner(System.in);
    
    public void ghi(List<Student> student) throws ParseException {
        try{
            
            FileOutputStream fi=new FileOutputStream("thi.txt");
            ObjectOutputStream ob=new ObjectOutputStream(fi);
            ob.writeObject(student);
            ob.close();
            fi.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public List<Student> doc(List<Student> student){
        try{
            FileInputStream fo=new FileInputStream("thi.txt");
            ObjectInputStream o=new ObjectInputStream(fo);
            List<Student> b=(List<Student>) o.readObject();
            o.close();
            fo.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return student;
    }
    
    public void show(List<Student> student){
        for(Student a: student){
            System.out.print(a);
        }
    }
    
    public void Nhap(List<Student> student) throws ParseException{
        System.out.print("ID: ");
        String studentID=s.nextLine();
        System.out.print("Name: ");
        String name=s.nextLine();
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        System.out.print("birthday: ");
        Date birthday= df.parse(s.nextLine());
        System.out.println("1 Nam");
        System.out.println("2 Nu");
        System.out.print("Gender: ");
        byte gender=Byte.parseByte(s.nextLine());
        System.out.print("major: ");
        String major=s.nextLine();
        System.out.print("enrolledDate: ");
        Date enrolledDate= df.parse(s.nextLine());
        student.add(new Student(studentID, major, enrolledDate, name, birthday, gender));
    }
    
    public static void main(String[] args) throws ParseException {
        List<Student> student=new ArrayList();
        Managerment a=new Managerment();
        while(true){
            a.Nhap(student);
            a.ghi(student);
            a.doc(student);
            a.show(student);
            System.out.print("nhap 0 de dung lai, 1 de tiep tuc: "); 
            int exit=Integer.parseInt(s.nextLine());
            if(exit==0){
                break;
            }
        }
        System.out.println("\nSap xep theo ten");
        Collections.sort(student, new SortName());
        a.show(student);
        System.out.println("\nSap xep theo ngay sinh");
        Collections.sort(student, new SortBirthday());
        a.show(student);
    }
}
