import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int Num=input.nextInt();
        double Square=Math.pow(Num, 2);
        double Cube=Math.pow(Num, 3);
        System.out.println("Square of a no. is: "+Square);
        System.out.println("Cube of a no. is: "+Cube);
    }
    
}

