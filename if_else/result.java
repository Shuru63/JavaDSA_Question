import java.util.*;
import java.util.Scanner;

public class result {
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter the marks of all subject");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=sc.nextInt();
         int sum = a+b+c+d+e;
         int avg =sum/5;
         System.out.println("the total marks is : " + sum);
         System.out.println("the percentage of total marks "+avg + " %");
          if(avg>60){
            System.out.println("first divison");
                   
        }
        else if(avg>33 && avg<60)
        {
            System.out.println("Second division");
            }

            else{
                System.out.println("fail !");
            }
    }
}
}