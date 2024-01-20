import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Prime number Checker");
        System.out.print("Enter the no: ");
        int num=input.nextInt();
        boolean isPrime=isPrime(num);
        if (isPrime) {
            System.out.println("Your number is Prime");
        }else{
            System.out.println("Your number is not Prime");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        if (num<=1) {
            return false;
        }
        while (i<num) {
            if (num%i==0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
