import java.util.*;
import java.util.Scanner;

public class Operater {
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the first number");
            int a = sc.nextInt();
            System.out.println("enter the first number");
            int b = sc.nextInt();
            int sum = a + b;
            int sub = a - b;
            int mul = a * b;
            int div = a / b;
            int mod = a % b;
            System.out.println("the sum of two number" + sum);
            System.out.println("the sub of two number" + sub);
            System.out.println("the mul of two number" + mul);
            System.out.println("the div of two number" + div);
            System.out.println("the mod of two number" + mod);
             System.out.println(a<b);  
             System.out.println(a>b);  
             System.out.println(a==b);
             System.out.println(a!=b);            
        }
    }
}
