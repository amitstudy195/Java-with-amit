import java.util.Scanner;

public class BitwiseOr {
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Calculating Bitwise Or Operator");
        System.out.print("Enter the value of First no.: ");
        int first=input.nextInt();
        System.out.print("Enter the second value: ");
        int second=input.nextInt();

        int result= first | second;
        System.out.println("BitwiseOr operator of first and second "+result);
    }
}
