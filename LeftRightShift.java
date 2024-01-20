import java.util.Scanner;

public class LeftRightShift {
         public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Calculating LeftRight Shift Operator");
        System.out.print("Enter the value for: ");
        int num=input.nextInt();

        int result= num<<4 ;
        int res=num>>4;
        System.out.println("Left Shift operator "+result);
        System.out.println("Right Shift Operator"+res);
}}
