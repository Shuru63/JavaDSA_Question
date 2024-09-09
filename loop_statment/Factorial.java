import java.util.*;
import java.util.Scanner;
public class Factorial {
   public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
        System.out.println("enter the number for factorial");
        int a=sc.nextInt();
        int fact=1;
        for(int i=1; i<=a; i++){
            fact=fact*i;
        }
        System.out.println("the factorial of "+a+" is :"+fact);
     }
   } 
}
