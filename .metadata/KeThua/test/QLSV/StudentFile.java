/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSV;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class StudentFile {
    private static final String STUDENT_FILE_NAME = "student.txt";
    public void write(List<Student> studentl) throws FileNotFoundException{
        FileOutputStream fi=null;
        ObjectOutputStream oj=null;
        try{
            fi=new FileOutputStream(new File(STUDENT_FILE_NAME));
            oj = new ObjectOutputStream(fi);
            oj.writeObject(studentl);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            closeStream(fi);
            closeStream(oj);
        }
    }
    
    public List<Student> read(){
        List<Student> studentl=new ArrayList<>();
        FileInputStream fo=null;
        ObjectInputStream oz=null;
        try{
            fo=new FileInputStream(new File(STUDENT_FILE_NAME));
            oz=new ObjectInputStream(fo);
            studentl=(List<Student>) oz.readObject();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }finally{
            closeStream(fo);
            closeStream(oz);
        }
        return studentl;
    }
    
    private void closeStream(InputStream is){
        if(is != null){
            try{
                is.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
    private void closeStream(OutputStream os){
        if(os != null){
            try{
                os.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
