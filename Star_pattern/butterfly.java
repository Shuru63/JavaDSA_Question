import java.util.*;
import java.util.Scanner;
public class butterfly {
    public static void titly(int num){
        // part 1
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // part 2
        for(int i=num; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the number of roe and columns : ");
            int a = sc.nextInt();
            titly(a);
        }
    }
}
