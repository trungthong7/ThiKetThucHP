/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.File;

/**
 *
 * @author HP
 */
public class test {
    public static void main(String[] args){
        fileReacs fo=new fileReacs();
//        File[] a=fo.getDirec("D:\\.metadata\\KeThua\\src\\Comparable");
        //System.out.println(fo.show(a));
//        File[] thumuc= fo.getSub(a);
//        System.out.println("danh sach cac thu muc con la");
//        System.out.println(fo.show(thumuc));
//        File[] taptin =fo.getFile(a);
//        System.out.println("Danh Sach cac tap tin la");
//        System.out.println(fo.show(taptin));
         fo.getContent("D:\\.metadata");
    }
}
