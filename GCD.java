import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the GCD");
        System.out.print("Enter the first no: ");
        int first=input.nextInt();
        System.out.print("Enter the second no: ");
        int second=input.nextInt();
        int gcd=gcd(first,second);
        System.out.println("GCD of the two number is the: ");
    }
    public static int gcd(int first,int second){
        int gcd=1;
        int i=2;
        int least=least(first, second);
        while (i<=least) {
            if (first%i==0 && second%i==0) {
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int first,int second){
        if (first<second) {
            return first;
        }else{
            return second;
        }
    }
}
