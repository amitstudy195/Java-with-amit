

import java.util.Scanner;

public class Swap11 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Welcome to the Swapping app\n");
        System.out.print("Enter the value of A: ");
        int a= inp.nextInt();
        System.out.print("Enter the value of B: ");
        int b= inp.nextInt();

        int c=a;
        a=b;
        b=c;

        System.out.println("Swapping Done...");
        System.out.println("Value of A is: "+a);
        System.out.println("Value of B is: "+b);
    }
    
}
