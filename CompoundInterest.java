import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the CompoundInterest");
        System.out.print("Enter the value of Principal: ");
        int p=input.nextInt();
        System.out.print("Enter the value of Rate: ");
        float r=input.nextFloat();
        System.out.print("Enter the value of Time: ");
        float t=input.nextFloat();
        double CompoundInterest=p*Math.pow((1+r/100),t);
        System.out.println("The CompoundInterest is: "+CompoundInterest);
        System.out.println("How much money you give: "+(CompoundInterest+p));
    }
}
