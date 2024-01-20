import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float r=input.nextFloat();
        double perimeter=2*pi*r;
        double Area=pi*r*r;
        System.out.println("Perimeter of Circle is: "+perimeter);
        System.out.println("Area of circle is: "+Area);
    }
}
