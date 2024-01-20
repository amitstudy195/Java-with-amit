import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Age Group Cateorization");
        System.out.print("What is your age: ");
        int age=input.nextInt();

        if(age>=60){
            System.out.println("You are a Senior citizen");
        }else if(age>=20){
            System.out.println("You are an Adult");
        }else if(age>=13){
            System.out.println("You are a Teen");
        }else{
            System.out.println("You are a Child");
        }
    }
}
