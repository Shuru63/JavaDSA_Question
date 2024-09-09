import java.util.*;
import java.util.Scanner;
public class berfi {
    public static void solidberfi(int num){

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++ ){
               System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++ ){
               System.out.print("*");
            }
            for(int j=1; j<=num-i; j++ ){
               System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=num; i>=1; i--){
            for(int j=1; j<=num-i; j++ ){
               System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++ ){
               System.out.print("*");
            }
            for(int j=1; j<=num-i; j++ ){
               System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the number of roe and columns : ");
            int a = sc.nextInt();
            System.out.println("the solid berfy : ");
            solidberfi(a);
        }
    }
}
