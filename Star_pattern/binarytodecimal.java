import java .util.*;
import java.util.Scanner;
public class binarytodecimal{
    public static int binary(int num){
        int pow=0;
        int dec =0;
        while(num>0){
            int last =num%10;
            dec=(int) (dec+(last*Math.pow(2, pow)));
            pow++;
            num = num/10;
            
        }
        return dec;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the binary number to convert into decimal number");
            int a=sc.nextInt();
            int result = binary(a);
            System.out.println("the decimal number is : " + result);
        }
    }
}