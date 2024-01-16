import java.util.*;

public class odd_even {
    public static void main(String ars[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int a = sc.nextInt();
            int even = 0;
            int odd=0;
              for (int i = 1; i <= a; i++) {
                if (i % 2 == 0) {
                    even = even + i;
                    System.out.println(i);
                }
                
            }
            System.out.println("the sum of even number"+even);
            for (int i = 1; i <= a; i++) {
                if (i % 2 != 0) {
                    odd=odd + i;
                    System.out.println(i);
                }
               
            }
                System.out.println("the sum of odd number"+odd);
        }
    }
}
