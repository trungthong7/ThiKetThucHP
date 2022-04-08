/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSV;

import java.util.Comparator;

/**
 *
 * @author HP
 */
public class SortGPA implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGpa()>o2.getGpa()){
            return 1;
        }else{
            return -1;
        }
    }
}
