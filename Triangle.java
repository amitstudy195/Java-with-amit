import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Triangle");
        System.out.print("Enter the value of Base: ");
        int b=input.nextInt();
        System.out.print("Enter the value of Height: ");
        int h=input.nextInt();
        int Area=(b*h)/2;
        System.out.println("The area of triangle is: "+Area);

    }
}
