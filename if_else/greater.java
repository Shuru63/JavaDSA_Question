import java.util.*;
import java.util.Scanner;

public class greater {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the first number");
            int a = sc.nextInt();
            System.out.println("enter the Second  number");
            int b = sc.nextInt();
            System.out.println("enter the third number");
            int c = sc.nextInt();
            if (a > b && a > c) {
                System.out.println("a is greater number");

            } else if (b > a && b > c) {
                System.out.println("b is greater number");
            } else if (c > a && c > b) {
                System.out.println("c is greater number");
            } else if (a == b && a > c && b > c) {
                System.out.println("a and b is equal and greater number then c");
            } else if (b == c && c > a && b > a) {
                System.out.println("a and b is equal and greater number then c");
            } else if (b == c && b > a && c > a) {
                System.out.println("a and b is equal and greater number then c");
            } else {
                System.out.println("a, b, and c all are equal");
            }
        }
    }
}
