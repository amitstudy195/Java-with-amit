import java.util.Scanner;

public class Numbertest{
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("welcome to the Number testing ");
        System.out.print("Enter the Value of X: ");
        float x=input.nextFloat();

        if(x<0){
            System.out.println("Given no. is Negative");
        }else if(x==0){
           System.out.println("Given no. is Zero");
        }else{
            System.out.println("Given no. is Positive");
        }
}}