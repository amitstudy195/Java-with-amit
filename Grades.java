import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Checking the grades of a Student");
        System.out.print("Please Enter the marks in percent: ");
        float marks=input.nextFloat();

        if (marks>=90) {
            System.out.println("You got A Grade");
        }else if(marks>=75){
            System.out.println("You got B Grade");
        }else if(marks>=60){
            System.out.println("You got C Grade");
        }else if(marks>=30){
            System.out.println("You got D Grade");
        }else{
            System.out.println("You got F Grade");
        }
    }
}
