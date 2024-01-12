import java.util.Scanner;
public class Swap12 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Welcome to the Swapping app\n");
        System.out.print("Enter the value of A: ");
        int a= inp.nextInt();
        System.out.print("Enter the value of B: ");
        int b= inp.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping: "+"A= "+a+ " B= "+b);
    }}