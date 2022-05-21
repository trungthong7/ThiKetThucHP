/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

import java.util.Comparator;

/**
 *
 * @author HP
 */
public class SortName implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        return a.getName().compareTo(b.getName());
    }
}
