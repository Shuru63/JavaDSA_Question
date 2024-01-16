import java.util.*;
public class numberinverted {
    public static void pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print(j);
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
