package ProjectMethods;

class Box {
    double height, width, depth;
    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }
    void displayVol1(){
        double vol= height*width*depth;
        System.out.println("Volume is: " +vol);
    }
}
public class Solution{
    public static void main(String[] args) {
        Box box1= new Box(10, 20, 30);
        Box box2= new Box(50, 40, 20);
        box1.displayVol1();
        box2.displayVol1();
    }
}
