import java.util.*;
import java.util.Scanner;
public class table {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number for table  : ");
            int num=sc.nextInt();
            for(int i=1; i<=10; i++){
                 int tab=num*i;
                 System.out.println(num+" X "+ i + " = "+ tab);
            }
        }
    }
}
