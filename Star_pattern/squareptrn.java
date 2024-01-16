import java.util.*;
public class squareptrn {
    public static void pattern(int num){
       for(int i=1; i<=num; i++){
        for(int j=1; j<=num; j++){
            if(i==1 || i==num || j==1 || j == num){
                System.out.print("*");
                
            }
            else{
                System.out.print(" ");
            }

        }
        System.out.println();
       }
     }
     public static void main(String args[]){
         try(Scanner sc = new Scanner(System.in)){
             System.out.println("enter the binary number to convert into decimal number");
             int a=sc.nextInt();
            pattern(a);
         }
     }
}
