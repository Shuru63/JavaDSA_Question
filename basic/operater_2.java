import java.util.*;
public class operater_2 {
    public static void main(String argd[]){
        try(Scanner sc= new Scanner(System.in)){
          System.out.println("enter the first number : ");
          int a= sc.nextInt();
          System.out.println("enter the second number : ");
          int b= sc.nextInt();
            int sum =(a*b/a);
            int sum2=(a*(b/a));
            System.out.println("the solutuin of expresion : "+sum);
             System.out.println("the solutuin of expresion : "+sum2);
        }
    }
    
}
