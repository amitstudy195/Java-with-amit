import java.util.Scanner;

public class BitwiseXor {
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Calculating Bitwise Xor Operator");
        System.out.print("Enter the First value: ");
        int first=input.nextInt();
        System.out.print("Enter the second value: ");
        int second=input.nextInt();

        int result= first ^ second;
        System.out.println("BitwiseXor operator of first and second "+result);
    }
}
