import java.util.*;

public class factorial_function {
    public static int fact(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int recursion(int num) {
        if (num == 0) {
            return 1;
        }
        else if (num == 1) {
            return 1;
        }
        else{
            return num*recursion(num-1);
        }
    }

   public static void main(String arg[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("enter the number of factorial");
        int num =sc.nextInt();
        int result=fact(num);
        System.out.println("factorial without recursion");
        System.out.print("the factorial of" + num + " = " + result);
        System.out.println("\nfactorial with recursion");
        System.out.print("the factorial of" + num + " = " + recursion(num));
    }
   }
}
