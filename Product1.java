import java.util.Scanner;

public class Product1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.print("Enter the value of A: ");
        float a=input.nextFloat();
        System.out.print("Enter the value of B: ");
        float b=input.nextFloat();
        System.out.println("The Product of A and B is: "+ a*b);

    }
}
