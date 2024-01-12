public import java.util.Scanner;

public class Rectangle2 {

    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("Welcome to perimeter Calculator ");
        System.out.print("Enter the value Length: ");
        int a=input.nextInt();
        System.out.print("Enter the value of Breadth: ");
        int b=input.nextInt(); 

        int Area=a*b;
        System.out.println("Area of Rectangle is: "+Area);
    
}
}