import java.util.*;
import java.util.Scanner;
public class dowhile {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number");
            
            do{
                 int a=sc.nextInt();
                 if(a%2==0){
                    System.out.println(a);
                   
                    continue;
                 }
                 else{
                    System.out.println(a);
                    break;
                 }
                
            }while(true);
        }
    }
}
