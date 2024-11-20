package Encaptulation;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        variable va = new variable();
        System.out.println("Enter employee name: ");
        va.setName(in.nextLine());
        System.out.println("Enter employee salary: ");
        va.setSalary(in.nextInt());
        System.out.println("Employee name is: "+ va.getName());
        System.out.println("Employee salary is: "+va.getSalary());
    }
}
class variable{
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
