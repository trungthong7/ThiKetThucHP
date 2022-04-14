/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package file;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class fileReacs {

    public fileReacs() {
    }
    //lien ket tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDirec(String folder){
        File Direc=new File(folder);
        if(Direc.isFile()){
            return null;
        }
        File[] results=Direc.listFiles();
        return results;
    }
    
    //xuat ket qua
    public String show(File[] a){
        StringBuilder s=new StringBuilder();
        for(int i=0; i<a.length; i++){
            s.append(a[i].getPath()).append(File.separator).append(a[i].getName());
            s.append("\n");
        }
        return s.toString();
    }
    
    //loc cac thu muc
    public File[] getSub(File[] a){
        List<File> result=new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i].isDirectory()){
                result.add(a[i]);
            }
        }
        File[] kq=new File[result.size()];
        return result.toArray(kq);
    }
    //loc ra tat ca cac tap tin
    public File[] getFile(File[] a){
        List<File> result=new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i].isFile()){
                result.add(a[i]);
            }
        }
        File[] kq=new File[result.size()];
        return result.toArray(kq);
    }
    
    // duyet de quy xuat tat ca cac tap tin va thu muc
    public void getContent(String f){
        File a=new File(f);
        //dk dung
        if(a.isFile()){
            System.out.println(a.getPath() + File.separator + a.getName());
            return;
        }
        // cau goi de quy
        System.out.println("thu muc: "+f);
        File[] s=a.listFiles();
        for(int i=0; i<s.length; i++){
            getContent(f + File.separator + s[i].getName());
        }
    }
}
