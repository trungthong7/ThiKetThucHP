/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author HP
 */
public class Taxmanagement {
    public static void main(String[] args){
        Student a=new Student("Hoang", "20T12321", "01321342", "fas@131.com", "13", "nam", "o");
        Worker b=new Worker("Trung", "3123", "312321", "31dsad321", 15, 5, "21", "nam", "A");
        BusinessPerson c=new BusinessPerson("ha", "5431", "3213", "dsa213", 15, 10, 5, "15", "nu", "A");
        System.out.println("tien thue Student: "+a.payTax(0, 1, 0));
        System.out.println("tien thue Worker: "+b.payTax(0, 1, 0));
        System.out.println("tien thue BusinessPerson: "+c.payTax(0, 1, 0));
    }
}
