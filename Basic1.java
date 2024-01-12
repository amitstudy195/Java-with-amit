package Besanthtechnology;
import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        int Salary;
        String name;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name value");
        name=obj.nextLine();
        System.out.println("Enter the salary value");
        Salary=obj.nextInt();
        System.out.println(name+"-"+ Salary);
    }
}
