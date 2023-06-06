package week1;

import java.util.*;
public class student{
    private String name;
    public student(){}

    public student(String name){
        this.name = name;
    }

    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Akshay " + name + "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] s = new student[1];
        for (int i = 0; i < 1; i++) {
            System.out.print("Akshay");
            String name = sc.nextLine();
            s[i] = new student(name);
        }

        System.out.println(Arrays.toString(s));

    }
}