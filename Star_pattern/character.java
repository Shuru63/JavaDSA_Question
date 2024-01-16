import java.util.Scanner;

public class character {
       public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int a = sc.nextInt();
            char ch ='A';
            for(int i= 1; i<=a; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
            System.out.println("---------------***--------------");
            for(int i=1; i<=a; i++){
                for(int j=1; j<=a-i+1; j++){
                      System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
}

