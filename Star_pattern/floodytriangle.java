import java.util.*;
public class floodytriangle {
    public static void pattern(int num){
        int count=1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count); 
                count++;
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
