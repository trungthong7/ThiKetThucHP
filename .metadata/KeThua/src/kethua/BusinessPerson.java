/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author HP
 */
public class BusinessPerson extends Person implements Tax {
    String name;
    String citizenID;
    String phone;
    String email;
    double salary;
    double other_income;
    double business_income;

    public BusinessPerson(String birthday, String gender, String blood_type) {
        super(birthday, gender, blood_type);
    }

    public BusinessPerson(String name, String citizenID, String phone, String email, double salary, double other_income, double business_income, String birthday, String gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.other_income = other_income;
        this.business_income = business_income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getOther_income() {
        return other_income;
    }

    public void setOther_income(double other_income) {
        this.other_income = other_income;
    }

    public double getBusiness_income() {
        return business_income;
    }

    public void setBusiness_income(double business_income) {
        this.business_income = business_income;
    }

    @Override
    public String toString() {
        return "BusinessPerson{" + "name=" + name + ", citizenID=" + citizenID + ", phone=" + phone + ", email=" + email + ", salary=" + salary + ", other_income=" + other_income + ", business_income=" + business_income + '}';
    }    
    
    @Override
    public double payTax(double income, double start_time, double end_time){
        income=business_income+other_income+salary;
        if(income>10){
            return 0.02*income;
        }else{
            return 0;
        }
    }
}
