package Calculate;


import java.util.Scanner;

class Square{
    int side;
    public void setSide(int n){
        side = n;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
       return 4*side;
    }
}
class Rectangle{
    int width;
    int height;
    public void setWidth(int n){
        width = n;
    }
    public void setHeight(int n){
        height =n;
    }
    public int area(){
        return width*height;
    }
    public int perimeter(){
        return 2*(width+height);
    }
}
class Circle{
    double PI= 3.1416;
    int radius;
    public void setRadius(int n){
        radius=n;
    }
    public double area(){
        return 4*PI*radius*radius;
    }
    public double perimeter(){
        return 2*PI*radius;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Press 1 for calculate square");
        System.out.println("Press 2 for calculate rectangle");
        System.out.println("Press 3 for calculate circle");
        int userInput= in.nextInt();
        switch (userInput){
            case 1:
                Square obj = new Square();
                System.out.print("Enter the side: ");
                obj.setSide(in.nextInt());
                System.out.println("Area is "+ obj.area());
                System.out.println("Perimeter is "+obj.perimeter());
                break;
            case 2:
                Rectangle obj1= new Rectangle();
                System.out.print("Enter the height: ");
                obj1.setHeight(in.nextInt());
                System.out.print("Enter the width: ");
                obj1.setWidth(in.nextInt());
                System.out.println("Area is "+ obj1.area());
                System.out.println("Perimeter is: "+obj1.perimeter());
                break;
            case 3:
                Circle obj2 =new Circle();
                System.out.print("Enter the radius: ");
                obj2.setRadius(in.nextInt());
                System.out.println("Area is: "+ obj2.area());
                System.out.println("Perimeter is: "+ obj2.perimeter());
                break;
            default:
                System.out.println("Wrong input. Try again later.");
                break;
        }
    }
}
