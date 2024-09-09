import java.util.*;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args)
    {
    System.out.println("enter the first number");
    try (Scanner sc = new Scanner(System.in)) 
    {
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the third numebr");
        int c = sc.nextInt();
        int sum = a+b+c;
        int avg=sum/3;
        System.out.println("the sum of a + b + c ="+sum);
        System.out.println("the averrage is : " +avg);
    }

    }
}
