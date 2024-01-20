import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("Welcome to Multiplication Table"); 
       System.out.print("Enter the number: ");
       int num=input.nextInt();
       PrintMultiplicationTable(num);
    }

    public static void PrintMultiplicationTable(int num){
        int i=1;
        while (i<=10) {
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;
        }
    }
}