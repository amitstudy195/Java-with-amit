import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.print("Please Enter the first number: ");
        int firstNumber= input.nextInt();
        System.out.print("Please Enter the second number: ");
        int secondNumber= input.nextInt();
        int sum= firstNumber+secondNumber;
        System.out.println("Sum of two number is: "+sum);

    }
}
