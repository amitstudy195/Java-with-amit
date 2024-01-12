import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.print("Please Enter the first number: ");
        int firstNumber= input.nextInt();
        System.out.print("Please Enter the second number: ");
        int secondNumber= input.nextInt();
        int Multiply= firstNumber*secondNumber;
        System.out.println("Multiply of two number is: "+Multiply);

    }
}