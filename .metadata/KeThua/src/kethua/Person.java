/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author HP
 */
abstract class Person {
    String birthday;
    String gender;
    String blood_type;

    public Person(String birthday, String gender, String blood_type) {
        this.birthday = birthday;
        this.gender = gender;
        this.blood_type = blood_type;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    @Override
    public String toString() {
        return "Person{" + "birthday=" + birthday + ", gender=" + gender + ", blood_type=" + blood_type + '}';
    }
    
}
