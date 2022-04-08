/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSV;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        int choose;
        boolean exit = false;
        Manager studentManager = new Manager();
        int studentId;
 
        // show menu
        showMenu();
        while(true) {
            choose = scanner.nextInt();
            switch(choose){
                case 1:
                    studentManager.add();
                    break;
                case 2:
                    studentId = studentManager.InputID();
                    studentManager.edit(studentId);
                    break;
                case 3:
                    studentId = studentManager.InputID();
                    studentManager.delete(studentId);
                    break;
                case 4:
                    studentManager.SortGPA();
                    break;
                case 5:
                    studentManager.SortName();
                    break;
                case 6:
                    studentManager.show();
                    break;
                case 0:
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }
 
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
