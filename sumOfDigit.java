// Creates a Program that computes the sum of the Digits of an integer.

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your No.: ");
        number=input.nextInt();
        int sum=SumOfDigit(number);
        
        
        System.out.println("Sum of digit: "+sum);
    }
    public static int SumOfDigit(int number){
        int sum=0;
    while (number>0 && number<=1000) {
            sum+=number%10;
            
            number/=10;
    }
    return sum;
}
}