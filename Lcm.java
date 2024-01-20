import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the LCM");
        System.out.print("Enter the First no: ");
        int first=input.nextInt();
        System.out.print("Enter the Second no: ");
        int second=input.nextInt();
        int lcm=lcm(first,second);
        System.out.println("LCM of two no: "+lcm);

    }
    public static int lcm(int first,int second){
        int i=1;
        while (true) {
            int factor=first*i;
            if (factor%second==0) {
                return factor;
            }
            i++;
        }
    }
}
