package Employe;

import java.util.Scanner;

class Salary{
    int salary;
    String name;
    public void setName(String n1){
        name = n1;
    }
    public void setSalary(int s){
        salary=s;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Salary properties = new Salary();
        System.out.print("Enter your name: ");
        properties.setName(in.nextLine());
        System.out.print("Enter your Salary: ");
        properties.setSalary(in.nextInt());
        System.out.println("Your name is: "+ properties.getName());
        System.out.println("Your salary is: "+ properties.getSalary());
    }
}
