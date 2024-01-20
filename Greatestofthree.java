import java.util.Scanner;

public class Greatestofthree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Finding Greatest of Three");
        System.out.print("Enter the First Number: ");
        int first=input.nextInt();
        System.out.print("Enter the Second Number: ");
        int second=input.nextInt();
        System.out.print("Enter the Third Number: ");
        int third=input.nextInt();

        if(first>second && first>third){
            System.out.println(first+" is Greatest no.");
        }else if(second>third){
            System.out.println(second+" is Greatest no.");
        }else{
            System.out.println(third+" is Greatest no.");
        }
    }
}
