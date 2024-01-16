import java.util.*;
public class operater_3 {
   public static void main(String arg[]){
    try(Scanner sc= new Scanner(System.in)){
        System.out.println("enter the first number : ");
        int a= sc.nextInt();
        System.out.println("enter the second number : ");
        int b= sc.nextInt();
        System.out.println("enter the third number : ");
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println("hello shuru");
        }
        if(a>b && b>c){
            System.out.println("hello shuru");
        }
        if(b>a && b>c){
            System.out.println("hello love");
        }
        if(c>b && c>a){
            System.out.println("hello baby");
        }
    }
   } 
}
