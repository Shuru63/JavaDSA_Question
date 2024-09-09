import java.util.*;
import java.util.Scanner;
public class whileloop {
    public static void main(String args[])
{
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("enter the numebr");
        int a = sc.nextInt();
        int i=1,sum=0;
        
        while(i<=a){
            sum=sum+i;
            System.out.println(i);
            i++;
        }
        System.out.println("the sum of total number of 1 to 10"+sum);
    }
}}
