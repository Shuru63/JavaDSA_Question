import java.util.*;
public class basiclogic_prime {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
          System.out.print("enter the number we check prime or not :");
          int a = sc.nextInt();
          boolean b=true;
          for(int i=2; i<a; i++){
            if(a==2){
              System.out.println("the number is prime "+ a);
            }
            else{
                if(a%i==0){
                    b=false;
                }
            }
        }
            if(!b){
               System.out.println("the number is not prime "+ a);
            }
            else {
                System.out.println("the number is prime "+ a);
            }
          
        }
    }
}
