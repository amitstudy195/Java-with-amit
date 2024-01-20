import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Calculating Bitwise And Operator");
        System.out.print("Enter the value of First no.: ");
        int first=input.nextInt();
        System.out.print("Enter the second value: ");
        int second=input.nextInt();

        int result= first & second;
        System.out.println("BitwiseAnd operator of first and second "+result);
    }
}
