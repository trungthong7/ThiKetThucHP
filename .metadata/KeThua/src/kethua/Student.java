/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author HP
 */
public class Student extends Person implements Tax{
    String name;
    String studentID;
    String phone;
    String email;

    public Student(String name, String studentID, String phone, String email, String birthday, String gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.studentID = studentID;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", studentID=" + studentID + ", phone=" + phone + ", email=" + email + '}';
    }
    
    @Override
    public double payTax(double income, double start_time, double end_time){
        if(income>11){
             return income*0.005;
        }else{
            return 0;
        }
    }
}
