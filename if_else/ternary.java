import java.util.*;
public class ternary {
    
    public static void main(String arg[]){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter the number");
            int num=sc.nextInt();
           String type = num % 2==0 ? "even" : "odd";
           System.out.println(type);
                }
    }
}
