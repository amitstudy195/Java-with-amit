import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Checking the Leap Year");
        System.out.print("Entered value is: ");
        int LY=input.nextInt();

        if (LY%400==0 || (LY%4==0 && LY%100!=0)) {
            System.out.println("Enter value is Leap Year");
        }else{
            System.out.println("Enter value is not Leap Year");
        }
    }
}
