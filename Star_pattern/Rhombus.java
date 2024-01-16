import java.util.*;
public class Rhombus {
      // solid rhombus
    public static void solid(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // solid hollow rhombus
     public static void solidhollow(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
            if(i==1 || i==num  || j==1 || j==num ){
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
            System.out.print("enter the number of roe and columns : ");
            int a = sc.nextInt();
            System.out.println("the solid rhombus : ");
            solid(a);
             System.out.println("the hollow solid rhombus : ");
             solidhollow(a);
        }
    }
}
