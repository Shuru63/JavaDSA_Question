import java.util.*;
import java.util.Scanner;
public class callby {
    public static void swap_Value(int a ,int b){
         int temp=a;
         a=b;
         b=temp;
         System.out.println("the number is reverse" + a +" and "+ b);
    }
    public static void  callbyref(int a ,int b){
       a=a+b;
       b=a-b;
       a=a-b;         
       System.out.println("the number is reverse" + a +" and "+ b);         
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the two number for swaping");
            int a =sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Swaping of number by call by value");
            swap_Value(a, b);
            System.out.println("Swaping of number by call by value");
            callbyref(a ,b);
        }
    }
}

