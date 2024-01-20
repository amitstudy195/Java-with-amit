import java.util.Scanner;

public class BitwiseCompliment {
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Calculating Bitwise Compliment Operator");
        System.out.print("Enter the value for Compliment: ");
        int num=input.nextInt();

        int result= ~num;
        System.out.println("Bitwise Compliment operator "+result);
    }
}
