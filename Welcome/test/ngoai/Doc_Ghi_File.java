/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngoai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Doc_Ghi_File {
    public void writeFile() throws IOException {
        Scanner s=new Scanner(System.in);
        FileWriter fi=null;
        try{
            fi=new FileWriter("data.txt");
            String n=s.nextLine();
            fi.write(n);
            
        }catch(IOException e){
            System.out.println(e);
        }finally{
            try {
                fi.close();
            } catch (IOException ex) {
                Logger.getLogger(Doc_Ghi_File.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Success...");
        
    }
    public void readFile(){
        try{
            File f=new File("data.txt");
            if(!f.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader b=new BufferedReader(new FileReader(f));
            String line="";
            int sum=0;
            while((line=b.readLine())!=null){
                System.out.println(line);
            }
            b.close();
            System.out.println("TOng: "+sum);
        }catch(Exception e){
            System.err.println("File loi!");    
        }
    }
    public static void main(String[] args) throws IOException{
        System.out.println("Nhập đường dẫn file: ");
        Doc_Ghi_File a=new Doc_Ghi_File();
        Scanner s=new Scanner(System.in);
            a.writeFile();
        a.readFile();
    }
}
/*
public class CharArrayExample {
    public static void main(String[] ag) throws Exception {
        char[] ary = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
        CharArrayReader reader = new CharArrayReader(ary);
        int k = 0;
        // Read until the end of a file
        while ((k = reader.read()) != -1) {
            char ch = (char) k;
            System.out.print(ch + " : ");
            System.out.println(k);
        }
    }
}
public class CharArrayWriterExample {
    public static void main(String args[]) throws Exception {
        CharArrayWriter out = new CharArrayWriter();
        out.write("Welcome to java.");
        FileWriter f1 = new FileWriter("D:\\a.txt");
        FileWriter f2 = new FileWriter("D:\\b.txt");
        FileWriter f3 = new FileWriter("D:\\c.txt");
        FileWriter f4 = new FileWriter("D:\\d.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Success...");
    }
} 
// ghi nhieu chuoi
import java.io.FileOutputStream;
import java.io.PrintStream;
 
public class PrintStreamExample {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt ");
        PrintStream pout = new PrintStream(fout);
        pout.println(2016);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
        System.out.println("Success...");
    }
}
*/