import java.util.*;
public class basicloop{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number : ");
            int a = sc.nextInt();
            int i=1;
            while(i<=a){
                System.out.println(i);
                i++;
            }
        }
    }
}