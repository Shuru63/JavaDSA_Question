import java.util.*;
import java.util.Scanner;
public class age{
    public static void main(String arg[]){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter the age of person");
            int age=sc.nextInt();
            if(age>=18){
                System.out.println("your are elligible for vote and drive car");
            }
            else {
                System.out.println("your are not elligible for vote and drive car");
            }
           
        }
    }
}