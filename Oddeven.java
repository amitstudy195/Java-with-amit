import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("I know who is even or odd");
        System.out.print("Enter the value of integer: ");
        int n=input.nextInt();
        if(n%2==0){
            System.out.println("Entered value is even");
        }else{
            System.out.println("Entered value is odd");
        }
    }
}