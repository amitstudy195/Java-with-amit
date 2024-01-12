import java.util.Scanner;

public class Shiftoperator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Left and Right Shift Property");
        System.out.println("Enter the first number: ");
        int a= input.nextInt();
        System.out.println("Enter the second Number: ");
        int b= input.nextInt();
        System.out.println("Left Shift operator "+(a<<b));
        System.out.println("Right Shift operator "+(a>>b));
    }
}
