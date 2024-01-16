import java.util.*;
public class invertedRotated {
    public static void pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the number of roe and columns : ");
            int a = sc.nextInt();
            pattern(a);
        }
    }
}
