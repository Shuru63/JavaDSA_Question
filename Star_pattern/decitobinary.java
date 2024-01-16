import java.util.*;
public class decitobinary {
    public static int decimal(int num){
       int binary=0;
       int pow=0;
       while(num>0){
        int last = num%2;
        binary=(int) (binary + (last *(Math.pow(10, pow))));
        pow++;
        num=num/2;

       }
       return binary;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the binary number to convert into decimal number");
            int a=sc.nextInt();
            int result = decimal(a);
            System.out.println("the decimal number is : " + result);
        }
    }
}
