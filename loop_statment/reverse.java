import java.util.*;
public class reverse {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number : ");
            int a = sc.nextInt();
            int rev=0;
            System.out.println("the reverse number is : " + a);
            while(a>0){
                int num = a%10;
                System.out.println(num);
                rev=(rev*10)+num;
                a=a/10;

            }
            System.out.println("the reverse number is : " + rev);
        }
}
}
