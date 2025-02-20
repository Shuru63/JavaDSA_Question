import java.util.*;

public class FactorLoop {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input number for factor");
        int a = sc.nextInt();
        int i = 1;
        int count = 0;
        while (i < a) {
            if (a % i == 0) {
                System.out.println(i);
                count++;
            }
            i++;

        }
        System.out.println("total number of factor " + a + " is = " + count);
    }
}
