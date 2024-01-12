import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the celsius converter");
        System.out.print("Enter the temp. in Fahrenheit: ");
        float fah=input.nextFloat();
        float cel=(fah-32)*5/9;
        System.out.println("The value of temp. in celsius: "+cel);

 }}
