import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the SimpleInterest");
        System.out.print("Enter the value of Principal: ");
        int p=input.nextInt();
        System.out.print("Enter the value of Rate: ");
        int r=input.nextInt();
        System.out.print("Enter the value of Time: ");
        int t=input.nextInt();
        int SimpleInterest=(p*r*t)/100;
        System.out.println("The SimpleInterest is: "+SimpleInterest);
        System.out.println("How much money you give: "+(SimpleInterest+p));
    }
}
