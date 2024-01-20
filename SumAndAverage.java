import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Five Subject Marks-");
        System.out.print("Enter the Physics Marks: ");
        float p=input.nextFloat();
        System.out.print("Enter the Chemistry Marks: ");
        float c=input.nextFloat(); 
        System.out.print("Enter the Math Marks: ");
        float m=input.nextFloat();
        System.out.print("Enter the English Marks: ");
        float e=input.nextFloat();
        System.out.print("Enter the Hindi Marks: ");
        float h=input.nextFloat();
        float sum=p+c+m+e+h;
        float Avg=sum/5;
        System.out.println("The sum of all the five subject is: "+sum);
        System.out.println("The average of all the five subject is: "+Avg);
    }
}
