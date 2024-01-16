import java.util.*;

public class switch_Stmnt {
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the 1st number : ");
            int a = sc.nextInt();
            System.out.print("enter the operater : ");
            String op = sc.next();
            System.out.print("enter the 2nd number : ");
            int b = sc.nextInt();

            switch (op) {
                case "+":
                    System.out.println("the sum of two number : " + (a + b));
                    break;
                case "-":
                    System.out.println("the subtract of two number : " + (a-b));
                    break;
                case "*":
                    System.out.println("the multiply of two number : " + (a * b));
                    break;
                case "/":
                    System.out.println("the divide of two number : " + (a / b));
                    break;
                case "%":
                    System.out.println("the module of two number : " + (a% b));
                    break;
                default:
                System.out.println("Enter the valid operater ");
                    break;
            }
        }
    }

}
