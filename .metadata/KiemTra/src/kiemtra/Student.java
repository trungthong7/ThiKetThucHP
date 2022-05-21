/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author HP
 */
public class Student extends Person implements Serializable{

    private String studentID;
    private String major;
    private Date enrolledDate;

    public Student() {
    }

    public Student(String studentID, String major, Date enrolledDate, String name, Date birthday, byte gender) {
        super(name, birthday, gender);
        this.studentID = studentID;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        return "studentID= " + studentID + super.toString() + ", major= " + major + ", enrolledDate= " + df.format(enrolledDate)+"\n" ;
    }

}
