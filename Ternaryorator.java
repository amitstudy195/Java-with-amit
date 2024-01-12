

import java.util.Scanner;

public class Ternaryorator {
    public static void main(String[] args) {
        int a,b,res;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the values");
        a=x.nextInt();
        b=x.nextInt();
        res=(a<b)?(a):(b);

        System.out.println("Result is "+res);
    }
}
