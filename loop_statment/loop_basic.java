import java.util.*;
public class loop_basic {

    // print the number 1 to 10
    public static void print1to10(){
            
            int i =1;
            while(i<=10){
                System.out.println(i);
                i++;
            }
            System.out.println("completed the print number");
        }
        // print the number 10 to 0 reverse
        public static void printReverse(){
            
            int i =10;
            while(i>0){
                System.out.println(i);
                i--;
            }
            System.out.println("completed the print reverse number");
        }
        public static void main(String arg[]){
            System.out.println("Print the 1 to 10 ");
            print1to10();
            System.out.println("Print the 10 to 1 reverse ");
            printReverse();
    }
}
