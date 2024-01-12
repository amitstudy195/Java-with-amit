package Besanthtechnology;
import java.util.Scanner;

public class Basicfloat {
    public static void main(String[] args) {
        float Salary;
        String name;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the name value");
        name=obj.nextLine();
        System.out.println("Enter the salary value");
        Salary=obj.nextFloat();
        System.out.println(name+"-"+ Salary);
    }
}
