
import java.util.*;
public class sum_ofn {
   public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
        System.out.println("enter the number for factorial");
        int a=sc.nextInt();
        int sum=0;
        for(int i=1; i<=a; i++){
            sum=sum+i;
        }
        System.out.println("the factorial of "+a+" is :"+sum);
     }
   } 
}
