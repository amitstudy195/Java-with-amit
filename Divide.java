import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.print("Please Enter the first number: ");
        int firstNumber= input.nextInt();
        System.out.print("Please Enter the second number: ");
        int secondNumber= input.nextInt();
        int Divide= firstNumber/secondNumber;
        System.out.println("Divide of two number is: "+Divide);

    }
}