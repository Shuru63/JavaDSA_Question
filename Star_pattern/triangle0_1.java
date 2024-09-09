import java.util.*;
import java.util.Scanner;
public class triangle0_1 {
    public static void triangle(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    } 
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the number of roe and columns : ");
            int a = sc.nextInt();
            triangle(a);
        }
    }
}
